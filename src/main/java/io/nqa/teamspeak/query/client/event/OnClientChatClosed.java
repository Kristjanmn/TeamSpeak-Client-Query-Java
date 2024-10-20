package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientChatClosed;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientChatClosed extends ApplicationEvent {
    private final ClientChatClosed clientChatClosed;

    public OnClientChatClosed(ClientChatClosed clientChatClosed) {
        super(clientChatClosed);
        this.clientChatClosed = clientChatClosed;
    }
}
