package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientUpdated;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientUpdated extends ApplicationEvent {
    private final ClientUpdated clientUpdated;

    public OnClientUpdated(ClientUpdated clientUpdated) {
        super(clientUpdated);
        this.clientUpdated = clientUpdated;
    }
}
