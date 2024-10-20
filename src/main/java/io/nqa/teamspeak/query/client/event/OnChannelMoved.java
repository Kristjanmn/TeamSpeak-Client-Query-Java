package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelMoved;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelMoved extends ApplicationEvent {
    private final ChannelMoved channelMoved;

    public OnChannelMoved(ChannelMoved channelMoved) {
        super(channelMoved);
        this.channelMoved = channelMoved;
    }
}
