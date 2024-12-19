package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelMoved;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a channel gets moved.<br>
 * Provides {@link ChannelMoved} object.
 */
@Getter
public class OnChannelMoved extends ApplicationEvent {
    /** Details on moved channel */
    private final ChannelMoved channelMoved;

    /**
     * Cast the event.
     *
     * @param channelMoved Object containing event details
     */
    public OnChannelMoved(ChannelMoved channelMoved) {
        super(channelMoved);
        this.channelMoved = channelMoved;
    }
}
