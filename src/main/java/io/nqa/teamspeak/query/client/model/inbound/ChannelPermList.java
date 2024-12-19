package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelPermList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnChannelPermList} event.
 */
@ToString
public class ChannelPermList extends TeamSpeakNotifyModel {
    /** List of permissions */
    public List<Perm> perms;

    /**
     * Create empty ChannelPermList object.
     */
    public ChannelPermList() {}

    /** Permission parameters from event */
    @ToString
    public static class Perm {
        /** Channel ID */
        public Integer cid;
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
