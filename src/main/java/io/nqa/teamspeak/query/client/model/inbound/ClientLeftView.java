package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.Reason;
import io.nqa.teamspeak.query.client.event.OnClientLeftView;
import lombok.ToString;

/**
 * Provided with {@link OnClientLeftView} event.
 */
@ToString
public class ClientLeftView extends TeamSpeakNotifyModel {
    /** From channel */
    public Integer cfid;
    /** To channel */
    public Integer ctid;
    /** Reference {@link Reason} */
    public Integer reasonid;
    /** Reason message */
    public String reasonmsg;
    /** Client ID */
    public Integer clid;
    /** Ban time in seconds */
    public Long bantime;
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker Unique ID */
    public String invokeruid;

    /**
     * Create empty ClientLeftView object.
     */
    public ClientLeftView() {}
}
