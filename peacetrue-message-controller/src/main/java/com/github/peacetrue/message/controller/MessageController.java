package com.github.peacetrue.message.controller;

import com.github.peacetrue.message.service.*;
import com.github.peacetrue.message.service.*;
import com.github.peacetrue.spring.util.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


/**
 * @author xiayx
 */
@RequestMapping(value = "${peacetrue.message.urls.base-path}")
@SuppressWarnings("unchecked")
public class MessageController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private MessageService messageService;

    @ResponseBody
    @PostMapping(value = "${peacetrue.message.urls.add}")
    public MessageVO add(MessageAdd params) {
        logger.info("新增信息[{}]", params);
        return messageService.add(BeanUtils.map(params, MessageAdd.class));
    }

    @ResponseBody
    @GetMapping(value = "${peacetrue.message.urls.query}", params = "page")
    public Page<MessageVO<Object, Object>> query(MessageQuery params,
                                                 @PageableDefault(sort = "createdTime", direction = Sort.Direction.DESC) Pageable pageable) {
        logger.info("分页查询信息[{}]", params);
        return messageService.query(BeanUtils.map(params, MessageQuery.class), pageable);
    }

    @ResponseBody
    @GetMapping(value = "${peacetrue.message.urls.get}", params = {"!page"})
    public MessageVO get(MessageGet params) {
        logger.info("获取信息[{}]详情", params);
        return messageService.get(BeanUtils.map(params, MessageGet.class));
    }

    @ResponseBody
    @PutMapping(value = "${peacetrue.message.urls.modify}")
    public int modify(MessageModify params) {
        logger.info("修改信息[{}]", params);
        return messageService.modify(BeanUtils.map(params, MessageModify.class));
    }

    @ResponseBody
    @DeleteMapping(value = "${peacetrue.message.urls.delete}")
    public int delete(MessageDelete params) {
        logger.info("删除信息[{}]", params);
        return messageService.delete(BeanUtils.map(params, MessageDelete.class));
    }


}
