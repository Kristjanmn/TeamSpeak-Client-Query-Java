package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.Codec;
import io.nqa.teamspeak.query.client.HostBannerMode;
import io.nqa.teamspeak.query.client.event.OnChannelList;
import lombok.ToString;

/**
 * Provided with {@link OnChannelList} event.
 */
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
    /** Channel codec. See {@link Codec} */
    public Integer channel_codec;
    /** Audio codec quality range from 0 to 10 */
    public Integer channel_codec_quality;
    /** Maximum amount of clients that can be in channel at same time */
    public Integer channel_maxclients;
    /** Maximum amount of clients that this channel and all it's sub-channels can have */
    public Integer channel_maxfamilyclients;
    /** Channel order in family from top */
    public Integer channel_order;
    /** 1 - permanent channel */
    public Integer channel_flag_permanent;
    /** 1 - semi-permanent channel */
    public Integer channel_flag_semi_permanent;
    /** 1 = is default channel */
    public Integer channel_flag_default;
    /** 1 = is password protected */
    public Integer channel_flag_password;
    /** Latency in milliseconds */
    public Integer channel_codec_latency_factor;
    /** 1 = voice is unencrypted */
    public Integer channel_codec_is_unencrypted;
    /** Time in seconds before empty temporary channel gets deleted */
    public Integer channel_delete_delay;
    /** Channel unique identifier */
    public String channel_unique_identifier;
    /** 1 - channel does not have client limit */
    public Integer channel_flag_maxclients_unlimited;
    /** 1 - sub-channels can have unlimited clients */
    public Integer channel_flag_maxfamilyclients_unlimited;
    /** 1 - inherits {@link #channel_maxfamilyclients} from parent */
    public Integer channel_flag_maxfamilyclients_inherited;
    /** Minimum talk power {@code i_client_talk_power} needed to speak in channel */
    public Integer channel_needed_talk_power;
    /** 1 - force silence in the channel */
    public Integer channel_forced_silence;
    /** Channel name pronunciation */
    public String channel_name_phonetic;
    /** Channel icon */
    public String channel_icon_id;
    /** Channel banner URL */
    public String channel_banner_gfx_url;
    /** See {@link HostBannerMode} */
    public Integer channel_banner_mode;

    /**
     * Create empty ChannelList object.
     */
    public ChannelList() {}
}
