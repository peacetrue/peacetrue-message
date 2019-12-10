package com.github.peacetrue.message.service;

import com.github.peacetrue.core.Range;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xiayx
 */
@Data
@NoArgsConstructor
public class MessageQuery implements Serializable {

    public static final MessageQuery DEFAULT = new MessageQuery();

    private static final long serialVersionUID = 0L;

    private String title;
    private String content;
    private String receiverTypeCode;
    private String receiverId;
    private Integer receivedCount;
    private Range.Date createdTime;


}
