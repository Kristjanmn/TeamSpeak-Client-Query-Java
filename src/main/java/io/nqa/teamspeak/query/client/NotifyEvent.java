package io.nqa.teamspeak.query.client;

/**
 * List of events sent by TeamSpeak client
 */
public enum NotifyEvent {
    /** Talk status changed */
    NOTIFY_TALK_STATUS_CHANGE("notifytalkstatuschange"),
    /** Received message */
    NOTIFY_MESSAGE("notifymessage"),
    /** Receiving message list */
    NOTIFY_MESSAGE_LIST("notifymessagelist"),
    /** Received complaint list */
    NOTIFY_COMPLAIN_LIST("notifycomplainlist"),
    /** Received ban list */
    NOTIFY_BAN_LIST("notifybanlist"),
    /** Client was moved */
    NOTIFY_CLIENT_MOVED("notifyclientmoved"),
    /** Client left view */
    NOTIFY_CLIENT_LEFT_VIEW("notifyclientleftview"),
    /** Client entered view */
    NOTIFY_CLIENT_ENTER_VIEW("notifycliententerview"),
    /** Receive poke */
    NOTIFY_CLIENT_POKE("notifyclientpoke"),
    /** Private chat was closed */
    NOTIFY_CLIENT_CHAT_CLOSED("notifyclientchatclosed"),
    /** Private message is being composed */
    NOTIFY_CLIENT_CHAT_COMPOSING("notifyclientchatcomposing"),
    /** Client updated */
    NOTIFY_CLIENT_UPDATED("notifyclientupdated"),
    /** Receiving client IDs */
    NOTIFY_CLIENT_IDS("notifyclientids"),
    /** Receiving client database ID from given unique ID */
    NOTIFY_CLIENT_DBID_FROM_UID("notifyclientdbidfromuid"),
    /** Receiving client name from given unique ID */
    NOTIFY_CLIENT_NAME_FROM_UID("notifyclientnamefromuid"),
    /** Receiving client name from given database ID */
    NOTIFY_CLIENT_NAME_FROM_DBID("notifyclientnamefromdbid"),
    /** Receiving client unique ID from given database ID */
    NOTIFY_CLIENT_UID_FROM_CLID("notifyclientuidfromclid"),
    /** Received connection info */
    NOTIFY_CONNECTION_INFO("notifyconnectioninfo"),
    /** Channel was created */
    NOTIFY_CHANNEL_CREATED("notifychannelcreated"),
    /** Channel was edited */
    NOTIFY_CHANNEL_EDITED("notifychanneledited"),
    /** Channel description was changed */
    NOTIFY_CHANNEL_DESCRIPTION_CHANGED("notifychanneldescriptionchanged"),
    /** Channel password was changed */
    NOTIFY_CHANNEL_PASSWORD_CHANGED("notifychannelpasswordchanged"),
    /** Channel was deleted */
    NOTIFY_CHANNEL_DELETED("notifychanneldeleted"),
    /** Channel was moved */
    NOTIFY_CHANNEL_MOVED("notifychannelmoved"),
    /** Server was edited */
    NOTIFY_SERVER_EDITED("notifyserveredited"),
    /** Server updated */
    NOTIFY_SERVER_UPDATED("notifyserverupdated"),
    /** Received channel list */
    NOTIFY_CHANNEL_LIST("channellist"),
    /** Channel list finished */
    NOTIFY_CHANNEL_LIST_FINISHED("channellistfinished"),
    /** Received text message */
    NOTIFY_TEXT_MESSAGE("notifytextmessage"),
    /** Server connection changed */
    NOTIFY_CURRENT_SERVER_CONNECTION_CHANGED("notifycurrentserverconnectionchanged"),
    /** Connection status changed */
    NOTIFY_CONNECT_STATUS_CHANGE("notifyconnectstatuschange"),
    /** Received channel group list */
    NOTIFY_CHANNEL_GROUP_LIST("notifychannelgrouplist"),
    /** Received channel group permissions list */
    NOTIFY_CHANNEL_GROUP_PERM_LIST("notifychannelgrouppermlist"),
    /** Received channel permissions list */
    NOTIFY_CHANNEL_PERM_LIST("notifychannelpermlist"),
    /** Client channel group was changed */
    NOTIFY_CLIENT_CHANNEL_GROUP_CHANGED("notifyclientchannelgroupchanged"),
    /** Subscribed to channel */
    NOTIFY_CHANNEL_SUBSCRIBED("notifychannelsubscribed"),
    /** Unsubscribed from channel */
    NOTIFY_CHANNEL_UNSUBSCRIBED("notifychannelunsubscribed"),
    /** Client lacks needed permissions */
    NOTIFY_CLIENT_NEEDED_PERMISSIONS("notifyclientneededpermissions"),
    /** Received server group list */
    NOTIFY_SERVER_GROUP_LIST("notifyservergrouplist"),
    /** Received server group permissions list */
    NOTIFY_SERVER_GROUP_PERM_LIST("notifyservergrouppermlist"),
    /** Received server group client list */
    NOTIFY_SERVER_GROUP_CLIENT_LIST("notifyservergroupclientlist"),
    /** Client was added to server group */
    NOTIFY_SERVER_GROUP_CLIENT_ADDED("notifyservergroupclientadded"),
    /** Client was removed from server group */
    NOTIFY_SERVER_GROUP_CLIENT_DELETED("notifyservergroupclientdeleted"),
    /** Receiving file list */
    NOTIFY_FILE_LIST("notifyfilelist"),
    /** File list finished */
    NOTIFY_FILE_LIST_FINISHED("notifyfilelistfinished"),
    /** Upload started */
    NOTIFY_START_UPLOAD("notifystartupload"),
    /** Download started */
    NOTIFY_START_DOWNLOAD("notifystartdownload");

    final String value;
    NotifyEvent(String value) {
        this.value = value;
    }

    /**
     * Get NotifyEvent from String as it comes from TeamSpeak client.
     *
     * @param value Notify event name
     * @return this object
     */
    public static NotifyEvent from(String value) {
        for (NotifyEvent event : NotifyEvent.values()) {
            if (event.value.equals(value))
                return event;
        }
        return null;
    }
}
