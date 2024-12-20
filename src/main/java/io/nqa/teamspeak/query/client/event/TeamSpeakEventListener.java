package io.nqa.teamspeak.query.client.event;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Listeners for incoming events from TeamSpeak client.
 */
@Lazy(false)
@Component
public class TeamSpeakEventListener {
    /**
     * Default constructor
     */
    public TeamSpeakEventListener() {}

    /**
     * Triggered upon receiving notifybanlist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onBanList(OnBanList event) {}

    /**
     * Triggered upon receiving notifychannelcreated from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelCreated(OnChannelCreated event) {}

    /**
     * Triggered upon receiving notifychanneldeleted from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelDeleted(OnChannelDeleted event) {}

    /**
     * Triggered upon receiving notifychanneldescriptionchanged from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelDescriptionChanged(OnChannelDescriptionChanged event) {}

    /**
     * Triggered upon receiving notifychanneledited from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelEdited(OnChannelEdited event) {}

    /**
     * Triggered upon receiving notifychannelgrouplist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelGroupList(OnChannelGroupList event) {}

    /**
     * Triggered upon receiving notifychannelgrouppermlist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelGroupPermList(OnChannelGroupPermList event) {}

    /**
     * Triggered upon receiving notifychannellist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelList(OnChannelList event) {}

    /**
     * Triggered upon receiving notifychannellistfinished from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelListFinished(OnChannelListFinished event) {}

    /**
     * Triggered upon receiving notifychannelmoved from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelMoved(OnChannelMoved event) {}

    /**
     * Triggered upon receiving notifychannelpasswordchanged from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelPasswordChanged(OnChannelPasswordChanged event) {}

    /**
     * Triggered upon receiving notifychannelpermlist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelPermList(OnChannelPermList event) {}

    /**
     * Triggered upon receiving notifychannelsubscribed from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelSubscribed(OnChannelSubscribed event) {}

    /**
     * Triggered upon receiving notifychannelunsubscribed from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onChannelUnsubscribed(OnChannelUnsubscribed event) {}

    /**
     * Triggered upon receiving notifyclientchannelgroupchanged from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientChannelGroupChanged(OnClientChannelGroupChanged event) {}

    /**
     * Triggered upon receiving notifyclientchatclosed from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientChatClosed(OnClientChatClosed event) {}

    /**
     * Triggered upon receiving notifyclientchatcomposing from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientChatComposing(OnClientChatComposing event) {}

    /**
     * Triggered upon receiving notifycliententerview from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientEnterView(OnClientEnterView event) {}

    /**
     * Triggered upon receiving notifyclientleftview from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientLeftView(OnClientLeftView event) {}

    /**
     * Triggered upon receiving notifyclientmoved from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientMoved(OnClientMoved event) {}

    /**
     * Triggered upon receiving notifyclientneededpermissions from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientNeededPermissions(OnClientNeededPermissions event) {}

    /**
     * Triggered upon receiving notifyclientpoke from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientPoke(OnClientPoke event) {}

    /**
     * Triggered upon receiving notifyclientupdated from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onClientUpdated(OnClientUpdated event) {}

    /**
     * Triggered upon receiving notifyconnectioninfo from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onConnectionInfo(OnConnectionInfo event) {}

    /**
     * Triggered upon receiving notifyconnectionstatuschange from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onConnectStatusChange(OnConnectStatusChange event) {}

    /**
     * Triggered upon receiving notifycurrentserverconnectionchanged from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onCurrentServerConnectionChanged(OnCurrentServerConnectionChanged event) {}

    /**
     * Triggered upon receiving notifyfilelist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onFileList(OnFileList event) {}

    /**
     * Triggered upon receiving notifyfilelistfinished from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onFileListFinished(OnFileListFinished event) {}

    /**
     * Triggered upon receiving notifymessage from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onMessage(OnMessage event) {}

    /**
     * Triggered upon receiving notifymessagelist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onMessageList(OnMessageList event) {}

    /**
     * Triggered upon receiving notifyserveredited from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onServerEdited(OnServerEdited event) {}

    /**
     * Triggered upon receiving notifyservergroupclientadded from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onServerGroupClientAdded(OnServerGroupClientAdded event) {}

    /**
     * Triggered upon receiving notifyservergroupclientdeleted from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onServerGroupClientDeleted(OnServerGroupClientDeleted event) {}

    /**
     * Triggered upon receiving notifyservergroupclientlist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onServerGroupClientList(OnServerGroupClientList event) {}

    /**
     * Triggered upon receiving notifyservergrouplist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onServerGroupList(OnServerGroupList event) {}

    /**
     * Triggered upon receiving notifyservergrouppermlist from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onServerGroupPermList(OnServerGroupPermList event) {}

    /**
     * Triggered upon receiving notifyserverupdated from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onServerUpdated(OnServerUpdated event) {}

    /**
     * Triggered upon receiving notifystartdownload from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onStartDownload(OnStartDownload event) {}

    /**
     * Triggered upon receiving notifystartupload from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onStartUpload(OnStartUpload event) {}

    /**
     * Triggered upon receiving notifytalkstatuschange from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onTalkStatusChange(OnTalkStatusChange event) {}

    /**
     * Triggered upon receiving notifytextmessage from TeamSpeak client.
     *
     * @param event event to listen for
     */
    @EventListener
    @Async
    public void onTextMessage(OnTextMessage event) {}

    // complain list
    // client ids
    // client dbid from uid
    // client name from dbid
    // client uid from clid
}
