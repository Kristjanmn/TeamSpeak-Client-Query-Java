package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.Message;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving a message.<br>
 * Provides {@link Message} object.
 */
@Getter
public class OnMessage extends ApplicationEvent {
    /** Received message */
    private final Message message;

    /**
     * Cast the event.
     *
     * @param message Object containing event details
     */
    public OnMessage(final Message message) {
        super(message);
        this.message = message;
    }
}
