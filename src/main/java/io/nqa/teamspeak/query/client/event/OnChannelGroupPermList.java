package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelGroupPermList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelGroupPermList extends ApplicationEvent {
    private final ChannelGroupPermList channelGroupPermList;

    public OnChannelGroupPermList(ChannelGroupPermList channelGroupPermList) {
        super(channelGroupPermList);
        this.channelGroupPermList = channelGroupPermList;
    }
}
