package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelDescriptionChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a channel description gets changed.<br>
 * Provides {@link ChannelDescriptionChanged} object.
 */
@Getter
public class OnChannelDescriptionChanged extends ApplicationEvent {
    /** Details on channel */
    private final ChannelDescriptionChanged channelDescriptionChanged;

    /**
     * Cast the event.
     *
     * @param channelDescriptionChanged Object containing event details
     */
    public OnChannelDescriptionChanged(ChannelDescriptionChanged channelDescriptionChanged) {
        super(channelDescriptionChanged);
        this.channelDescriptionChanged = channelDescriptionChanged;
    }
}
