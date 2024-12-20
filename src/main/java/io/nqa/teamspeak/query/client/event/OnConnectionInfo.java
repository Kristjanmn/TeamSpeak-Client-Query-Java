package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ConnectionInfo;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving connection info.<br>
 * Provides {@link ConnectionInfo} object.
 */
@Getter
public class OnConnectionInfo extends ApplicationEvent {
    /** Object containing connection information */
    private final ConnectionInfo connectionInfo;

    /**
     * Cast the event.
     *
     * @param connectionInfo Object containing event details
     */
    public OnConnectionInfo(ConnectionInfo connectionInfo) {
        super(connectionInfo);
        this.connectionInfo = connectionInfo;
    }
}
