package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ConnectStatusChange;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnConnectStatusChange extends ApplicationEvent {
    private final ConnectStatusChange connectStatusChange;

    public OnConnectStatusChange(ConnectStatusChange connectStatusChange) {
        super(connectStatusChange);
        this.connectStatusChange = connectStatusChange;
    }
}
