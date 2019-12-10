package com.github.peacetrue.message.service;

import com.github.pagehelper.PageHelper;
import com.github.peacetrue.core.Range;
import com.github.peacetrue.mybatis.dynamic.MybatisDynamicUtils;
import com.github.peacetrue.pagehelper.PageHelperUtils;
import com.github.peacetrue.spring.util.BeanUtils;
import com.github.peacetrue.util.EntityNotFoundException;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.SqlColumn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiayx
 */
public class MessageServiceImpl implements MessageService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public <Id, OperatorId> MessageVO<Id, OperatorId> add(MessageAdd<OperatorId> params) {
        logger.info("新增信息[{}]", params);
        Message<Id, OperatorId> message = new Message<>();
        BeanUtils.copyProperties(params, message);
        if (message.getReceivedCount() == null) {
            message.setReceivedCount(0);
        }
        message.setCreatorId(params.getOperatorId());
        message.setCreatedTime(new Date());
        logger.debug("保存信息[{}]", message);
        int count = messageMapper.insertSelective(message);
        logger.debug("共影响[{}]条记录", count);
        return to(message);
    }

    private <Id, OperatorId> MessageVO<Id, OperatorId> to(Message<Id, OperatorId> message) {
        MessageVO<Id, OperatorId> vo = new MessageVO<>();
        BeanUtils.copyProperties(message, vo);
        return vo;
    }

    @Override
    public <Id, OperatorId> Page<MessageVO<Id, OperatorId>> query(@Nullable MessageQuery params, @Nullable Pageable pageable) {
        logger.info("分页查询信息[{}]", params);
        if (params == null) params = MessageQuery.DEFAULT;
        if (params.getCreatedTime() == null) params.setCreatedTime(new Range.Date());
        if (pageable == null) pageable = new PageRequest(0, 10, new Sort(Sort.Direction.DESC, "createdTime"));
        PageHelper.startPage(pageable.getPageNumber() + 1, pageable.getPageSize());
        List<Message<Id, OperatorId>> entities = messageMapper.<Id, OperatorId>selectByExample()
                .where(MessageDynamicSqlSupport.title, SqlBuilder.isLikeWhenPresent(MybatisDynamicUtils.likeValue(params.getTitle())))
                .and(MessageDynamicSqlSupport.content, SqlBuilder.isEqualToWhenPresent(params.getContent()))
                .and(MessageDynamicSqlSupport.receiverId, SqlBuilder.isEqualToWhenPresent(params.getReceiverId()))
                .and(MessageDynamicSqlSupport.createdTime, SqlBuilder.isGreaterThanOrEqualToWhenPresent(params.getCreatedTime().getLowerBound()))
                .and(MessageDynamicSqlSupport.createdTime, SqlBuilder.isLessThanWhenPresent(MybatisDynamicUtils.endDateValue(params.getCreatedTime().getUpperBound())))
                .orderBy(MybatisDynamicUtils.orders(MessageDynamicSqlSupport.message, pageable.getSort()))
                .build().execute();
        logger.debug("共取得'{}'条记录", entities.size());
        if (entities.isEmpty()) return new PageImpl<>(Collections.emptyList());

        List<MessageVO<Id, OperatorId>> vos = entities.stream().map(this::to).collect(Collectors.toList());
        return new PageImpl<>(vos, pageable, PageHelperUtils.getTotal(entities));
    }

    @Override
    @SuppressWarnings("unchecked")
    public <Id, OperatorId> MessageVO<Id, OperatorId> get(MessageGet<Id, OperatorId> params) {
        logger.info("获取符合条件[{}]的信息", params);
        return messageMapper.<Id, OperatorId>selectByExample()
                .where((SqlColumn<Object>) MessageDynamicSqlSupport.id, SqlBuilder.isEqualTo(params.getId()))
                .build().execute().stream()
                .reduce((l, r) -> r)
                .map(this::to)
                .orElseThrow(() -> new EntityNotFoundException(Message.class, "id", params.getId()));
    }

    @Override
    public <Id, OperatorId> int modify(MessageModify<Id, OperatorId> params) {
        logger.info("修改信息[{}]", params);
        Message<Id, OperatorId> message = new Message<>();
        BeanUtils.copyProperties(params, message);
        int count = messageMapper.updateByPrimaryKeySelective(message);
        logger.debug("共影响[{}]条记录", count);
        return count;
    }

    @Override
    public <T, OperatorId> int delete(MessageDelete<T, OperatorId> params) {
        logger.info("删除信息[{}]", params);
        int count = params.getId().length == 1
                ? messageMapper.deleteByPrimaryKey(params.getId()[0])
                : messageMapper.deleteInPrimaryKey(Arrays.asList(params.getId()));
        logger.debug("共影响[{}]条记录", count);
        return count;
    }
}
