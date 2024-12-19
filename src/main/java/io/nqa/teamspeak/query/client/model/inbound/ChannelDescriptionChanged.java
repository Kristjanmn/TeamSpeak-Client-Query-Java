package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelDescriptionChanged;
import lombok.ToString;

/**
 * Provided with {@link OnChannelDescriptionChanged} event.
 */
@ToString
public class ChannelDescriptionChanged extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;

    /**
     * Create empty ChannelDescriptionChanged object.
     */
    public ChannelDescriptionChanged() {}
}
