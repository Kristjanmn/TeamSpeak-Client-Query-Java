package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnCurrentServerConnectionChanged;
import lombok.ToString;

/**
 * Provided with {@link OnCurrentServerConnectionChanged} event.
 */
@ToString
public class CurrentServerConnectionChanged extends TeamSpeakNotifyModel {
    /**
     * Create empty CurrentServerConnectionChanged object.
     */
    public CurrentServerConnectionChanged() {}
}
