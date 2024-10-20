package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Used for OnServerGroupClientAdded and OnServerGroupClientDeleted
 */
@NoArgsConstructor
@ToString
public class ServerGroupClient extends TeamSpeakNotifyModel {
    public int invokerid;
    public String invokername;
    public String invokeruid;
    public int sgid;
    public int clid;
    public String name;
    public String cluid;
}
