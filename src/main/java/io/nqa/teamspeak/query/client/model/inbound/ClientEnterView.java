package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.ClientType;
import io.nqa.teamspeak.query.client.Reason;
import io.nqa.teamspeak.query.client.event.OnClientEnterView;
import lombok.ToString;

/**
 * Provided with {@link OnClientEnterView} event.
 */
@ToString
public class ClientEnterView extends TeamSpeakNotifyModel {
    /** Channel from ID */
    public Integer cfid;
    /** Channel to ID */
    public Integer ctid;
    /** Reference {@link Reason} */
    public Integer reasonid;
    /** Client ID */
    public Integer clid;
    /** Client Unique Identifier */
    public String client_unique_identifier;
    /** Client nickname */
    public String client_nickname;
    /** 1 - Client input is muted */
    public Integer client_input_muted;
    /** 1 - Client output is muted */
    public Integer client_output_muted;
    /** 1 - Only client output is muted */
    public Integer client_outputonly_muted;
    /** 1 - Client has input device */
    public Integer client_input_hardware;
    /** 1 - Client has output device */
    public Integer client_output_hardware;
    /** Client metadata */
    public String client_meta_data;
    /** 1 - Client is recording */
    public Integer client_is_recording;
    /** Client database ID */
    public Integer client_database_id;
    /** Client channel group ID */
    public Integer client_channel_group_id;
    /** Client server-groups */
    public String client_servergroups;
    /** 1 - Client is away */
    public Integer client_away;
    /** Away message */
    public String client_away_message;
    /** Client type. See {@link ClientType} */
    public Integer client_type;
    /** Client avatar hash */
    public String client_flag_avatar;
    /** Client i_client_talk_power */
    public Integer client_talk_power;
    /** 1 - Client is requesting talk power */
    public Integer client_talk_request;
    /** Message provided with talk power request */
    public String client_talk_request_msg;
    /** Client description */
    public String client_description;
    /** 1 - Client is currently talking */
    public Integer client_is_talker;
    /** 1 - Client is priority speaker */
    public Integer client_is_priority_speaker;
    /** 1 - Client has unread offline messages */
    public Integer client_unread_messages;
    /** Client nickname pronunciation */
    public String client_nickname_phonetic;
    /** Needed server query view power */
    public Integer client_needed_serverquery_view_power;
    /** Client icon ID */
    public String client_icon_id;
    /** 1 - Client is channel commander */
    public Integer client_is_channel_commander;
    /** Client country, ex. EE - Estonia */
    public String client_country;
    /** Inherited channel group from channel */
    public Integer client_channel_group_inherited_channel_id;
    /** List of badges */
    public String client_badges;
    /** MyTeamSpeak ID */
    public String client_myteamspeak_id;
    /** Client integrations */
    public String client_integrations;
    /** Client MyTeamSpeak avatar */
    public String client_myteamspeak_avatar;
    /** List of signed badges */
    public String client_signed_badges;

    /**
     * Create empty ClientEnterView object.
     */
    public ClientEnterView() {}
}
