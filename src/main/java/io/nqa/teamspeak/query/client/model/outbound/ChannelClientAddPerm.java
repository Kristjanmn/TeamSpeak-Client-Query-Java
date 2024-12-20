package io.nqa.teamspeak.query.client.model.outbound;

import lombok.ToString;

import java.util.List;

/**
 * Details on channelclientaddperm request.
 */
@ToString
public class ChannelClientAddPerm {
    /** Channel ID */
    public final Integer cid;
    /** Client Database ID */
    public final Integer cldbid;
    /** List of permissions */
    public final List<Perm> perms;

    /**
     * Create ChannelClientAddPerm object.
     *
     * @param cid Channel ID
     * @param cldbid Client database ID
     * @param perms List of permissions to add
     */
    public ChannelClientAddPerm(int cid, int cldbid, List<Perm> perms) {
        this.cid = cid;
        this.cldbid = cldbid;
        this.perms = perms;
    }

    /**
     * Permission ID and Permission value.<br>
     * Must have ({@link #permid} OR {@link #permsid} (NOT both)) AND {@link #permvalue}
     */
    public static class Perm {
        /** Permission ID */
        public Integer permid;
        /** Permission ID as String */
        public String permsid;
        /** Permission value */
        public final Integer permvalue;

        /**
         * Create Perm object with Integer ID.
         *
         * @param permid Permission ID
         * @param permvalue Permission value
         */
        public Perm(int permid, int permvalue) {
            this.permid = permid;
            this.permvalue = permvalue;
        }

        /**
         * Create Perm object with String ID.
         *
         * @param permsid Permission ID as String
         * @param permvalue Permission value
         */
        public Perm(String permsid, int permvalue) {
            this.permsid = permsid;
            this.permvalue = permvalue;
        }
    }
}
