package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelGroupPermList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving list of channel group permissions.<br>
 * Provides {@link ChannelGroupPermList} object.
 */
@Getter
public class OnChannelGroupPermList extends ApplicationEvent {
    /** List of channel group permissions received from client */
    private final ChannelGroupPermList channelGroupPermList;

    /**
     * Cast the event.
     *
     * @param channelGroupPermList Object containing event details
     */
    public OnChannelGroupPermList(ChannelGroupPermList channelGroupPermList) {
        super(channelGroupPermList);
        this.channelGroupPermList = channelGroupPermList;
    }
}
