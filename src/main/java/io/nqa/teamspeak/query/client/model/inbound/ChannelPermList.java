package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChannelPermList extends TeamSpeakNotifyModel {
    public List<Perm> perms;

    @ToString
    public static class Perm {
        public int cid;
        public int permid;
        public int permvalue;
        public int permnegated;
        public int permskip;
    }
}
