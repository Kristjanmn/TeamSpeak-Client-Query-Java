package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class TalkStatusChange extends TeamSpeakNotifyModel {
    public int status;
    public int isreceivedwhisper;
    public int clid;
}
