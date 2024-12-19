package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnTextMessage;
import lombok.ToString;

/**
 * Provided with {@link OnTextMessage} event.
 */
@ToString
public class TextMessage extends TeamSpeakNotifyModel {
    /**
     * 1 - Client<br>
     * 2 - Channel<br>
     * 3 - Server<br>
     */
    public Integer targetmode;
    /** Message */
    public String msg;
    /** Target client ID */
    public Integer target;     // target current client ID - ONLY when targetMode=1
    /** Invoker ID */
    public Integer invokerid;  // invoker current client ID
    /** Invoker name */
    public String invokername;
    /** Invoker unique ID */
    public String invokeruid;


    /**
     * Create empty TextMessage object.
     */
    public TextMessage() {}
}
