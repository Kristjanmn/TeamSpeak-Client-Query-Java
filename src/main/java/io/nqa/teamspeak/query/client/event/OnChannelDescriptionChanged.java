package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelDescriptionChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelDescriptionChanged extends ApplicationEvent {
    private final ChannelDescriptionChanged channelDescriptionChanged;

    public OnChannelDescriptionChanged(ChannelDescriptionChanged channelDescriptionChanged) {
        super(channelDescriptionChanged);
        this.channelDescriptionChanged = channelDescriptionChanged;
    }
}
