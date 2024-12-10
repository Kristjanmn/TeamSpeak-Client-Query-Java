package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ServerEdited extends TeamSpeakNotifyModel {
    public Integer reasonid;
    public Integer invokerid;
    public String invokername;
    public String invokeruid;
}
