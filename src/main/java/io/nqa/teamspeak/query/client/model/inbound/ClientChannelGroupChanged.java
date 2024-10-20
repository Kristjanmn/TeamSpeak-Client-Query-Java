package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientChannelGroupChanged extends TeamSpeakNotifyModel {
    public int invokerid;
    public String invokername;
    public String invokeruid;
    public int cgid;
    public int cgi;
    public int cid;
    public int clid;
}
