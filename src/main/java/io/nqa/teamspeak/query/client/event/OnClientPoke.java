package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientPoke;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving poke.<br>
 * Provides {@link ClientPoke} object.
 */
@Getter
public class OnClientPoke extends ApplicationEvent {
    /** Object containing poke details */
    private final ClientPoke clientPoke;

    /**
     * Cast the event.
     *
     * @param clientPoke Object containing event details
     */
    public OnClientPoke(ClientPoke clientPoke) {
        super(clientPoke);
        this.clientPoke = clientPoke;
    }
}
