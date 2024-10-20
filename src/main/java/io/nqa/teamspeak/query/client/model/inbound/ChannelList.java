package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelList extends TeamSpeakNotifyModel {
    /** Channel ID */
    public int cid;
    /** Parent channel ID */
    public int cpid;
    /** Channel name */
    public String channel_name;     // TODO: This name can include |, make sure TeamSpeakClientQuery#messageVariables is aware of it.
    /** Channel topic */
    public String channel_topic;
    public int channel_codec;
    public int channel_codec_quality;
    public int channel_maxclients;
    public int channel_maxfamilyclients;
    public int channel_order;
    public int channel_flag_permanent;
    public int channel_flag_semi_permanent;
    public int channel_flag_default;
    public int channel_flag_password;
    public int channel_codec_latency_factor;
    public int channel_codec_is_unencrypted;
    public int channel_delete_delay;
    public String channel_unique_identifier;
    public int channel_flag_maxclients_unlimited;
    public int channel_flag_maxfamilyclients_unlimited;
    public int channel_flag_maxfamilyclients_inherited;
    public int channel_needed_talk_power;
    public int channel_forced_silence;
    /** Channel name pronunciation */
    public String channel_name_phonetic;
    public long channel_icon_id;
    /** Channel banner URL */
    public String channel_banner_gfx_url;
    public int channel_banner_mode;
}
