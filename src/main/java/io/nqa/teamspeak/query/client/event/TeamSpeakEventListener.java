package io.nqa.teamspeak.query.client.event;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Lazy(false)
@Component
public class TeamSpeakEventListener {
    @EventListener
    @Async
    public void onTalkStatusChange(OnTalkStatusChange event) {}

    @EventListener
    @Async
    public void onMessage(OnMessage event) {}

    @EventListener
    @Async
    public void onMessageList(OnMessageList event) {}

    // complain list

    @EventListener
    @Async
    public void onBanList(OnBanList event) {}

    @EventListener
    @Async
    public void onClientMoved(OnClientMoved event) {}

    @EventListener
    @Async
    public void onClientLeftView(OnClientLeftView event) {}

    @EventListener
    @Async
    public void onClientEnterView(OnClientEnterView event) {}

    @EventListener
    @Async
    public void onClientPoke(OnClientPoke event) {}

    @EventListener
    @Async
    public void onClientChatClosed(OnClientChatClosed event) {}

    // client chat composing

    @EventListener
    @Async
    public void onClientUpdated(OnClientUpdated event) {}

    // client ids
    // client dbid from uid
    // client name from dbid
    // client uid from clid

    @EventListener
    @Async
    public void onConnectionInfo(OnConnectionInfo event) {}

    @EventListener
    @Async
    public void onChannelCreated(OnChannelCreated event) {}

    @EventListener
    @Async
    public void onChannelEdited(OnChannelEdited event) {}

    @EventListener
    @Async
    public void onChannelDescriptionChanged(OnChannelDescriptionChanged event) {}

    @EventListener
    @Async
    public void onChannelPasswordChanged(OnChannelPasswordChanged event) {}

    @EventListener
    @Async
    public void onChannelDeleted(OnChannelDeleted event) {}

    @EventListener
    @Async
    public void onChannelMoved(OnChannelMoved event) {}

    @EventListener
    @Async
    public void onServerEdited(OnServerEdited event) {}

    @EventListener
    @Async
    public void onServerUpdated(OnServerUpdated event) {}

    @EventListener
    @Async
    public void onChannelList(OnChannelList event) {}

    @EventListener
    @Async
    public void onChannelListFinished(OnChannelListFinished event) {}

    @EventListener
    @Async
    public void onTextMessage(OnTextMessage event) {}

    @EventListener
    @Async
    public void onCurrentServerConnectionChanged(OnCurrentServerConnectionChanged event) {}

    @EventListener
    @Async
    public void onConnectStatusChange(OnConnectStatusChange event) {}

    @EventListener
    @Async
    public void onChannelGroupList(OnChannelGroupList event) {}

    @EventListener
    @Async
    public void onChannelGroupPermList(OnChannelGroupPermList event) {}

    @EventListener
    @Async
    public void onChannelPermList(OnChannelPermList event) {}

    @EventListener
    @Async
    public void onClientChannelGroupChanged(OnClientChannelGroupChanged event) {}

    @EventListener
    @Async
    public void onChannelSubscribed(OnChannelSubscribed event) {}

    @EventListener
    @Async
    public void onChannelUnsubscribed(OnChannelUnsubscribed event) {}

    @EventListener
    @Async
    public void onClientNeededPermissions(OnClientNeededPermissions event) {}

    @EventListener
    @Async
    public void onServerGroupList(OnServerGroupList event) {}

    @EventListener
    @Async
    public void onServerGroupPermList(OnServerGroupPermList event) {}

    @EventListener
    @Async
    public void onServerGroupClientList(OnServerGroupClientList event) {}

    @EventListener
    @Async
    public void onServerGroupClientAdded(OnServerGroupClientAdded event) {}

    @EventListener
    @Async
    public void onServerGroupClientDeleted(OnServerGroupClientDeleted event) {}

    @EventListener
    @Async
    public void onFileList(OnFileList event) {}

    @EventListener
    @Async
    public void onFileListFinished(OnFileListFinished event) {}

    @EventListener
    @Async
    public void onStartUpload(OnStartUpload event) {}

    @EventListener
    @Async
    public void onStartDownload(OnStartDownload event) {}
}
