package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnServerGroupList extends ApplicationEvent {
    private final ServerGroupList serverGroupList;

    public OnServerGroupList(ServerGroupList serverGroupList) {
        super(serverGroupList);
        this.serverGroupList = serverGroupList;
    }
}
