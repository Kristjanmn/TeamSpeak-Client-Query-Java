package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelDescriptionChanged extends TeamSpeakNotifyModel {
    /** Channel ID */
    public int cid;
}
