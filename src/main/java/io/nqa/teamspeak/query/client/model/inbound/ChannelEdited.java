package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.Codec;
import io.nqa.teamspeak.query.client.Reason;
import io.nqa.teamspeak.query.client.event.OnChannelEdited;
import lombok.ToString;

/**
 * Provided with {@link OnChannelEdited} event.
 */
@ToString
public class ChannelEdited extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Channel name */
    public String channel_name;
    /** Channel name pronunciation */
    public String channel_name_phonetic;
    /** Channel description */
    public String channel_description;
    /** Channel topic */
    public String channel_topic;
    /** Reason ID. See {@link Reason} */
    public Integer reasonid;
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker unique ID */
    public String invokeruid;
    /** Channel icon ID */
    public String channel_icon_id;
    /** Audio codec {@link Codec} */
    public Integer channel_codec;
    /** Audio codec quality from 0 to 10 */
    public Integer channel_codec_quality;
    /** Latency in milliseconds */
    public Integer channel_codec_latency_factor;
    /** 1 - audio is not encrypted */
    public Integer channel_codec_is_unencrypted;
    /** Channel order in family from top */
    public Integer channel_order;
    /** 1 - default channel */
    public Integer channel_flag_default;
    /** 1 - channel is password protected */
    public Integer channel_flag_password;
    /** 1 - channel is permanent */
    public Integer channel_flag_permanent;
    /** 1 - channel is semi-permanent */
    public Integer channel_flag_semi_permanent;
    /** 1 - channel does not have client limit */
    public Integer channel_flag_maxclients_unlimited;
    /** 1 - sub-channels can have unlimited clients */
    public Integer channel_flag_maxfamilyclients_unlimited;
    /** 1 - inherits {@link #channel_maxfamilyclients} from parent */
    public Integer channel_flag_maxfamilyclients_inherited;
    /** Time in seconds before empty temporary channel gets deleted */
    public Integer channel_delete_delay;
    /** Minimum talk power {@code i_client_talk_power} needed to speak in channel */
    public Integer channel_needed_talk_power;
    /** Maximum amount of clients that can be in channel at same time */
    public Integer channel_maxclients;
    /** Maximum amount of clients that this channel and all it's sub-channels can have */
    public Integer channel_maxfamilyclients;
    /** Channel storage quota in bytes */
    public String channel_storage_quota;
    /** Parent channel ID */
    public Integer cpid;

    /**
     * Create empty ChannelEdited object.
     */
    public ChannelEdited() {}
}
