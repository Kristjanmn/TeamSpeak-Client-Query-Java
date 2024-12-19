package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.StartDownload;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon starting file download.<br>
 * Provides {@link StartDownload} object.
 */
@Getter
public class OnStartDownload extends ApplicationEvent {
    /** Object containing details on the download */
    private final StartDownload startDownload;

    /**
     * Cast the event.
     *
     * @param startDownload Object containing event details
     */
    public OnStartDownload(StartDownload startDownload) {
        super(startDownload);
        this.startDownload = startDownload;
    }
}
