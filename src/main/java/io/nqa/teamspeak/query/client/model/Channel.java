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
    public int cid;
    /** pid - parent channel ID */
    public int pid;
    /** channel_order - TODO: figure out what it is */
    public int channel_order;
    /** channel_name - name of the channel */
    public String channel_name;
    /** channel_flag_are_subscribed - 1=subscribed */
    public boolean channel_flag_are_subscribed;
    /** total_clients - number of clients currently connected to the channel */
    public int total_clients;
}
