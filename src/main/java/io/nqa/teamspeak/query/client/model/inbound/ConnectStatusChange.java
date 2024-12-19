package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnConnectStatusChange;
import lombok.ToString;

/**
 * Provided with {@link OnConnectStatusChange} event.
 */
@ToString
public class ConnectStatusChange extends TeamSpeakNotifyModel {
    /** Status */
    public String status;
    /** Error */
    public Integer error;

    /**
     * Create empty ConnectStatusChange object.
     */
    public ConnectStatusChange() {}
}
