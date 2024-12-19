package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.FileListFinished;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when {@link OnFileList} finishes.<br>
 * Provides {@link FileListFinished} object.
 */
@Getter
public class OnFileListFinished extends ApplicationEvent {
    /** Details on finished list */
    private final FileListFinished fileListFinished;

    /**
     * Cast the event.
     *
     * @param fileListFinished Object containing event details
     */
    public OnFileListFinished(FileListFinished fileListFinished) {
        super(fileListFinished);
        this.fileListFinished = fileListFinished;
    }
}
