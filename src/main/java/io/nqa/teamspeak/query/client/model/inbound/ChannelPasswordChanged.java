package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelPasswordChanged;
import lombok.ToString;

/**
 * Provided with {@link OnChannelPasswordChanged} event.
 */
@ToString
public class ChannelPasswordChanged extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;

    /**
     * Create empty ChannelPasswordChanged object.
     */
    public ChannelPasswordChanged() {}
}
