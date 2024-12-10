package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChannelGroupPermList extends TeamSpeakNotifyModel {
    public List<Perm> perms;

    @ToString
    public static class Perm {
        /** Channel group ID */
        public Integer cgid;
        /** Permission ID */
        public Integer permid;
        /** Permission value */
        public Integer permvalue;
        public Integer permnegated;
        public Integer permskip;
    }
}
