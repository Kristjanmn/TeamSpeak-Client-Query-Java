package io.nqa.teamspeak.query.client;

public enum NotifyEvent {
    NOTIFY_TALK_STATUS_CHANGE("notifytalkstatuschange"),
    NOTIFY_MESSAGE("notifymessage"),
    NOTIFY_MESSAGE_LIST("notifymessagelist"),
    NOTIFY_COMPLAIN_LIST("notifycomplainlist"),
    NOTIFY_BAN_LIST("notifybanlist"),
    NOTIFY_CLIENT_MOVED("notifyclientmoved"),
    NOTIFY_CLIENT_LEFT_VIEW("notifyclientleftview"),
    NOTIFY_CLIENT_ENTER_VIEW("notifycliententerview"),
    NOTIFY_CLIENT_POKE("notifyclientpoke"),
    NOTIFY_CLIENT_CHAT_CLOSED("notifyclientchatclosed"),
    NOTIFY_CLIENT_CHAT_COMPOSING("notifyclientchatcomposing"),
    NOTIFY_CLIENT_UPDATE("notifyclientupdate"),
    NOTIFY_CLIENT_IDS("notifyclientids"),
    NOTIFY_CLIENT_DBID_FROM_UID("notifyclientdbidfromuid"),
    NOTIFY_CLIENT_NAME_FROM_UID("notifyclientnamefromuid"),
    NOTIFY_CLIENT_NAME_FROM_DBID("notifyclientnamefromdbid"),
    NOTIFY_CLIENT_UID_FROM_CLID("notifyclientuidfromclid"),
    NOTIFY_CONNECTION_INFO("notifyconnectioninfo"),
    NOTIFY_CHANNEL_CREATED("notifychannelcreated"),
    NOTIFY_CHANNEL_EDITED("notifychanneledited"),
    NOTIFY_CHANNEL_DELETED("notifychanneldeleted"),
    NOTIFY_CHANNEL_MOVED("notifychannelmoved"),
    NOTIFY_SERVER_EDITED("notifyserveredited"),
    NOTIFY_SERVER_UPDATED("notifyserverupdated"),
    NOTIFY_CHANNEL_LIST("channellist"),
    NOTIFY_CHANNEL_LIST_FINISHED("channellistfinished"),
    NOTIFY_TEXT_MESSAGE("notifytextmessage"),
    NOTIFY_CURRENT_SERVER_CONNECTION_CHANGED("notifycurrentserverconnectionchanged"),
    NOTIFY_CONNECT_STATUS_CHANGE("notifyconnectstatuschange"),
    NOTIFY_CHANNEL_GROUP_LIST("notifychannelgrouplist"),
    NOTIFY_CLIENT_CHANNEL_GROUP_CHANGED("notifyclientchannelgroupchanged"),
    NOTIFY_CHANNEL_SUBSCRIBED("notifychannelsubscribed"),
    NOTIFY_CLIENT_NEEDED_PERMISSIONS("notifyclientneededpermissions"),
    NOTIFY_SERVER_GROUP_LIST("notifyservergrouplist");

    NotifyEvent(String value) {
    }
}
