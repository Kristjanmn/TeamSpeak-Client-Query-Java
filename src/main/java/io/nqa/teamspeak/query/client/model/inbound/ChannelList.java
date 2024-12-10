package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Provided with {@link io.nqa.teamspeak.query.client.event.OnChannelList} event.
 */
@NoArgsConstructor
@ToString
public class ChannelList extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Parent channel ID */
    public Integer cpid;
    /** Channel name */
    public String channel_name;
    /** Channel topic */
    public String channel_topic;
    /** Channel codec. See {@link io.nqa.teamspeak.query.client.Codec} */
    public Integer channel_codec;
    public Integer channel_codec_quality;
    public Integer channel_maxclients;
    public Integer channel_maxfamilyclients;
    public Integer channel_order;
    public Integer channel_flag_permanent;
    public Integer channel_flag_semi_permanent;
    /** 1 = is default channel */
    public Integer channel_flag_default;
    /** 1 = is password protected */
    public Integer channel_flag_password;
    public Integer channel_codec_latency_factor;
    /** 1 = voice is unencrypted */
    public Integer channel_codec_is_unencrypted;
    /** Time in seconds before empty temporary channel gets deleted */
    public Integer channel_delete_delay;
    public String channel_unique_identifier;
    public Integer channel_flag_maxclients_unlimited;
    public Integer channel_flag_maxfamilyclients_unlimited;
    public Integer channel_flag_maxfamilyclients_inherited;
    public Integer channel_needed_talk_power;
    public Integer channel_forced_silence;
    /** Channel name pronunciation */
    public String channel_name_phonetic;
    /** Channel icon */
    public String channel_icon_id;
    /** Channel banner URL */
    public String channel_banner_gfx_url;
    public Integer channel_banner_mode;
}
