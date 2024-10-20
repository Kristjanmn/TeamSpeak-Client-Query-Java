package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ServerEdited;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnServerEdited extends ApplicationEvent {
    private final ServerEdited serverEdited;

    public OnServerEdited(ServerEdited serverEdited) {
        super(serverEdited);
        this.serverEdited = serverEdited;
    }
}
