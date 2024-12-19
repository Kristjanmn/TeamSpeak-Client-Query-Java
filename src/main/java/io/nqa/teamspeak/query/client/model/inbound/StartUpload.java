package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnStartUpload;
import lombok.ToString;

/**
 * Provided with {@link OnStartUpload} event.
 */
@ToString
public class StartUpload extends TeamSpeakNotifyModel {
    /** Client file-transfer ID */
    public Integer clientftfid;
    /** Server file-transfer ID */
    public Integer serverftfid;
    /** File-transfer key */
    public String ftkey;
    /** Port */
    public Integer port;
    /** Seek position */
    public Integer seekpos;
    /** File transfer protocol */
    public Integer proto;

    /**
     * Create empty StartUpload object.
     */
    public StartUpload() {}
}
