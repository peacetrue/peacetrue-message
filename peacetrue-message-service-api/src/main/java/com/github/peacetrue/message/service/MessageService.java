package com.github.peacetrue.message.service;

import com.github.peacetrue.result.exception.ResultException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.annotation.Nullable;

/**
 * @author xiayx
 */
public interface MessageService {

    /** 新增 */
    <Id, OperatorId> MessageVO<Id, OperatorId> add(MessageAdd<OperatorId> params) throws ResultException;

    /** 分页查询 */
    <Id, OperatorId> Page<MessageVO<Id, OperatorId>> query(@Nullable MessageQuery params, @Nullable Pageable pageable) throws ResultException;

    /** 获取 */
    <Id, OperatorId> MessageVO<Id, OperatorId> get(MessageGet<Id, OperatorId> params) throws ResultException;

    /** 修改 */
    <Id, OperatorId> int modify(MessageModify<Id, OperatorId> params) throws ResultException;

    /** 删除 */
    <Id, OperatorId> int delete(MessageDelete<Id, OperatorId> params) throws ResultException;
}
