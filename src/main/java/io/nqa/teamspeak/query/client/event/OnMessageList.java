package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.MessageList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving list of messages.<br>
 * Provides {@link MessageList} object.
 */
@Getter
public class OnMessageList extends ApplicationEvent {
    /** Object containing list of messages */
    private final MessageList messageList;

    /**
     * Cast the event.
     *
     * @param messageList Object containing event details
     */
    public OnMessageList(final MessageList messageList) {
        super(messageList);
        this.messageList = messageList;
    }
}
