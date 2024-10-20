package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ServerUpdated extends TeamSpeakNotifyModel {
    public String virtualserver_welcomemessage;
    public int virtualserver_maxclients;
    public int virtualserver_clientsonline;
    public int virtualserver_channelsonline;
    public long virtualserver_uptime;
    public String virtualserver_hostmessage;
    public int virtualserver_hostmessage_mode;
    public int virtualserver_flag_password;
    public int virtualserver_default_channel_admin_group;
    // These two are set as String, because they have 20 digit value,
    // which is too big for Long and Reflect considers BigInteger field as Long
    public String virtualserver_max_download_total_bandwidth;
    public String virtualserver_max_upload_total_bandwidth;
    public int virtualserver_complain_autoban_count;
    public long virtualserver_complain_autoban_time;
    public long virtualserver_complain_remove_time;
    public int virtualserver_min_clients_in_channel_before_forced_silence;
    public int virtualserver_antiflood_points_tick_reduce;
    public int virtualserver_antiflood_points_needed_command_block;
    public int virtualserver_antiflood_points_needed_ip_block;
    public int virtualserver_client_connections;
    public long virtualserver_query_client_connections;
    public int virtualserver_queryclientsonline;
    public String virtualserver_download_quota;
    public String virtualserver_upload_quota;
    public long virtualserver_month_bytes_downloaded;
    public long virtualserver_month_bytes_uploaded;
    public long virtualserver_total_bytes_downloaded;
    public long virtualserver_total_bytes_uploaded;
    public int virtualserver_port;
    public int virtualserver_autostart;
    public int virtualserver_machine_id;
    public int virtualserver_needed_identity_security_level;
    public int virtualserver_log_client;
    public int virtualserver_log_query;
    public int virtualserver_log_channel;
    public int virtualserver_log_permissions;
    public int virtualserver_log_server;
    public int virtualserver_log_filetransfer;
    public long virtualserver_min_client_version;
    public int virtualserver_reserved_slots;
    public float virtualserver_total_packetloss_speech;
    public float virtualserver_total_packetloss_keepalive;
    public float virtualserver_total_packetloss_control;
    public float virtualserver_total_packetloss_total;
    public float virtualserver_total_ping;
    public int virtualserver_weblist_enabled;
    public long virtualserver_min_android_version;
    public long virtualserver_min_ios_version;
    public int virtualserver_antiflood_points_needed_plugin_block;
}
