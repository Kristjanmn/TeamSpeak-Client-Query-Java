package io.nqa.teamspeak.query.client.model.outbound;

import java.util.List;

/**
 * Details on channelclientdelperm request.
 */
public class ChannelClientDelPerm {
    /** Channel ID */
    public final Integer cid;
    /** Client database ID */
    public final Integer cldbid;
    /** List of permissions to delete */
    public final List<Perm> perms;

    /**
     * Create ChannelClientDelPerm object.
     *
     * @param cid Channel ID
     * @param cldbid Client database ID
     * @param perms List of permissions to delete
     */
    public ChannelClientDelPerm(int cid, int cldbid, List<Perm> perms) {
        this.cid = cid;
        this.cldbid = cldbid;
        this.perms = perms;
    }

    /**
     * Must have ({@link #permid} OR {@link #permsid} (NOT both))
     */
    public static class Perm {
        /** Permission ID */
        public Integer permid;
        /** Permission ID as String */
        public String permsid;

        /**
         * Create Perm object with ID (Integer).
         *
         * @param permid permission ID
         */
        public Perm(int permid) {
            this.permid = permid;
        }

        /**
         * Create Perm object with ID (String).
         *
         * @param permsid permission
         */
        public Perm(String permsid) {
            this.permsid = permsid;
        }
    }
}
