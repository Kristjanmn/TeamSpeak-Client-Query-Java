package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelPasswordChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a channel password gets changed.<br>
 * Provides {@link ChannelPasswordChanged} object.
 */
@Getter
public class OnChannelPasswordChanged extends ApplicationEvent {
    /** Details on channel */
    private final ChannelPasswordChanged channelPasswordChanged;

    /**
     * Cast the event.
     *
     * @param channelPasswordChanged Object containing event details
     */
    public OnChannelPasswordChanged(ChannelPasswordChanged channelPasswordChanged) {
        super(channelPasswordChanged);
        this.channelPasswordChanged = channelPasswordChanged;
    }
}
