package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class ChannelGroupList extends TeamSpeakNotifyModel {
    /** List of channel groups */
    public List<ChannelGroup> groups;

    @ToString
    public static class ChannelGroup {
        /** Channel group ID */
        public Integer cgid;
        /** Channel group name */
        public String name;
        /** Channel group type<p>
         * 0 - Template<p>
         * 1 - Regular<p>
         * 2 - Query
         */
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
