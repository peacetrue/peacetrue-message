package com.github.peacetrue.message.service;

import com.github.peacetrue.spring.util.BeanUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiayx
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestServiceMessageAutoConfiguration.class,
        properties = {"logging.level.com.github.peacetrue.message=debug"})
@Transactional
public class MessageServiceImplTest {

    @Autowired
    private MessageService messageService;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static final MessageAdd<String> MESSAGE_ADD = new MessageAdd<>();

    static {
        MESSAGE_ADD.setTitle("公告");
        MESSAGE_ADD.setContent("明晚系统升级");
        MESSAGE_ADD.setReceiverTypeCode("all");
        MESSAGE_ADD.setOperatorId("1");
    }

    @Test
    public void add() {
        logger.debug("addddd");
        MessageVO<Long, String> vo = messageService.add(MESSAGE_ADD);
        Assert.assertEquals(vo, messageService.<Long, String>get(new MessageGet<>(vo.getId())));
    }

    @Test
    public void query() {
        Page<MessageVO<Long, String>> vos = messageService.query(new MessageQuery(), new PageRequest(0, 1));
        Assert.assertEquals(vos.getTotalElements(), 1);
    }

    @Test
    public void get() {
        MessageVO<Long, String> vo = messageService.get(new MessageGet<>(1L));
        Assert.assertNotNull(vo);
    }

    @Test
    public void modify() {
        MessageVO<Long, String> vo = messageService.get(new MessageGet<>(1L));
        MessageModify<Long, String> modify = new MessageModify<>();
        BeanUtils.copyProperties(vo, modify);
        modify.setTitle("2");
        int count = messageService.modify(modify);
        Assert.assertEquals(count, 1);
        vo = messageService.get(new MessageGet<>(1L));
        Assert.assertEquals(modify.getTitle(), vo.getTitle());
    }

    @Test
    public void delete() {
        int count = messageService.delete(new MessageDelete<>(new Long[]{1L}));
        Assert.assertEquals(count, 1);
    }
}