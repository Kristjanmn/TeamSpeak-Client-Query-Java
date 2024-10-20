package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerUpdated;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnServerUpdated extends ApplicationEvent {
    private final ServerUpdated serverUpdated;

    public OnServerUpdated(ServerUpdated serverUpdated) {
        super(serverUpdated);
        this.serverUpdated = serverUpdated;
    }
}
