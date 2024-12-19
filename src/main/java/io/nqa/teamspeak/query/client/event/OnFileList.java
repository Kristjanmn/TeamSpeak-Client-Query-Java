package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.FileList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving file list.<br>
 * Provides {@link FileList} object.
 */
@Getter
public class OnFileList extends ApplicationEvent {
    /** Object containing list of files present at path */
    private final FileList fileList;

    /**
     * Cast the event.
     *
     * @param fileList Object containing event details
     */
    public OnFileList(FileList fileList) {
        super(fileList);
        this.fileList = fileList;
    }
}
