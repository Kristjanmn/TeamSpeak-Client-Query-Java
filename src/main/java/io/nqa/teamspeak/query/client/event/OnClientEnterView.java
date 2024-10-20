package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientEnterView;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnClientEnterView extends ApplicationEvent {
    private final ClientEnterView clientEnterView;

    public OnClientEnterView(ClientEnterView clientEnterView) {
        super(clientEnterView);
        this.clientEnterView = clientEnterView;
    }
}
