package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.Reason;
import io.nqa.teamspeak.query.client.event.OnClientMoved;
import lombok.ToString;

/**
 * Provided with {@link OnClientMoved} event.
 */
@ToString
public class ClientMoved extends TeamSpeakNotifyModel {
    /** Client ID */
    public Integer clid;
    /**
     * Reference {@link Reason}<br>
     * 0 - switched<br>
     * 1 - moved<br>
     * 4 - kicked from channel
     */
    public Integer reasonid;
    /** Channel from ID */
    public Integer cfid;
    /** Channel to ID */
    public Integer ctid;
    /** ID of the mover */
    public Integer invokerid;
    /** Name of the mover */
    public String invokername;
    /** Unique ID of the mover */
    public String invokeruid;
    /** Reason for being moved */
    public String reasonmsg;

    /**
     * Create empty ClientMoved object.
     */
    public ClientMoved() {}
}
