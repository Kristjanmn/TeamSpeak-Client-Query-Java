package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.StartDownload;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnStartDownload extends ApplicationEvent {
    private final StartDownload startDownload;

    public OnStartDownload(StartDownload startDownload) {
        super(startDownload);
        this.startDownload = startDownload;
    }
}
