package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.Message;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnMessage extends ApplicationEvent {
    private final Message message;

    public OnMessage(final Message message) {
        super(message);
        this.message = message;
    }
}
