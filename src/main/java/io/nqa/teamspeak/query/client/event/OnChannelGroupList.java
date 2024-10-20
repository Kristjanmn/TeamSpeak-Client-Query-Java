package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelGroupList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnChannelGroupList extends ApplicationEvent {
    private final ChannelGroupList channelGroupList;

    public OnChannelGroupList(ChannelGroupList channelGroupList) {
        super(channelGroupList);
        this.channelGroupList = channelGroupList;
    }
}
