package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupClient;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnServerGroupClientAdded extends ApplicationEvent {
    private final ServerGroupClient serverGroupClient;

    public OnServerGroupClientAdded(ServerGroupClient serverGroupClient) {
        super(serverGroupClient);
        this.serverGroupClient = serverGroupClient;
    }
}
