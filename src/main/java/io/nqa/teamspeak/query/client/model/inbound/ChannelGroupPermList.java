package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelGroupPermList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnChannelGroupPermList} event.
 */
@ToString
public class ChannelGroupPermList extends TeamSpeakNotifyModel {
    /** List of permissions */
    public List<Perm> perms;

    /**
     * Create empty ChannelGroupPermList object.
     */
    public ChannelGroupPermList() {}

    /**
     * Object containing permission details.
     */
    @ToString
    public static class Perm {
        /** Channel group ID */
        public Integer cgid;
        /** Permission ID */
        public Integer permid;
        /** Permission value */
        public Integer permvalue;
        /** 1 - Permission is negated */
        public Integer permnegated;
        /** 1 - Permission gets skipped */
        public Integer permskip;

        /**
         * Create empty Perm object.
         */
        public Perm() {}
    }
}
