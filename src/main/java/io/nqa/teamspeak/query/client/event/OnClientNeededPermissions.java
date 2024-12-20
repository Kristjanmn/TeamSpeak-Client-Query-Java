package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientNeededPermissions;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when client needs permissions.<br>
 * Provides {@link ClientNeededPermissions} object.
 */
@Getter
public class OnClientNeededPermissions extends ApplicationEvent {
    /** Object containing list of needed permissions */
    private final ClientNeededPermissions clientNeededPermissions;

    /**
     * Cast the event.
     *
     * @param clientNeededPermissions Object containing event details
     */
    public OnClientNeededPermissions(ClientNeededPermissions clientNeededPermissions) {
        super(clientNeededPermissions);
        this.clientNeededPermissions = clientNeededPermissions;
    }
}
