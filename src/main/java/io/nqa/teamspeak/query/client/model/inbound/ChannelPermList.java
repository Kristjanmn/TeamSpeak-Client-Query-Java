package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChannelPermList extends TeamSpeakNotifyModel {
    /** List of permissions */
    public List<Perm> perms;

    /** Permission parameters from event */
    @ToString
    public static class Perm {
        /** Channel ID */
        public Integer cid;
        /** Permission ID */
        public Integer permid;
        /** Permission value */
        public Integer permvalue;
        public Integer permnegated;
        public Integer permskip;
    }
}
