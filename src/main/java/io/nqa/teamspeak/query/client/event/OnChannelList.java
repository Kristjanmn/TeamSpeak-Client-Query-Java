package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelList extends ApplicationEvent {
    private final ChannelList channelList;

    public OnChannelList(ChannelList channelList) {
        super(channelList);
        this.channelList = channelList;
    }
}
