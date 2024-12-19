package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ChannelListFinished;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when {@link OnChannelList} finishes.<br>
 * Provides {@link ChannelListFinished} object.
 */
@Getter
public class OnChannelListFinished extends ApplicationEvent {
    /** Event details */
    private final ChannelListFinished channelListFinished;

    /**
     * Cast the event.
     *
     * @param channelListFinished Object containing event details
     */
    public OnChannelListFinished(ChannelListFinished channelListFinished) {
        super(channelListFinished);
        this.channelListFinished = channelListFinished;
    }
}
