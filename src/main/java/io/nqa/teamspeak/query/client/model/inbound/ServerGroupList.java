package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.GroupNamingMode;
import io.nqa.teamspeak.query.client.GroupType;
import io.nqa.teamspeak.query.client.event.OnServerGroupClientList;
import lombok.ToString;

import java.util.List;

/**
 * Provided with {@link OnServerGroupClientList} event.
 */
@ToString
public class ServerGroupList extends TeamSpeakNotifyModel {
    /** List of server groups */
    public List<ServerGroup> groups;

    /**
     * Create empty ServerGroupList object.
     */
    public ServerGroupList() {}

    /**
     * Object containing details on server group.
     */
    @ToString
    public static class ServerGroup {
        /** Server group ID */
        public Integer sgid;
        /** Server group name */
        public String name;
        /** Server group type. See {@link GroupType} */
        public Integer type;
        /** Server group icon ID */
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
         * Create empty ServerGroup object.
         */
        public ServerGroup() {}
    }
}
