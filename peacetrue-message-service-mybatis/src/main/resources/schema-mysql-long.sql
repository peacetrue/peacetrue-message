drop table if exists message;
CREATE TABLE message
(
    id                 BIGINT AUTO_INCREMENT PRIMARY KEY,
    title              VARCHAR(255)  NOT NULL COMMENT '标题',
    content            VARCHAR(1022) NOT NULL COMMENT '内容',
    receiver_type_code VARCHAR(255)  NOT NULL COMMENT '接收者类型编码：all->所有用户、one->单个用户',
    receiver_id        VARCHAR(255) COMMENT '接收者标识',
    received_count     INTEGER       NOT NULL DEFAULT 0 COMMENT '已接收数目',
    remark             VARCHAR(255) COMMENT '备注',
    created_time       DATETIME      NOT NULL COMMENT '创建时间',
    creator_id         VARCHAR(255)  NOT NULL COMMENT '创建者标识',
    modified_time      TIMESTAMP              DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '修改时间',
    modifier_id        VARCHAR(255)  NOT NULL COMMENT '修改者标识'
);

insert into message (title, content, receiver_type_code, receiver_id, received_count, creator_id, created_time, modified_time, modifier_id)
values ('公告', '明晚服务器升级', '1', '1', 1, 1, '2010-01-01 01:01:01', 1, '2010-01-01 01:01:01');




