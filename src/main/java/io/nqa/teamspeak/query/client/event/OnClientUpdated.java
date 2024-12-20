package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientUpdated;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when client gets updated.<br>
 * Provides {@link ClientUpdated} object.
 */
@Getter
public class OnClientUpdated extends ApplicationEvent {
    /** Object containing details on updated client */
    private final ClientUpdated clientUpdated;

    /**
     * Cast the event.
     *
     * @param clientUpdated Object containing event details
     */
    public OnClientUpdated(ClientUpdated clientUpdated) {
        super(clientUpdated);
        this.clientUpdated = clientUpdated;
    }
}
