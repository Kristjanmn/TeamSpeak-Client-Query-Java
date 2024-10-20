package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelCreated extends TeamSpeakNotifyModel {
    /** Channel ID */
    public int cid;
    /** Parent channel ID */
    public int cpid;
    /** Channel name */
    public String channel_name;
    /** Channel topic */
    public String channel_topic;
    public int channel_codec_quality;
    public int channel_order;
    public int channel_flag_semi_permanent;
    public int channel_flag_password;
    public int channel_codec_is_unencrypted;
    public int channel_flag_maxfamilyclients_unlimited;
    public int channel_flag_maxfamilyclients_inherited;
    /** Invoker current ID */
    public int invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker Unique ID */
    public String invokeruid;
}
