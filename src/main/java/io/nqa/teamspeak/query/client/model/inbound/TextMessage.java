package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.model.inbound.TeamSpeakNotifyModel;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class TextMessage extends TeamSpeakNotifyModel {
//    public int schandlerid;
    /**
     * 1 = Client
     * 2 = Channel
     * 3 = Server
     */
    public int targetmode;
    public String msg;
    public int target;     // target current client ID - ONLY when targetMode=1
    public int invokerid;  // invoker current client ID
    public String invokername;
    public String invokeruid;

    /* notifytextmessage
     * schandlerid=1
     * targetmode=1
     * msg=would\slook\sdope\saf
     * target=307
     * invokerid=309
     * invokername=ambi
     * invokeruid=Jv\/d1+pX7\/q343RrIMPTTVpob+U= */
}
