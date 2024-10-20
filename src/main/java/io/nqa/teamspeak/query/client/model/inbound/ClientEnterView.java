package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientEnterView extends TeamSpeakNotifyModel {
    public int cfid;
    public int ctid;
    public int reasonid;
    public int clid;
    public String client_unique_identifier;
    public String client_nickname;
    public int client_input_muted;
    public int client_output_muted;
    public int client_outputonly_muted;
    public int client_input_hardware;
    public int client_output_hardware;
    public String client_meta_data;
    public int client_is_recording;
    public int client_database_id;
    public int client_channel_group_id;
    public String client_servergroups;
    public int client_away;
    public String client_away_message;
    public int client_type;
    public String client_flag_avatar;
    public int client_talk_power;
    public int client_talk_request;
    public String client_talk_request_msg;
    public String client_description;
    public int client_is_talker;
    public int client_is_priority_speaker;
    public int client_unread_messages;
    public String client_nickname_phonetic;
    public int client_needed_serverquery_view_power;
    public int client_icon_id;
    public int client_is_channel_commander;
    public String client_country;
    public int client_channel_group_inherited_channel_id;
    public String client_badges;
    public String client_myteamspeak_id;
    public String client_integrations;
    public String client_myteamspeak_avatar;
    public String client_signed_badges;
}
