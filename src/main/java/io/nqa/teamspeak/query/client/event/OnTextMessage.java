package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.TextMessage;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving a text message.<br>
 * Provides {@link TextMessage} object.
 */
@Getter
public class OnTextMessage extends ApplicationEvent {
    /** Object containing message details */
    private final TextMessage textMessage;

    /**
     * Cast the event.
     *
     * @param textMessage Object containing event details
     */
    public OnTextMessage(TextMessage textMessage) {
        super(textMessage);
        this.textMessage = textMessage;
    }
}
