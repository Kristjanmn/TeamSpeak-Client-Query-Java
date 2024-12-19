package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.Codec;
import io.nqa.teamspeak.query.client.event.OnChannelCreated;
import lombok.ToString;

/**
 * Provided with {@link OnChannelCreated} event.
 */
@ToString
public class ChannelCreated extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Parent channel ID */
    public Integer cpid;
    /** Channel unique identifier */
    public String channel_unique_identifier;
    /** Channel name */
    public String channel_name;
    /** Channel name pronunciation */
    public String channel_name_phonetic;
    /** Channel topic */
    public String channel_topic;
    /** Audio codec {@link Codec} */
    public Integer channel_codec;
    /** Audio codec quality range from 0 to 10 */
    public Integer channel_codec_quality;
    /** 1 - audio is not encrypted */
    public Integer channel_codec_is_unencrypted;
    /** Latency in milliseconds */
    public Integer channel_codec_latency_factor;
    /** Channel order in family from top */
    public Integer channel_order;
    /** Time in seconds before empty temporary channel gets deleted */
    public Integer channel_delete_delay;
    /** 1 - default channel */
    public Integer channel_flag_default;
    /** 1 - permanent channel */
    public Integer channel_flag_permanent;
    /** 1 - semi-permanent channel */
    public Integer channel_flag_semi_permanent;
    /** 1 - channel is password protected */
    public Integer channel_flag_password;
    /** 1 - channel does not have client limit */
    public Integer channel_flag_maxclients_unlimited;
    /** 1 - sub-channels can have unlimited clients */
    public Integer channel_flag_maxfamilyclients_unlimited;
    /** 1 - inherits {@link #channel_maxfamilyclients} from parent */
    public Integer channel_flag_maxfamilyclients_inherited;
    /** Maximum amount of clients that can be in channel at same time */
    public Integer channel_maxclients;
    /** Maximum amount of clients that this channel and all it's sub-channels can have */
    public Integer channel_maxfamilyclients;
    /** Minimum talk power {@code i_client_talk_power} needed to speak in channel */
    public Integer channel_needed_talk_power;
    /** Channel icon ID */
    public String channel_icon_id;
    /** Channel storage quota in bytes */
    public String channel_storage_quota;
    /** Invoker current ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker Unique ID */
    public String invokeruid;

    /**
     * Create empty ChannelCreated object.
     */
    public ChannelCreated() {}
}
