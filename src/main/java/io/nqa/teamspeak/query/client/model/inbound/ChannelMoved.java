package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelMoved extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    public Integer cpid;
    public Integer order;
    public Integer reasonid;
    public Integer invokerid;
    public String invokername;
    public String invokeruid;
}
