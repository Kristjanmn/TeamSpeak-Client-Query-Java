package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.MessageList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnMessageList extends ApplicationEvent {
    private final MessageList messageList;

    public OnMessageList(final MessageList messageList) {
        super(messageList);
        this.messageList = messageList;
    }
}
