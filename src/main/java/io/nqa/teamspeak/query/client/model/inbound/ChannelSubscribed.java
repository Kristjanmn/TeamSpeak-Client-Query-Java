package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link io.nqa.teamspeak.query.client.event.OnChannelSubscribed} event.
 */
@NoArgsConstructor
@ToString
public class ChannelSubscribed extends TeamSpeakNotifyModel {
    /** List of channels */
    public List<Channel> channels;

    /** Channel parameters from event */
    @ToString
    public static class Channel {
        /** Channel ID */
        public Integer cid;
        /** Empty since in seconds */
        public Integer es;
    }
}
