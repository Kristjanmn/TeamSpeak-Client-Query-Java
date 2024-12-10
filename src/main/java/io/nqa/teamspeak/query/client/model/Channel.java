package io.nqa.teamspeak.query.client.model;

import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Known properties of the channel.
 * TODO: Find and define all possible variables.
 */
@NoArgsConstructor
@ToString
public class Channel {
    /** cid - channel ID */
    public Integer cid;
    /** pid - parent channel ID */
    public Integer pid;
    /** channel_order - TODO: figure out what it is */
    public Integer channel_order;
    /** channel_name - name of the channel */
    public String channel_name;
    /** channel_flag_are_subscribed - 1=subscribed */
    public Boolean channel_flag_are_subscribed;
    /** total_clients - number of clients currently connected to the channel */
    public Integer total_clients;
}
