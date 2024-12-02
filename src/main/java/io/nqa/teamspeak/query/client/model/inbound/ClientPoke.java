package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.model.inbound.TeamSpeakNotifyModel;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientPoke extends TeamSpeakNotifyModel {
    public int invokerid;
    public String invokername;
    public String invokeruid;
    public String msg;
}
