package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnFileListFinished;
import lombok.ToString;

/**
 * Provided with {@link OnFileListFinished} event.
 */
@ToString
public class FileListFinished extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** File browser path */
    public String path;

    /**
     * Create empty FileListFinished object.
     */
    public FileListFinished() {}
}
