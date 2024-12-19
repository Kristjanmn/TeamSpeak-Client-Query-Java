package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnServerEdited;
import lombok.ToString;

/**
 * Provided with {@link OnServerEdited} event.
 */
@ToString
public class ServerEdited extends TeamSpeakNotifyModel {
    /** Reason ID */
    public Integer reasonid;
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker unique ID */
    public String invokeruid;

    /**
     * Create empty ServerEdited object.
     */
    public ServerEdited() {}
}
