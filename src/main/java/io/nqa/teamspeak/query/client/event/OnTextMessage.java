package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.TextMessage;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnTextMessage extends ApplicationEvent {
    private final TextMessage textMessage;

    public OnTextMessage(TextMessage textMessage) {
        super(textMessage);
        this.textMessage = textMessage;
    }
}
