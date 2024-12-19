package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelUnsubscribed;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon unsubscribing from a channel.<br>
 * Provides {@link ChannelUnsubscribed} object.
 */
@Getter
public class OnChannelUnsubscribed extends ApplicationEvent {
    /** Object containing list of channels unsubscribed from */
    private final ChannelUnsubscribed channelUnsubscribed;

    /**
     * Cast the event.
     *
     * @param channelUnsubscribed Object containing event details
     */
    public OnChannelUnsubscribed(ChannelUnsubscribed channelUnsubscribed) {
        super(channelUnsubscribed);
        this.channelUnsubscribed = channelUnsubscribed;
    }
}
