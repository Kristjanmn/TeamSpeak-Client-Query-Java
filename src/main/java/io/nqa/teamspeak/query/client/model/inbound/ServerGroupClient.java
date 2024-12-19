package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnServerGroupClientAdded;
import io.nqa.teamspeak.query.client.event.OnServerGroupClientDeleted;
import lombok.ToString;

/**
 * Provided with {@link OnServerGroupClientAdded} and {@link OnServerGroupClientDeleted} events.
 */
@ToString
public class ServerGroupClient extends TeamSpeakNotifyModel {
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker unique ID */
    public String invokeruid;
    /** Server group ID */
    public Integer sgid;
    /** Client ID */
    public Integer clid;
    /** Client name */
    public String name;
    /** Client unique ID */
    public String cluid;

    /**
     * Create empty ServerGroupClient object.
     */
    public ServerGroupClient() {}
}
