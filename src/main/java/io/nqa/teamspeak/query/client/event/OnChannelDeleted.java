package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelDeleted;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a channel gets deleted.<br>
 * Provides {@link ChannelDeleted} object.
 */
@Getter
public class OnChannelDeleted extends ApplicationEvent {
    /** Details on deleted channel */
    private final ChannelDeleted channelDeleted;

    /**
     * Cast the event.
     *
     * @param channelDeleted Object containing event details
     */
    public OnChannelDeleted(ChannelDeleted channelDeleted) {
        super(channelDeleted);
        this.channelDeleted = channelDeleted;
    }
}
