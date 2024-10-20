package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ServerGroupList extends TeamSpeakNotifyModel {
    public List<ServerGroup> groups;

    @ToString
    public static class ServerGroup {
        public int sgid;
        public String name;
        public int type;
        public int iconid;
        public int savedb;
        public int sortid;
        public int namemode;
        public int n_modifyp;
        public int n_member_addp;
        public int n_member_removep;
    }
}
