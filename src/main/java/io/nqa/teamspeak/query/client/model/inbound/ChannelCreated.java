package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelCreated extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Parent channel ID */
    public Integer cpid;
    /** Channel name */
    public String channel_name;
    /** Channel topic */
    public String channel_topic;
    public Integer channel_codec_quality;
    public Integer channel_order;
    public Integer channel_flag_semi_permanent;
    public Integer channel_flag_password;
    public Integer channel_codec_is_unencrypted;
    public Integer channel_flag_maxfamilyclients_unlimited;
    public Integer channel_flag_maxfamilyclients_inherited;
    /** Invoker current ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker Unique ID */
    public String invokeruid;
}
