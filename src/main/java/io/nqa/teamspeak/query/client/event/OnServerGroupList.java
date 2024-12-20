package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving list of server groups.<br>
 * Provides {@link ServerGroupList} object.
 */
@Getter
public class OnServerGroupList extends ApplicationEvent {
    /** Object containing list of server groups */
    private final ServerGroupList serverGroupList;

    /**
     * Cast the event.
     *
     * @param serverGroupList Object containing event details
     */
    public OnServerGroupList(ServerGroupList serverGroupList) {
        super(serverGroupList);
        this.serverGroupList = serverGroupList;
    }
}
