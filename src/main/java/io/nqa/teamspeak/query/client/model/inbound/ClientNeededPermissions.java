package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnClientNeededPermissions;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnClientNeededPermissions} event.
 */
@ToString
public class ClientNeededPermissions extends TeamSpeakNotifyModel {
    /** List of permissions the client needs */
    public List<Perm> perms;

    /**
     * Create empty ClientNeededPermissions object.
     */
    public ClientNeededPermissions() {}

    /**
     * Permission object
     */
    @ToString
    public static class Perm {
        /** Permission ID */
        public Integer permid;
        /** Permission value */
        public Integer permvalue;

        /**
         * Create empty Perm object.
         */
        public Perm() {}
    }
}
