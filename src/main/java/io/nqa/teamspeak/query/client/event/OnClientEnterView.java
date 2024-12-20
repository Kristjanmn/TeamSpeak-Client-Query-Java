package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientEnterView;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a client enters view.<br>
 * Provides {@link ClientEnterView} object.
 */
@Getter
public class OnClientEnterView extends ApplicationEvent {
    /** Details on the event */
    private final ClientEnterView clientEnterView;

    /**
     * Cast the event.
     *
     * @param clientEnterView Object containing event details
     */
    public OnClientEnterView(ClientEnterView clientEnterView) {
        super(clientEnterView);
        this.clientEnterView = clientEnterView;
    }
}
