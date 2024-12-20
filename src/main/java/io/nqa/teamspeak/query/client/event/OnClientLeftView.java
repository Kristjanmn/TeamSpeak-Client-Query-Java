package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientLeftView;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a client leaves view.<br>
 * Provides {@link ClientLeftView} object.
 */
@Getter
public class OnClientLeftView extends ApplicationEvent {
    /** Details on the event */
    private final ClientLeftView clientLeftView;

    /**
     * Cast the event.
     *
     * @param clientLeftView Object containing event details
     */
    public OnClientLeftView(ClientLeftView clientLeftView) {
        super(clientLeftView);
        this.clientLeftView = clientLeftView;
    }
}
