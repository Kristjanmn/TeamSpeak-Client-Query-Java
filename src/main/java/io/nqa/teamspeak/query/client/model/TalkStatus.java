package io.nqa.teamspeak.query.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class TalkStatus {
    private int handler;
    private boolean talking;
    private boolean whisper;
    private int clientId;

    /* notifytalkstatuschange schandlerid=1 status=0 isreceivedwhisper=0 clid=307 */
}
