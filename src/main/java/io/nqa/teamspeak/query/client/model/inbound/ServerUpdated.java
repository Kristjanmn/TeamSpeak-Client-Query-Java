package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ServerUpdated extends TeamSpeakNotifyModel {
    public String virtualserver_welcomemessage;
    public Integer virtualserver_maxclients;
    public Integer virtualserver_clientsonline;
    public Integer virtualserver_channelsonline;
    public Long virtualserver_uptime;
    public String virtualserver_hostmessage;
    public Integer virtualserver_hostmessage_mode;
    public Integer virtualserver_flag_password;
    public Integer virtualserver_default_channel_admin_group;
    // These two are set as String, because they have 20 digit value,
    // which is too big for Long and Reflect considers BigInteger field as Long
    public String virtualserver_max_download_total_bandwidth;
    public String virtualserver_max_upload_total_bandwidth;
    public Integer virtualserver_complain_autoban_count;
    public Long virtualserver_complain_autoban_time;
    public Long virtualserver_complain_remove_time;
    public Integer virtualserver_min_clients_in_channel_before_forced_silence;
    public Integer virtualserver_antiflood_points_tick_reduce;
    public Integer virtualserver_antiflood_points_needed_command_block;
    public Integer virtualserver_antiflood_points_needed_ip_block;
    public Integer virtualserver_client_connections;
    public Long virtualserver_query_client_connections;
    public Integer virtualserver_queryclientsonline;
    public String virtualserver_download_quota;
    public String virtualserver_upload_quota;
    public Long virtualserver_month_bytes_downloaded;
    public Long virtualserver_month_bytes_uploaded;
    public Long virtualserver_total_bytes_downloaded;
    public Long virtualserver_total_bytes_uploaded;
    public Integer virtualserver_port;
    public Integer virtualserver_autostart;
    public Integer virtualserver_machine_id;
    public Integer virtualserver_needed_identity_security_level;
    public Integer virtualserver_log_client;
    public Integer virtualserver_log_query;
    public Integer virtualserver_log_channel;
    public Integer virtualserver_log_permissions;
    public Integer virtualserver_log_server;
    public Integer virtualserver_log_filetransfer;
    public Long virtualserver_min_client_version;
    public Integer virtualserver_reserved_slots;
    public Float virtualserver_total_packetloss_speech;
    public Float virtualserver_total_packetloss_keepalive;
    public Float virtualserver_total_packetloss_control;
    public Float virtualserver_total_packetloss_total;
    public Float virtualserver_total_ping;
    public Integer virtualserver_weblist_enabled;
    public Long virtualserver_min_android_version;
    public Long virtualserver_min_ios_version;
    public Integer virtualserver_antiflood_points_needed_plugin_block;
}
