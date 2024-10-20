package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ServerEdited extends TeamSpeakNotifyModel {
    public int reasonid;
    public int invokerid;
    public String invokername;
    public String invokeruid;
}
