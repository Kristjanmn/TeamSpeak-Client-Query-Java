package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class StartDownload extends TeamSpeakNotifyModel {
    public Integer clientftfid;
    public Integer serverftfid;
    public String ftkey;
    public Integer port;
    public Integer size;
    public Integer proto;
}
