package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnBanList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnBanList} event.
 */
@ToString
public class BanList extends TeamSpeakNotifyModel {
    /** Number of bans */
    public Integer count;
    /** List of bans */
    public List<Ban> bans;

    /**
     * Create empty BanList object.
     */
    public BanList() {}

    /**
     * Information on ban
     */
    @ToString
    public static class Ban {
        /** ID of the ban */
        public Integer banid;
        /** Banned IP address */
        public String ip;
        /** Name of banned user */
        public String name;
        /** Banned Unique ID */
        public String uid;
        /** Banned MyTeamSpeak ID */
        public String mytsid;
        /** Banned user's last used nickname */
        public String lastnickname;
        /** Timestamp of when ban was created */
        public Long created;
        /** Ban duration in seconds */
        public Long duration;
        /** Name of the user who invoked the ban */
        public String invokername;
        /** Invoker's Database ID */
        public Integer invokercldbid;
        /** Invoker's Unique ID */
        public String invokeruid;
        /** Reason for the ban */
        public String reason;
        /** Number of times banned user tried to connect */
        public Integer enforcements;

        /**
         * Create empty Ban object.
         */
        public Ban() {}
    }
}
