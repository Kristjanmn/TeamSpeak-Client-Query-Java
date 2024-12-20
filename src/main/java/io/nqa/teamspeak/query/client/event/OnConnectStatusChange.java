package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ConnectStatusChange;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when connection status changes.<br>
 * Provides {@link ConnectStatusChange} object.
 */
@Getter
public class OnConnectStatusChange extends ApplicationEvent {
    /** Details on connection status */
    private final ConnectStatusChange connectStatusChange;

    /**
     * Cast the event.
     *
     * @param connectStatusChange Object containing event details
     */
    public OnConnectStatusChange(ConnectStatusChange connectStatusChange) {
        super(connectStatusChange);
        this.connectStatusChange = connectStatusChange;
    }
}
