package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientChannelGroupChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientChannelGroupChanged extends ApplicationEvent {
    private final ClientChannelGroupChanged clientChannelGroupChanged;

    public OnClientChannelGroupChanged(ClientChannelGroupChanged clientChannelGroupChanged) {
        super(clientChannelGroupChanged);
        this.clientChannelGroupChanged = clientChannelGroupChanged;
    }
}
