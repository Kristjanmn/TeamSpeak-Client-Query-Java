package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientMoved extends TeamSpeakNotifyModel {
    public int clid;
    public int reasonid;           // 0 = switched | 1 - moved | 4 - kicked from channel
    public int cfid;
    public int ctid;
    public int invokerid;
    public String invokername;
    public String invokeruid;
    public String reasonmsg;
}
