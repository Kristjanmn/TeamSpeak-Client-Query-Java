package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelListFinished;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelListFinished extends ApplicationEvent {
    private final ChannelListFinished channelListFinished;

    public OnChannelListFinished(ChannelListFinished channelListFinished) {
        super(channelListFinished);
        this.channelListFinished = channelListFinished;
    }
}
