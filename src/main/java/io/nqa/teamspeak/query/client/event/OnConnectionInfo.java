package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ConnectionInfo;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnConnectionInfo extends ApplicationEvent {
    private final ConnectionInfo connectionInfo;

    public OnConnectionInfo(ConnectionInfo connectionInfo) {
        super(connectionInfo);
        this.connectionInfo = connectionInfo;
    }
}
