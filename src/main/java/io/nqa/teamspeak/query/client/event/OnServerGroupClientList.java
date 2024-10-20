package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupClientList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnServerGroupClientList extends ApplicationEvent {
    private final ServerGroupClientList serverGroupClientList;

    public OnServerGroupClientList(ServerGroupClientList serverGroupClientList) {
        super(serverGroupClientList);
        this.serverGroupClientList = serverGroupClientList;
    }
}
