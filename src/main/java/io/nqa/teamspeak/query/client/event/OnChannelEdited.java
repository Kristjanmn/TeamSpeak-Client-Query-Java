package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelEdited;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when channel gets edited.<br>
 * Provides {@link ChannelEdited} object.
 */
@Getter
public class OnChannelEdited extends ApplicationEvent {
    /** Details on edited channel */
    private final ChannelEdited channelEdited;

    /**
     * Cast the event.
     *
     * @param channelEdited Object containing event details
     */
    public OnChannelEdited(ChannelEdited channelEdited) {
        super(channelEdited);
        this.channelEdited = channelEdited;
    }
}
