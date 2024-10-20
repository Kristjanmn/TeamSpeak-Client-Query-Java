package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.CurrentServerConnectionChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnCurrentServerConnectionChanged extends ApplicationEvent {
    private final CurrentServerConnectionChanged currentServerConnectionChanged;

    public OnCurrentServerConnectionChanged(CurrentServerConnectionChanged currentServerConnectionChanged) {
        super(currentServerConnectionChanged);
        this.currentServerConnectionChanged = currentServerConnectionChanged;
    }
}
