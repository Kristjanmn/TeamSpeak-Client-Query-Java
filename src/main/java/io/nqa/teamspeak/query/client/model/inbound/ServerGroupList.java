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
        public Integer sgid;
        public String name;
        public Integer type;
        public String iconid;
        public Integer savedb;
        public Integer sortid;
        public Integer namemode;
        public Integer n_modifyp;
        public Integer n_member_addp;
        public Integer n_member_removep;
    }
}
