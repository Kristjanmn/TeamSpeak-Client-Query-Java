package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnClientChannelGroupChanged;
import lombok.ToString;

/**
 * Provided with {@link OnClientChannelGroupChanged} event.
 */
@ToString
public class ClientChannelGroupChanged extends TeamSpeakNotifyModel {
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker unique ID */
    public String invokeruid;
    /** Channel group ID */
    public Integer cgid;
    /** Channel group index */
    public Integer cgi;
    /** Channel ID */
    public Integer cid;
    /** Client ID */
    public Integer clid;

    /**
     * Create empty ClientChannelGroupChanged object.
     */
    public ClientChannelGroupChanged() {}
}
