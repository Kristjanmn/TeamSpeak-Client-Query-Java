package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupClient;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when client gets removed from a server group.<br>
 * Provides {@link OnServerGroupClientDeleted} object.
 */
@Getter
public class OnServerGroupClientDeleted extends ApplicationEvent {
    /** Details on the event */
    private final ServerGroupClient serverGroupClient;

    /**
     * Cast the event.
     *
     * @param serverGroupClient Object containing event details
     */
    public OnServerGroupClientDeleted(ServerGroupClient serverGroupClient) {
        super(serverGroupClient);
        this.serverGroupClient = serverGroupClient;
    }
}
