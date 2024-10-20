package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelPasswordChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelPasswordChanged extends ApplicationEvent {
    private final ChannelPasswordChanged channelPasswordChanged;

    public OnChannelPasswordChanged(ChannelPasswordChanged channelPasswordChanged) {
        super(channelPasswordChanged);
        this.channelPasswordChanged = channelPasswordChanged;
    }
}
