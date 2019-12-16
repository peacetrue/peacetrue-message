package com.github.peacetrue.message.service;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;

public final class MessageDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Message message = new Message();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn id = message.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> title = message.title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> content = message.content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverTypeCode = message.receiverTypeCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> receiverId = message.receiverId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> remark = message.remark;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> receivedCount = message.receivedCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn creatorId = message.creatorId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createdTime = message.createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn modifierId = message.modifierId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> modifiedTime = message.modifiedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Message extends SqlTable {

        public final SqlColumn id = column("id");

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverTypeCode = column("receiver_type_code", JDBCType.VARCHAR);

        public final SqlColumn<String> receiverId = column("receiver_id", JDBCType.VARCHAR);

        public final SqlColumn<Integer> receivedCount = column("received_count", JDBCType.INTEGER);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn creatorId = column("creator_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createdTime = column("created_time", JDBCType.TIMESTAMP);

        public final SqlColumn modifierId = column("modifier_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> modifiedTime = column("modified_time", JDBCType.TIMESTAMP);

        public Message() {
            super("message");
        }
    }
}