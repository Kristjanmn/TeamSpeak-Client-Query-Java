package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelSubscribed;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelSubscribed extends ApplicationEvent {
    private final ChannelSubscribed channelSubscribed;

    public OnChannelSubscribed(ChannelSubscribed channelSubscribed) {
        super(channelSubscribed);
        this.channelSubscribed = channelSubscribed;
    }
}
