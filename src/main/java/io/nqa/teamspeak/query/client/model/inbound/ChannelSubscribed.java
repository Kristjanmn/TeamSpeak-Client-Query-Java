package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChannelSubscribed extends TeamSpeakNotifyModel {
    public List<Channel> channels;
    // For when only one object is given
    public int cid;
    public int es;

    @ToString
    public static class Channel {
        public int cid;
        public int es;
    }
}
