package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerUpdated;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when server gets updated.<br>
 * Provides {@link ServerUpdated} object.
 */
@Getter
public class OnServerUpdated extends ApplicationEvent {
    /** Object containing server parameters and statistics */
    private final ServerUpdated serverUpdated;

    /**
     * Cast the event.
     *
     * @param serverUpdated Object containing event details
     */
    public OnServerUpdated(ServerUpdated serverUpdated) {
        super(serverUpdated);
        this.serverUpdated = serverUpdated;
    }
}
