package io.nqa.teamspeak.query.client.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class TextMessage {
    private int handler;
    /**
     * 1 = Client
     * 2 = Channel
     * 3 = Server
     */
    private int targetMode; // TODO: Turn into enum
    private String message;
    private int target;     // target current client ID - ONLY when targetMode=1
    private int invokerId;  // invoker current client ID
    private String invokerName;
    private String invokerUid;

    /* notifytextmessage
     * schandlerid=1
     * targetmode=1
     * msg=would\slook\sdope\saf
     * target=307
     * invokerid=309
     * invokername=ambi
     * invokeruid=Jv\/d1+pX7\/q343RrIMPTTVpob+U= */
}
