package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelPermList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelPermList extends ApplicationEvent {
    private final ChannelPermList channelPermList;

    public OnChannelPermList(ChannelPermList channelPermList) {
        super(channelPermList);
        this.channelPermList = channelPermList;
    }
}
