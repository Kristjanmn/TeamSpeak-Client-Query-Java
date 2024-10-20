package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupPermList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnServerGroupPermList extends ApplicationEvent {
    private final ServerGroupPermList serverGroupPermList;

    public OnServerGroupPermList(ServerGroupPermList serverGroupPermList) {
        super(serverGroupPermList);
        this.serverGroupPermList = serverGroupPermList;
    }
}
