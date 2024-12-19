package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnClientUpdated;
import lombok.ToString;

/**
 * Provided with {@link OnClientUpdated} event.
 */
@ToString
public class ClientUpdated extends TeamSpeakNotifyModel {
    /** Client ID */
    public Integer clid;
    /** Invoker ID */
    public Integer invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker unique ID */
    public String invokeruid;
    /** Client version */
    public String client_version;
    /** Client platform */
    public String client_platform;
    /** Client nickname */
    public String client_nickname;
    /** Client description */
    public String client_description;
    /** Client login name */
    public String client_login_name;
    /** 1 - Client is away */
    public Integer client_away;
    /** Away message */
    public String client_away_message;
    /** Timestamp of when client was created (first connected this server) */
    public Long client_created;
    /** Timestamp of when client was last connected */
    public Long client_lastconnected;
    /** Total amount of client connections */
    public Integer client_totalconnections;
    /** Number of bytes client has uploaded this month */
    public Long client_month_bytes_uploaded;
    /** Number of bytes client has downloaded this month */
    public Long client_month_bytes_downloaded;
    /** Number of total bytes client has uploaded */
    public Long client_total_bytes_uploaded;
    /** Number of total bytes client has downloaded */
    public Long client_total_bytes_downloaded;
    /** 1 - Client has input device */
    public Integer client_input_hardware;
    /** 1 - Client input is muted */
    public Integer client_input_muted;
    /** 1 - Client has output device */
    public Integer client_output_hardware;
    /** 1 - Client output is muted */
    public Integer client_output_muted;
    /** 1 - Client is priority speaker */
    public Integer client_is_priority_speaker;
    /** 1 - Client is channel commander */
    public Integer client_is_channel_commander;
    /** Number of unread messages */
    public Integer client_unread_messages;
    /** 1 - Client has avatar */
    public Integer client_flag_avatar;
    /** Signed badges */
    public String client_signed_badges;
    /** 1 - Client has requested permissions to talk */
    public Integer client_talk_request;
    /** 1 - Talk request message */
    public String client_talk_request_msg;
    /** 1 - Client is currently speaking */
    public Integer client_is_talker;
    /** 1 - Client is recording */
    public Integer client_is_recording;
    /** Client server groups. E.g. 532,821 */
    public String client_servergroups;
    /** Client MyTeamSpeak ID */
    public String client_myteamspeakid;
    /** Client badges */
    public String client_badges;
    /** Client MyTeamSpeak avatar */
    public String client_myteamspeak_avatar;
    /** Client i_client_talk_power */
    public Integer client_talk_power;
    /** Client icon ID */
    public String client_icon_id;
    /** Channel group inherited from channel? */
    public Integer client_channel_group_inherited_channel_id;
    /** Channel group ID */
    public Integer client_channel_group_id;
    /** Client i_client_needed_serverquery_view_power */
    public Integer client_needed_serverquery_view_power;
    /** Client tag */
    public String client_user_tag;

    /**
     * Create empty ClientUpdated object.
     */
    public ClientUpdated() {}
}
