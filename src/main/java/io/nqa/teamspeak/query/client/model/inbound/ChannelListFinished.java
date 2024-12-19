package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelListFinished;
import lombok.ToString;

/**
 * Provided with {@link OnChannelListFinished} event.
 */
@ToString
public class ChannelListFinished extends TeamSpeakNotifyModel {
    /**
     * Create empty ChannelListFinished object.
     */
    public ChannelListFinished() {}
}
