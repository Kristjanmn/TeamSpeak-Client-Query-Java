package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChannelGroupList extends TeamSpeakNotifyModel {
    public List<ChannelGroup> groups;

    @ToString
    public static class ChannelGroup {
        public int cgid;
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
