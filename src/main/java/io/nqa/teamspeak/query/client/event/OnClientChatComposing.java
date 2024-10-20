package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientChatComposing;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientChatComposing extends ApplicationEvent {
    private final ClientChatComposing clientChatComposing;

    public OnClientChatComposing(ClientChatComposing clientChatComposing) {
        super(clientChatComposing);
        this.clientChatComposing = clientChatComposing;
    }
}
