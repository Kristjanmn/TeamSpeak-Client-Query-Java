package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelUnsubscribed;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnChannelUnsubscribed} event.
 */
@ToString
public class ChannelUnsubscribed extends TeamSpeakNotifyModel {
    /** List of channels */
    public List<Channel> channels;

    /**
     * Create empty ChannelUnsubscribed object.
     */
    public ChannelUnsubscribed() {}

    /**
     * Object with Channel ID.
     */
    @ToString
    public static class Channel {
        /** Channel ID */
        public Integer cid;

        /**
         * Create empty Channel object.
         */
        public Channel() {}
    }
}
