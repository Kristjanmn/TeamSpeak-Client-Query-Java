package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.TalkStatusChange;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when a client talk status changes.<br>
 * Provides {@link TalkStatusChange} object.
 */
@Getter
public class OnTalkStatusChange extends ApplicationEvent {
    /** Details on talking client */
    private final TalkStatusChange talkStatus;

    /**
     * Cast the event.
     *
     * @param talkStatus Object containing event details
     */
    public OnTalkStatusChange(final TalkStatusChange talkStatus) {
        super(talkStatus);
        this.talkStatus = talkStatus;
    }
}
