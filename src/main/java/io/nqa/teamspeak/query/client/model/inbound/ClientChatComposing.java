package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnClientChatComposing;
import lombok.ToString;

/**
 * Provided with {@link OnClientChatComposing} event.
 */
@ToString
public class ClientChatComposing extends TeamSpeakNotifyModel {
    /** Client ID */
    public Integer clid;
    /** Client Unique ID */
    public String cluid;

    /**
     * Create empty ClientChatComposing object.
     */
    public ClientChatComposing() {}
}
