package com.github.peacetrue.message.service;

import com.github.peacetrue.core.OperatorCapableImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author xiayx
 */
@Getter
@Setter
@ToString(callSuper = true)
public class MessageModify<Id, OperatorId> extends OperatorCapableImpl<OperatorId> {

    private static final long serialVersionUID = 0L;

    @NotNull
    private Id id;
    @Size(max = 255)
    private String title;
    @Size(max = 1022)
    private String content;
    @Size(max = 255)
    private String receiverTypeCode;
    @Size(max = 255)
    private String receiverId;
    @Max(Integer.MAX_VALUE)
    private Integer receivedCount;

}
