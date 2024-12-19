package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelSubscribed;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnChannelSubscribed} event.
 */
@ToString
public class ChannelSubscribed extends TeamSpeakNotifyModel {
    /** List of channels */
    public List<Channel> channels;

    /**
     * Create empty ChannelSubscribed object.
     */
    public ChannelSubscribed() {}

    /** Channel parameters from event */
    @ToString
    public static class Channel {
        /** Channel ID */
        public Integer cid;
        /** Empty since in seconds */
        public Integer es;

        /**
         * Create empty Channel object.
         */
        public Channel() {}
    }
}
