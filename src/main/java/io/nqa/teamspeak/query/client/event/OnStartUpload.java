package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.StartUpload;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon starting file upload.<br>
 * Provides {@link StartUpload} object.
 */
@Getter
public class OnStartUpload extends ApplicationEvent {
    /** Object containing details on the upload */
    private final StartUpload startUpload;

    /**
     * Cast the event.
     *
     * @param startUpload Object containing event details
     */
    public OnStartUpload(StartUpload startUpload) {
        super(startUpload);
        this.startUpload = startUpload;
    }
}
