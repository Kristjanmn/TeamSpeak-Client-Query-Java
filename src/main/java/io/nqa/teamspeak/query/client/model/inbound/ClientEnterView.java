package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientEnterView extends TeamSpeakNotifyModel {
    public Integer cfid;
    public Integer ctid;
    public Integer reasonid;
    public Integer clid;
    public String client_unique_identifier;
    public String client_nickname;
    public Integer client_input_muted;
    public Integer client_output_muted;
    public Integer client_outputonly_muted;
    public Integer client_input_hardware;
    public Integer client_output_hardware;
    public String client_meta_data;
    public Integer client_is_recording;
    public Integer client_database_id;
    public Integer client_channel_group_id;
    public String client_servergroups;
    public Integer client_away;
    public String client_away_message;
    public Integer client_type;
    public String client_flag_avatar;
    public Integer client_talk_power;
    public Integer client_talk_request;
    public String client_talk_request_msg;
    public String client_description;
    public Integer client_is_talker;
    public Integer client_is_priority_speaker;
    public Integer client_unread_messages;
    public String client_nickname_phonetic;
    public Integer client_needed_serverquery_view_power;
    public String client_icon_id;
    public Integer client_is_channel_commander;
    public String client_country;
    public Integer client_channel_group_inherited_channel_id;
    public String client_badges;
    public String client_myteamspeak_id;
    public String client_integrations;
    public String client_myteamspeak_avatar;
    public String client_signed_badges;
}
