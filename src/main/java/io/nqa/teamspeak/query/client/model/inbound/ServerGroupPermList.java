package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ServerGroupPermList extends TeamSpeakNotifyModel {
    public List<Perm> perms;

    @ToString
    public static class Perm {
        /** Server group id */
        public Integer sgid;
        public Integer permid;
        public Integer permvalue;
        public Integer permnegated;
        public Integer permskip;
    }
}
