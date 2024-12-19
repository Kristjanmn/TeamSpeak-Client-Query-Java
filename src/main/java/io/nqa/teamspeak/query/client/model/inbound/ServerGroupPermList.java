package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnServerGroupList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnServerGroupList} event;
 */
@ToString
public class ServerGroupPermList extends TeamSpeakNotifyModel {
    /** List of server group permissions */
    public List<Perm> perms;

    /**
     * Create empty ServerGroupPermList object.
     */
    public ServerGroupPermList() {}

    /**
     * Permission variables
     */
    @ToString
    public static class Perm {
        /** Server group id */
        public Integer sgid;
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
