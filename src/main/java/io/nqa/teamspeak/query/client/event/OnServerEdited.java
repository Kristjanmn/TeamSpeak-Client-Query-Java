package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerEdited;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when server gets edited.<br>
 * Provides {@link ServerEdited} object.
 */
@Getter
public class OnServerEdited extends ApplicationEvent {
    /** Details on who edited the server */
    private final ServerEdited serverEdited;

    /**
     * Cast the event.
     *
     * @param serverEdited Object containing event details
     */
    public OnServerEdited(ServerEdited serverEdited) {
        super(serverEdited);
        this.serverEdited = serverEdited;
    }
}
