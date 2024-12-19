package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelDeleted;
import lombok.ToString;

/**
 * Provided with {@link OnChannelDeleted} event.
 */
@ToString
public class ChannelDeleted extends TeamSpeakNotifyModel {
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker Unique ID */
    public String invokeruid;
    /** Channel ID */
    public Integer cid;

    /**
     * Create empty ChannelDeleted object.
     */
    public ChannelDeleted() {}
}
