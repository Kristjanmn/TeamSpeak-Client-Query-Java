package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelGroupList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving list of channel groups.<br>
 * Provides {@link ChannelGroupList} object.
 */
@Getter
public class OnChannelGroupList extends ApplicationEvent {
    /** List of channel groups received from client */
    private final ChannelGroupList channelGroupList;

    /**
     * Cast the event.
     *
     * @param channelGroupList Object containing event details
     */
    public OnChannelGroupList(ChannelGroupList channelGroupList) {
        super(channelGroupList);
        this.channelGroupList = channelGroupList;
    }
}
