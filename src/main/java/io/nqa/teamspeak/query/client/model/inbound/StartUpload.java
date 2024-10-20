package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class StartUpload extends TeamSpeakNotifyModel {
    public int clientftfid;
    public int serverftfid;
    public String ftkey;
    public int port;
    public int seekpos;
    public int proto;
}
