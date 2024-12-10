package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ConnectStatusChange extends TeamSpeakNotifyModel {
    public String status;
    public Integer error;
}
