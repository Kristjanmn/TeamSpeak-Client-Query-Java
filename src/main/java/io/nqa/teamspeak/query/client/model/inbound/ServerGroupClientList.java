package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnServerGroupClientList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnServerGroupClientList} event.
 */
@ToString
public class ServerGroupClientList extends TeamSpeakNotifyModel {
    /** Server group ID*/
    public Integer sgid;
    /** List of clients */
    public List<Client> clients;

    /**
     * Create empty ServerGroupClientList object.
     */
    public ServerGroupClientList() {}

    /**
     * Object containing client details.
     */
    @ToString
    public static class Client {
        /** Client database ID */
        public Integer cldbid;
        /** Client's last used nickname */
        public String client_nickname;
        /** Client unique ID */
        public String client_unique_identifier;

        /**
         * Create empty Client object.
         */
        public Client() {}
    }
}
