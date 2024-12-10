package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientPoke extends TeamSpeakNotifyModel {
    public Integer invokerid;
    public String invokername;
    public String invokeruid;
    public String msg;
}
