package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientChatComposing;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when private chat message is being composed.<br>
 * Provides {@link ClientChatComposing} object.
 */
@Getter
public class OnClientChatComposing extends ApplicationEvent {
    /** Details on who is composing message */
    private final ClientChatComposing clientChatComposing;

    /**
     * Cast the event.
     *
     * @param clientChatComposing Object containing event details
     */
    public OnClientChatComposing(ClientChatComposing clientChatComposing) {
        super(clientChatComposing);
        this.clientChatComposing = clientChatComposing;
    }
}
