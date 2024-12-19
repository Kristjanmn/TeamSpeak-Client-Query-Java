package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelSubscribed;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon subscribing to a channel.<br>
 * Provides {@link ChannelSubscribed} object.
 */
@Getter
public class OnChannelSubscribed extends ApplicationEvent {
    /** Object containing details on subscribed channels */
    private final ChannelSubscribed channelSubscribed;

    /**
     * Cast the event.
     *
     * @param channelSubscribed Object containing event details
     */
    public OnChannelSubscribed(ChannelSubscribed channelSubscribed) {
        super(channelSubscribed);
        this.channelSubscribed = channelSubscribed;
    }
}
