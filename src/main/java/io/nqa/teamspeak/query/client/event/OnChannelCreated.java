package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelCreated;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelCreated extends ApplicationEvent {
    private final ChannelCreated channelCreated;

    public OnChannelCreated(ChannelCreated channelCreated) {
        super(channelCreated);
        this.channelCreated = channelCreated;
    }
}
