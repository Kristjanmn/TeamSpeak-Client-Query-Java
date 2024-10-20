package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelMoved extends TeamSpeakNotifyModel {
    public int cid;
    public int cpid;
    public int order;
    public int reasonid;
    public int invokerid;
    public String invokername;
    public String invokeruid;
}
