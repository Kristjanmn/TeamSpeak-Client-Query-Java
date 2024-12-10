package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Provided with {@link io.nqa.teamspeak.query.client.event.OnChannelEdited} event.
 */
@NoArgsConstructor
@ToString
public class ChannelEdited extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Channel name */
    public String channel_name;
    /** Channel description */
    public String channel_description;
    /** Reason ID. See {@link io.nqa.teamspeak.query.client.Reason} */
    public Integer reasonid;
    public Integer invokerid;
    public String invokername;
    public String invokeruid;
    public String channel_icon_id;
    public Integer channel_order;
    public Integer channel_flag_password;
}
