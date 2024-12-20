package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientChatClosed;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when private chat gets closed.<br>
 * Provides {@link ClientChatClosed} object.
 */
@Getter
public class OnClientChatClosed extends ApplicationEvent {
    /** Object containing information on which chat was closed */
    private final ClientChatClosed clientChatClosed;

    /**
     * Cast the event.
     *
     * @param clientChatClosed Object containing event details
     */
    public OnClientChatClosed(ClientChatClosed clientChatClosed) {
        super(clientChatClosed);
        this.clientChatClosed = clientChatClosed;
    }
}
