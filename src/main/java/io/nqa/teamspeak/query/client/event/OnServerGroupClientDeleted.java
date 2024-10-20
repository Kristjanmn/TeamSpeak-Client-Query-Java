package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerGroupClient;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnServerGroupClientDeleted extends ApplicationEvent {
    private final ServerGroupClient serverGroupClient;

    public OnServerGroupClientDeleted(ServerGroupClient serverGroupClient) {
        super(serverGroupClient);
        this.serverGroupClient = serverGroupClient;
    }
}
