package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class BanList extends TeamSpeakNotifyModel {
    public int count;
    public List<Ban> bans;

    @ToString
    public static class Ban {
        public int banid;
        public String ip;
        public String name;
        public String uid;
        public String mytsid;
        public String lastnickname;
        public long created;        // timestamp
        public long duration;
        public String invokername;
        public int invokercldbid;
        public String invokeruid;
        public String reason;
        public int enforcements;    // verify
    }
}
