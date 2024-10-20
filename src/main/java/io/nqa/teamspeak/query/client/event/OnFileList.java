package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.FileList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnFileList extends ApplicationEvent {
    private final FileList fileList;

    public OnFileList(FileList fileList) {
        super(fileList);
        this.fileList = fileList;
    }
}
