package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelPermList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving list of channel permissions from client.<br>
 * Provides {@link ChannelPermList} object.
 */
@Getter
public class OnChannelPermList extends ApplicationEvent {
    /** Object containing list of channel permissions */
    private final ChannelPermList channelPermList;

    /**
     * Cast the event.
     *
     * @param channelPermList Object containing event details
     */
    public OnChannelPermList(ChannelPermList channelPermList) {
        super(channelPermList);
        this.channelPermList = channelPermList;
    }
}
