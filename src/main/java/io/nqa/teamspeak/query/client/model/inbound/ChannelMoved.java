package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.Reason;
import io.nqa.teamspeak.query.client.event.OnChannelMoved;
import lombok.ToString;

/**
 * Provided with {@link OnChannelMoved} event.
 */
@ToString
public class ChannelMoved extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Parent channel ID */
    public Integer cpid;
    /** Channel order */
    public Integer order;
    /** Reason ID. See {@link Reason} */
    public Integer reasonid;
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker unique ID */
    public String invokeruid;

    /**
     * Create empty ChannelMoved object.
     */
    public ChannelMoved() {}
}
