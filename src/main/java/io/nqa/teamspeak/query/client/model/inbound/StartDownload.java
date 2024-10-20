package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class StartDownload extends TeamSpeakNotifyModel {
    public int clientftfid;
    public int serverftfid;
    public String ftkey;
    public int port;
    public int size;
    public int proto;
}
