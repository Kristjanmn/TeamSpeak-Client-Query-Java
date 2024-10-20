package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.StartUpload;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnStartUpload extends ApplicationEvent {
    private final StartUpload startUpload;

    public OnStartUpload(StartUpload startUpload) {
        super(startUpload);
        this.startUpload = startUpload;
    }
}
