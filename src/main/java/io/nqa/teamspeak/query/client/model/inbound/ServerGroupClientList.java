package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ServerGroupClientList extends TeamSpeakNotifyModel {
    /** Server group ID*/
    public int sgid;
    public List<Client> clients;

    @ToString
    public static class Client {
        /** Client database ID */
        public int cldbid;
        public String client_nickname;
        public String client_unique_identifier;
    }
}
