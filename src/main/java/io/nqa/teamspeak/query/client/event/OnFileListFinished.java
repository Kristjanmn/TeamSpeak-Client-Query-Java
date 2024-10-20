package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.FileListFinished;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnFileListFinished extends ApplicationEvent {
    private final FileListFinished fileListFinished;

    public OnFileListFinished(FileListFinished fileListFinished) {
        super(fileListFinished);
        this.fileListFinished = fileListFinished;
    }
}
