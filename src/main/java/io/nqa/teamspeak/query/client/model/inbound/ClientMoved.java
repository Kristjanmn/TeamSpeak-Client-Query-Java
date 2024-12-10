package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientMoved extends TeamSpeakNotifyModel {
    /** Client ID */
    public Integer clid;
    public Integer reasonid;           // 0 = switched | 1 - moved | 4 - kicked from channel
    public Integer cfid;
    public Integer ctid;
    public Integer invokerid;
    public String invokername;
    public String invokeruid;
    public String reasonmsg;
}
