package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientLeftView extends TeamSpeakNotifyModel {
    /** From channel */
    public Integer cfid;
    /** To channel */
    public Integer ctid;
    /** Reason see {@link io.nqa.teamspeak.query.client.Reason} */
    public Integer reasonid;
    public String reasonmsg;
    public Integer clid;
    public Long bantime;
    public Integer invokerid;
    public String invokername;
    public String invokeruid;
}
