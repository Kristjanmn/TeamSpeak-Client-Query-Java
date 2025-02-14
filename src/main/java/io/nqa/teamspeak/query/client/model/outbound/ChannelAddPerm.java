package io.nqa.teamspeak.query.client.model.outbound;

import lombok.ToString;

import java.util.List;

/**
 * Object for giving permissions to specified channel.
 */
@ToString
public class ChannelAddPerm {
    /** Channel ID */
    public final Integer cid;
    /** List of permissions */
    public final List<Perm> perms;

    /**
     * Create ChannelAddPerm object.
     *
     * @param cid Channel ID
     * @param perms List of permissions
     */
    public ChannelAddPerm(int cid, List<Perm> perms) {
        this.cid = cid;
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
