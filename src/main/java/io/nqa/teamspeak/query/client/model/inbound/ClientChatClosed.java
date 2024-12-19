package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnClientChatClosed;
import lombok.ToString;

/**
 * Provided with {@link OnClientChatClosed} event.
 */
@ToString
public class ClientChatClosed extends TeamSpeakNotifyModel {
    /** Client ID */
    public Integer clid;
    /** Client Unique ID */
    public String cluid;

    /**
     * Create empty ClientChatClosed object.
     */
    public ClientChatClosed() {}
}
