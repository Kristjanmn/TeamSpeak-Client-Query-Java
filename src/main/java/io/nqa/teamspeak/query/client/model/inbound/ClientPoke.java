package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnClientPoke;
import lombok.ToString;

/**
 * Provided with {@link OnClientPoke} event.
 */
@ToString
public class ClientPoke extends TeamSpeakNotifyModel {
    /** ID of the poking client */
    public Integer invokerid;
    /** Name of the poking client */
    public String invokername;
    /** Unique ID of the poking client */
    public String invokeruid;
    /** Message poked with */
    public String msg;

    /**
     * Create empty ClientPoke object.
     */
    public ClientPoke() {}
}
