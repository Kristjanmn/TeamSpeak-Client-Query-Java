package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnStartDownload;
import lombok.ToString;

/**
 * Provided with {@link OnStartDownload} event.
 */
@ToString
public class StartDownload extends TeamSpeakNotifyModel {
    /** Client file-transfer ID */
    public Integer clientftfid;
    /** Server file-transfer ID */
    public Integer serverftfid;
    /** File-transfer key */
    public String ftkey;
    /** Port */
    public Integer port;
    /** File size */
    public Integer size;
    /** File transfer protocol */
    public Integer proto;

    /**
     * Create empty StartUpload object.
     */
    public StartDownload() {}
}
