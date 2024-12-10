package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChannelUnsubscribed extends TeamSpeakNotifyModel {
    public List<Channel> channels;

    @ToString
    public static class Channel {
        public Integer cid;
    }
}
