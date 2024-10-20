package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientLeftView;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientLeftView extends ApplicationEvent {
    private final ClientLeftView clientLeftView;

    public OnClientLeftView(ClientLeftView clientLeftView) {
        super(clientLeftView);
        this.clientLeftView = clientLeftView;
    }
}
