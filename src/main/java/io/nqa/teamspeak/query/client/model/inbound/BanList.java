package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * List of bans.
 * Provided with {@link io.nqa.teamspeak.query.client.event.OnBanList} event.
 */
@NoArgsConstructor
@ToString
public class BanList extends TeamSpeakNotifyModel {
    /** Number of bans */
    public int count;
    /** List of bans */
    public List<Ban> bans;

    /**
     * Information on ban
     */
    @ToString
    public static class Ban {
        /** ID of the ban */
        public int banid;
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
        public long created;
        /** Ban duration in seconds */
        public long duration;
        /** Name of the user who invoked the ban */
        public String invokername;
        /** Invoker's Database ID */
        public int invokercldbid;
        /** Invoker's Unique ID */
        public String invokeruid;
        /** Reason for the ban */
        public String reason;
        /** Number of times banned user tried to connect */
        public int enforcements;
    }
}
