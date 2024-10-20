package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelUnsubscribed;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelUnsubscribed extends ApplicationEvent {
    private final ChannelUnsubscribed channelUnsubscribed;

    public OnChannelUnsubscribed(ChannelUnsubscribed channelUnsubscribed) {
        super(channelUnsubscribed);
        this.channelUnsubscribed = channelUnsubscribed;
    }
}
