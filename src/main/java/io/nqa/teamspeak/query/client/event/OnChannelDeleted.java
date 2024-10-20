package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelDeleted;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelDeleted extends ApplicationEvent {
    private final ChannelDeleted channelDeleted;

    public OnChannelDeleted(ChannelDeleted channelDeleted) {
        super(channelDeleted);
        this.channelDeleted = channelDeleted;
    }
}
