package com.github.peacetrue.message.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiayx
 */
@Getter
@Setter
@ToString
public class Message<Id, OperatorId> implements Serializable {

    private static final long serialVersionUID = 0L;

    private Id id;
    private String title;
    private String content;
    private String receiverTypeCode;
    private String receiverId;
    private Integer receivedCount;
    private OperatorId creatorId;
    private Date createdTime;

}
