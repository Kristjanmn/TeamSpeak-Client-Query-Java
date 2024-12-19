package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.GroupNamingMode;
import io.nqa.teamspeak.query.client.GroupType;
import io.nqa.teamspeak.query.client.event.OnChannelGroupList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnChannelGroupList} event.
 */
@ToString
public class ChannelGroupList extends TeamSpeakNotifyModel {
    /** List of channel groups */
    public List<ChannelGroup> groups;

    /**
     * Create empty ChannelGroupList object.
     */
    public ChannelGroupList() {}

    /**
     * Object containing TeamSpeak channel group information.
     */
    @ToString
    public static class ChannelGroup {
        /** Channel group ID */
        public Integer cgid;
        /** Channel group name */
        public String name;
        /** Channel group type. See {@link GroupType}*/
        public Integer type;
        /** Group icon ID */
        public String iconid;
        /** 1 - save into database - group is permanent */
        public Integer savedb;
        /** Sorting index. Lower towards beginning of list */
        public Integer sortid;
        /** Group naming mode. See {@link GroupNamingMode} */
        public Integer namemode;
        /** Needed i_group_modify_power to edit group */
        public Integer n_modifyp;
        /** Needed i_group_member_add_power to add client to group */
        public Integer n_member_addp;
        /** Needed i_group_member_remove_power to remove client from group */
        public Integer n_member_removep;

        /**
         * Create empty ChannelGroup object.
         */
        public ChannelGroup() {}
    }
}
