package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupPermList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving list of permissions for a given server group.<br>
 * Provides {@link ServerGroupPermList} object.
 */
@Getter
public class OnServerGroupPermList extends ApplicationEvent {
    /** Object containing list of permissions for a specific server group */
    private final ServerGroupPermList serverGroupPermList;

    /**
     * Cast the event.
     *
     * @param serverGroupPermList Object containing event details
     */
    public OnServerGroupPermList(ServerGroupPermList serverGroupPermList) {
        super(serverGroupPermList);
        this.serverGroupPermList = serverGroupPermList;
    }
}
