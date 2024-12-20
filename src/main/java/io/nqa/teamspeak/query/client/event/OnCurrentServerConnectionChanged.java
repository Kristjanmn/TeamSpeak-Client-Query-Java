package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.CurrentServerConnectionChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when current server connection status changes.<br>
 * Provides {@link CurrentServerConnectionChanged} object.
 */
@Getter
public class OnCurrentServerConnectionChanged extends ApplicationEvent {
    /** Event object */
    private final CurrentServerConnectionChanged currentServerConnectionChanged;

    /**
     * Cast the event.
     *
     * @param currentServerConnectionChanged Object containing event details
     */
    public OnCurrentServerConnectionChanged(CurrentServerConnectionChanged currentServerConnectionChanged) {
        super(currentServerConnectionChanged);
        this.currentServerConnectionChanged = currentServerConnectionChanged;
    }
}
