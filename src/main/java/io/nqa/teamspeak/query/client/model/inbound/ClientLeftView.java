package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientLeftView extends TeamSpeakNotifyModel {
    public int cfid;
    public int ctid;
    public int reasonid;
    public String reasonmsg;
    public int clid;
    public long bantime;
    public int invokerid;
    public String invokername;
    public String invokeruid;
}
