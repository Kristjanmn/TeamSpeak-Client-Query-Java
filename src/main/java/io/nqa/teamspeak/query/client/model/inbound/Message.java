package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnMessage;
import lombok.ToString;

/**
 * Provide with {@link OnMessage} event.
 */
@ToString
public class Message extends TeamSpeakNotifyModel {
    /** Message ID */
    public Integer msgid;
    /** Sender unique ID */
    public String cluid;
    /** Message subject */
    public String subject;
    /** Message content */
    public String message;
    /** Message timestamp */
    public Long timestamp;

    /**
     * Create empty Message object.
     */
    public Message() {}
}
