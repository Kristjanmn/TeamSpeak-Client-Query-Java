package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelEdited;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelEdited extends ApplicationEvent {
    private final ChannelEdited channelEdited;

    public OnChannelEdited(ChannelEdited channelEdited) {
        super(channelEdited);
        this.channelEdited = channelEdited;
    }
}
