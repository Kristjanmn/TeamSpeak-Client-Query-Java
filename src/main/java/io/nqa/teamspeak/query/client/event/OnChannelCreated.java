package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelCreated;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a channel gets created.<br>
 * Provides {@link ChannelCreated} object.
 */
@Getter
public class OnChannelCreated extends ApplicationEvent {
    /** Details on created channel */
    private final ChannelCreated channelCreated;

    /**
     * Cast the event.
     *
     * @param channelCreated Object containing event details
     */
    public OnChannelCreated(ChannelCreated channelCreated) {
        super(channelCreated);
        this.channelCreated = channelCreated;
    }
}
