package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupClientList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving list of clients for a group.<br>
 * Provides {@link ServerGroupClientList} object.
 */
@Getter
public class OnServerGroupClientList extends ApplicationEvent {
    /** Object containing list of clients for given server group */
    private final ServerGroupClientList serverGroupClientList;

    /**
     * Cast the event.
     *
     * @param serverGroupClientList Object containing event details
     */
    public OnServerGroupClientList(ServerGroupClientList serverGroupClientList) {
        super(serverGroupClientList);
        this.serverGroupClientList = serverGroupClientList;
    }
}
