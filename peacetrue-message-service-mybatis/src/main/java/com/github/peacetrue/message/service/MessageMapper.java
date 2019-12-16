package com.github.peacetrue.message.service;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Mapper
public interface MessageMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    @Options(useGeneratedKeys = true, keyProperty = "record.id")
    int insert(InsertStatementProvider<Message> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("MessageResult")
    <Id, OperatorId> Message<Id, OperatorId> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "MessageResult", value = {
            @Result(column = "id", property = "id", id = true),
            @Result(column = "title", property = "title", jdbcType = JdbcType.VARCHAR),
            @Result(column = "content", property = "content", jdbcType = JdbcType.VARCHAR),
            @Result(column = "receiver_type_code", property = "receiverTypeCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "receiver_id", property = "receiverId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "received_count", property = "receivedCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR),
            @Result(column = "creator_id", property = "creatorId"),
            @Result(column = "created_time", property = "createdTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modifier_id", property = "modifierId"),
            @Result(column = "modified_time", property = "modifiedTime", jdbcType = JdbcType.TIMESTAMP),
    })
    <Id, OperatorId> List<Message<Id, OperatorId>> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MessageDynamicSqlSupport.message);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MessageDynamicSqlSupport.message);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Object id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MessageDynamicSqlSupport.message)
                .where((SqlColumn<Object>) MessageDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteInPrimaryKey(Collection<?> id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MessageDynamicSqlSupport.message)
                .where((SqlColumn<Object>) MessageDynamicSqlSupport.id, isIn(id_ instanceof List ? (List<Object>) id_ : new LinkedList<Object>(id_)))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Message record) {
        return insert(SqlBuilder.insert(record)
                .into(MessageDynamicSqlSupport.message)
                .map(MessageDynamicSqlSupport.id).toProperty("id")
                .map(MessageDynamicSqlSupport.title).toProperty("title")
                .map(MessageDynamicSqlSupport.content).toProperty("content")
                .map(MessageDynamicSqlSupport.receiverTypeCode).toProperty("receiverTypeCode")
                .map(MessageDynamicSqlSupport.receiverId).toProperty("receiverId")
                .map(MessageDynamicSqlSupport.receivedCount).toProperty("receivedCount")
                .map(MessageDynamicSqlSupport.remark).toProperty("remark")
                .map(MessageDynamicSqlSupport.creatorId).toProperty("creatorId")
                .map(MessageDynamicSqlSupport.createdTime).toProperty("createdTime")
                .map(MessageDynamicSqlSupport.modifierId).toProperty("modifierId")
                .map(MessageDynamicSqlSupport.modifiedTime).toProperty("modifiedTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Message record) {
        return insert(SqlBuilder.insert(record)
                .into(MessageDynamicSqlSupport.message)
                .map((SqlColumn<Object>) MessageDynamicSqlSupport.id).toPropertyWhenPresent("id", record::getId)
                .map(MessageDynamicSqlSupport.title).toPropertyWhenPresent("title", record::getTitle)
                .map(MessageDynamicSqlSupport.content).toPropertyWhenPresent("content", record::getContent)
                .map(MessageDynamicSqlSupport.receiverTypeCode).toPropertyWhenPresent("receiverTypeCode", record::getReceiverTypeCode)
                .map(MessageDynamicSqlSupport.receiverId).toPropertyWhenPresent("receiverId", record::getReceiverId)
                .map(MessageDynamicSqlSupport.receivedCount).toPropertyWhenPresent("receivedCount", record::getReceivedCount)
                .map(MessageDynamicSqlSupport.remark).toPropertyWhenPresent("remark", record::getRemark)
                .map((SqlColumn<Object>) MessageDynamicSqlSupport.creatorId).toPropertyWhenPresent("creatorId", record::getCreatorId)
                .map(MessageDynamicSqlSupport.createdTime).toPropertyWhenPresent("createdTime", record::getCreatedTime)
                .map((SqlColumn<Object>) MessageDynamicSqlSupport.modifierId).toPropertyWhenPresent("modifierId", record::getModifierId)
                .map(MessageDynamicSqlSupport.modifiedTime).toPropertyWhenPresent("modifiedTime", record::getModifiedTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default <Id, OperatorId> QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Message<Id, OperatorId>>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::<Id, OperatorId>selectMany, MessageDynamicSqlSupport.message.column("*"))
                .from(MessageDynamicSqlSupport.message);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default <Id, OperatorId> QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Message<Id, OperatorId>>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::<Id, OperatorId>selectMany, MessageDynamicSqlSupport.message.column("*"))
                .from(MessageDynamicSqlSupport.message);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Message selectByPrimaryKey(Object id_) {
        return SelectDSL.selectWithMapper(this::selectOne, MessageDynamicSqlSupport.message.column("*"))
                .from(MessageDynamicSqlSupport.message)
                .where((SqlColumn<Object>) MessageDynamicSqlSupport.id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Message record) {
        return UpdateDSL.updateWithMapper(this::update, MessageDynamicSqlSupport.message)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.id).equalTo(record::getId)
                .set(MessageDynamicSqlSupport.title).equalTo(record::getTitle)
                .set(MessageDynamicSqlSupport.content).equalTo(record::getContent)
                .set(MessageDynamicSqlSupport.receiverTypeCode).equalTo(record::getReceiverTypeCode)
                .set(MessageDynamicSqlSupport.receiverId).equalTo(record::getReceiverId)
                .set(MessageDynamicSqlSupport.receivedCount).equalTo(record::getReceivedCount)
                .set(MessageDynamicSqlSupport.remark).equalTo(record::getRemark)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.creatorId).equalTo(record::getCreatorId)
                .set(MessageDynamicSqlSupport.createdTime).equalTo(record::getCreatedTime)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.modifierId).equalTo(record::getModifierId)
                .set(MessageDynamicSqlSupport.modifiedTime).equalTo(record::getModifiedTime)
                ;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Message record) {
        return UpdateDSL.updateWithMapper(this::update, MessageDynamicSqlSupport.message)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.id).equalToWhenPresent(record::getId)
                .set(MessageDynamicSqlSupport.title).equalToWhenPresent(record::getTitle)
                .set(MessageDynamicSqlSupport.content).equalToWhenPresent(record::getContent)
                .set(MessageDynamicSqlSupport.receiverTypeCode).equalToWhenPresent(record::getReceiverTypeCode)
                .set(MessageDynamicSqlSupport.receiverId).equalToWhenPresent(record::getReceiverId)
                .set(MessageDynamicSqlSupport.receivedCount).equalToWhenPresent(record::getReceivedCount)
                .set(MessageDynamicSqlSupport.remark).equalToWhenPresent(record::getRemark)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.creatorId).equalToWhenPresent(record::getCreatorId)
                .set(MessageDynamicSqlSupport.createdTime).equalToWhenPresent(record::getCreatedTime)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.modifierId).equalToWhenPresent(record::getModifierId)
                .set(MessageDynamicSqlSupport.modifiedTime).equalToWhenPresent(record::getModifiedTime)
                ;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Message record) {
        return UpdateDSL.updateWithMapper(this::update, MessageDynamicSqlSupport.message)
                .set(MessageDynamicSqlSupport.title).equalTo(record::getTitle)
                .set(MessageDynamicSqlSupport.content).equalTo(record::getContent)
                .set(MessageDynamicSqlSupport.receiverTypeCode).equalTo(record::getReceiverTypeCode)
                .set(MessageDynamicSqlSupport.receiverId).equalTo(record::getReceiverId)
                .set(MessageDynamicSqlSupport.receivedCount).equalTo(record::getReceivedCount)
                .set(MessageDynamicSqlSupport.remark).equalTo(record::getRemark)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.creatorId).equalTo(record::getCreatorId)
                .set(MessageDynamicSqlSupport.createdTime).equalTo(record::getCreatedTime)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.modifierId).equalTo(record::getModifierId)
                .set(MessageDynamicSqlSupport.modifiedTime).equalTo(record::getModifiedTime)
                .where((SqlColumn<Object>) MessageDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Message record) {
        return UpdateDSL.updateWithMapper(this::update, MessageDynamicSqlSupport.message)
                .set(MessageDynamicSqlSupport.title).equalToWhenPresent(record::getTitle)
                .set(MessageDynamicSqlSupport.content).equalToWhenPresent(record::getContent)
                .set(MessageDynamicSqlSupport.receiverTypeCode).equalToWhenPresent(record::getReceiverTypeCode)
                .set(MessageDynamicSqlSupport.receiverId).equalToWhenPresent(record::getReceiverId)
                .set(MessageDynamicSqlSupport.receivedCount).equalToWhenPresent(record::getReceivedCount)
                .set(MessageDynamicSqlSupport.remark).equalToWhenPresent(record::getRemark)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.creatorId).equalToWhenPresent(record::getCreatorId)
                .set(MessageDynamicSqlSupport.createdTime).equalToWhenPresent(record::getCreatedTime)
                .set((SqlColumn<Object>) MessageDynamicSqlSupport.modifierId).equalToWhenPresent(record::getModifierId)
                .set(MessageDynamicSqlSupport.modifiedTime).equalToWhenPresent(record::getModifiedTime)
                .where((SqlColumn<Object>) MessageDynamicSqlSupport.id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    //append
    @SuppressWarnings("unchecked")
    default <Id, OperatorId> List<Message<Id, OperatorId>> selectById(Collection<Id> ids) {
        return this.<Id, OperatorId>selectByExample().where((SqlColumn<Id>) MessageDynamicSqlSupport.message.id, SqlBuilder.isIn(new ArrayList<>(ids))).build().execute();
    }

}