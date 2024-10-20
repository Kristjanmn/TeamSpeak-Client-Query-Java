package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelEdited extends TeamSpeakNotifyModel {
    public int cid;
    public String channel_description;
    public int reasonid;
    public int invokerid;
    public String invokername;
    public String invokeruid;
    // Too long for Long
    public String channel_icon_id;
    public int channel_order;
    public int channel_flag_password;
}
