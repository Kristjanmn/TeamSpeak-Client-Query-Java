package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientNeededPermissions;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientNeededPermissions extends ApplicationEvent {
    private final ClientNeededPermissions clientNeededPermissions;

    public OnClientNeededPermissions(ClientNeededPermissions clientNeededPermissions) {
        super(clientNeededPermissions);
        this.clientNeededPermissions = clientNeededPermissions;
    }
}
