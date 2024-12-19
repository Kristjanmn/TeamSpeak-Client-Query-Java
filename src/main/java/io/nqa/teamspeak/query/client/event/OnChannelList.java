package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving channel list from TeamSpeak client.<br>
 * Provides {@link ChannelList} object.
 */
@Getter
public class OnChannelList extends ApplicationEvent {
    /** List of channels received from client */
    private final ChannelList channelList;

    /**
     * Cast the event.
     *
     * @param channelList Object containing event details
     */
    public OnChannelList(ChannelList channelList) {
        super(channelList);
        this.channelList = channelList;
    }
}
