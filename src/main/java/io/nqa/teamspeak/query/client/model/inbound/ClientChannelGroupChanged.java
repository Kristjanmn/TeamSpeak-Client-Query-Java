package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientChannelGroupChanged extends TeamSpeakNotifyModel {
    public Integer invokerid;
    public String invokername;
    public String invokeruid;
    public Integer cgid;
    public Integer cgi;
    public Integer cid;
    public Integer clid;
}
