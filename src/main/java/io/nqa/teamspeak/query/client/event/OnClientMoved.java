package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientMoved;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientMoved extends ApplicationEvent {
    private final ClientMoved clientMoved;

    public OnClientMoved(ClientMoved clientMoved) {
        super(clientMoved);
        this.clientMoved = clientMoved;
    }
}
