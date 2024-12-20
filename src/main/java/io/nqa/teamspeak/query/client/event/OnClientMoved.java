package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientMoved;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a client is moved.<br>
 * Provides {@link ClientMoved} object.
 */
@Getter
public class OnClientMoved extends ApplicationEvent {
    /** Details on moved client */
    private final ClientMoved clientMoved;

    /**
     * Cast the event.
     *
     * @param clientMoved Object containing event details
     */
    public OnClientMoved(ClientMoved clientMoved) {
        super(clientMoved);
        this.clientMoved = clientMoved;
    }
}
