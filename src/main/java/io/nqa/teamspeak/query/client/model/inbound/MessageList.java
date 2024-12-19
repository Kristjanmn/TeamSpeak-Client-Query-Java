package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnMessageList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnMessageList} event.
 */
@ToString
public class MessageList extends TeamSpeakNotifyModel {
    /** List of messages */
    public List<Message> messages;

    /**
     * Create empty MessageList object.
     */
    public MessageList() {}

    /**
     * Object containing message details.
     */
    @ToString
    public static class Message {
        /** Message ID */
        public Integer msgid;
        /** Client unique ID */
        public String cluid;
        /** Message subject */
        public String subject;
        /** Message received timestamp */
        public Long timestamp;
        /** 1 - message has been read */
        public Integer flag_read;

        /**
         * Create empty Message object.
         */
        public Message() {}
    }
}