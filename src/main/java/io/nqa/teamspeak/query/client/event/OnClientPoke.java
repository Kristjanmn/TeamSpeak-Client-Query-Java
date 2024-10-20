package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientPoke;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientPoke extends ApplicationEvent {
    private final ClientPoke clientPoke;

    public OnClientPoke(ClientPoke clientPoke) {
        super(clientPoke);
        this.clientPoke = clientPoke;
    }
}
