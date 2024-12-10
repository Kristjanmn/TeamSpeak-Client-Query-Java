package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class TextMessage extends TeamSpeakNotifyModel {
    /**
     * 1 - Client<p>
     * 2 - Channel<p>
     * 3 - Server<p>
     */
    public Integer targetmode;
    public String msg;
    public Integer target;     // target current client ID - ONLY when targetMode=1
    public Integer invokerid;  // invoker current client ID
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
