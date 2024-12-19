package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.HostMessageMode;
import io.nqa.teamspeak.query.client.event.OnServerUpdated;
import lombok.ToString;

/**
 * Provided with {@link OnServerUpdated} event.
 */
@ToString
public class ServerUpdated extends TeamSpeakNotifyModel {
    /** Welcome message displayed upon connecting to server */
    public String virtualserver_welcomemessage;
    /** Maximum amount of clients permitted to be connected at one time */
    public Integer virtualserver_maxclients;
    /** Current amount of connected clients */
    public Integer virtualserver_clientsonline;
    /** Current amount of channels in server */
    public Integer virtualserver_channelsonline;
    /** Server uptime TODO: confirm chosen variable type */
    public Long virtualserver_uptime;
    /** Virtual server host message */
    public String virtualserver_hostmessage;
    /** Method the host message is displayed. See {@link HostMessageMode} */
    public Integer virtualserver_hostmessage_mode;
    /** 1 - server is password protected */
    public Integer virtualserver_flag_password;
    /** ID of channel group automatically given to client that created the channel */
    public Integer virtualserver_default_channel_admin_group;
    // These two are set as String, because they have 20 digit value,
    // which is too big for Long and Reflect considers BigInteger field as Long
    /** Maximum total download speed between all clients, in bytes/s */
    public String virtualserver_max_download_total_bandwidth;
    /** Maximum total upload speed between all clients, in bytes/s */
    public String virtualserver_max_upload_total_bandwidth;
    /** Amount of complaints needed for client to be auto-banned */
    public Integer virtualserver_complain_autoban_count;
    /** Duration of the auto-ban in seconds resulted by receiving too many complaints */
    public Long virtualserver_complain_autoban_time;
    /** Time in seconds before complaint gets deleted */
    public Long virtualserver_complain_remove_time;
    /** Number of clients in channel before channel_force_silence is enabled */
    public Integer virtualserver_min_clients_in_channel_before_forced_silence;
    /** Number of anti-flood points to remove per 1/2 second */
    public Integer virtualserver_antiflood_points_tick_reduce;
    /** Required amount of anti-flood points to block commands */
    public Integer virtualserver_antiflood_points_needed_command_block;
    /** Required amount of anti-flood points to block IP address */
    public Integer virtualserver_antiflood_points_needed_ip_block;
    /** Number of regular client connections since server start */
    public Integer virtualserver_client_connections;
    /** Number of query client connections since server start */
    public Long virtualserver_query_client_connections;
    /** Number of query clients currently connected */
    public Integer virtualserver_queryclientsonline;
    /** File download quota in bytes per month */
    public String virtualserver_download_quota;
    /** File upload quota in bytes per month */
    public String virtualserver_upload_quota;
    /** Number of bytes downloaded this month */
    public Long virtualserver_month_bytes_downloaded;
    /** Number of bytes uploaded this month */
    public Long virtualserver_month_bytes_uploaded;
    /** Total number of byes downloaded */
    public Long virtualserver_total_bytes_downloaded;
    /** Total number of bytes uploaded */
    public Long virtualserver_total_bytes_uploaded;
    /** Virtual server port number */
    public Integer virtualserver_port;
    /** 1 - virtual server is set to start automatically when main TeamSpeak server starts */
    public Integer virtualserver_autostart;
    /** Virtual server machine ID */
    public Integer virtualserver_machine_id;
    /** Level of identity security required to connect to the server */
    public Integer virtualserver_needed_identity_security_level;
    /** 1 - server logs client activity */
    public Integer virtualserver_log_client;
    /** 1 - server logs query client activity */
    public Integer virtualserver_log_query;
    /** 1 - server logs channel related activity */
    public Integer virtualserver_log_channel;
    /** 1 - server logs permission changes */
    public Integer virtualserver_log_permissions;
    /** 1 - server logs server? */
    public Integer virtualserver_log_server;
    /** 1 - server logs file transfers */
    public Integer virtualserver_log_filetransfer;
    /** Overall minimum client version? */
    public Long virtualserver_min_client_version;
    /** Amount of slots reserved for clients with groups which
     * have b_client_use_reserved_slot permission set to 1 */
    public Integer virtualserver_reserved_slots;
    /** Total amount of speech packets lost */
    public Float virtualserver_total_packetloss_speech;
    /** Total amount of keepalive packets lost */
    public Float virtualserver_total_packetloss_keepalive;
    /** Total amount of control packets lost */
    public Float virtualserver_total_packetloss_control;
    /** Total amount of packets lost */
    public Float virtualserver_total_packetloss_total;
    /** Total ping? */
    public Float virtualserver_total_ping;
    /** 1 - server is visible in server browser */
    public Integer virtualserver_weblist_enabled;
    /** Minimum required Android app version */
    public Long virtualserver_min_android_version;
    /** Minimum required Apple app version */
    public Long virtualserver_min_ios_version;
    /** Number of anti-flood points required for client plugin to be blocked */
    public Integer virtualserver_antiflood_points_needed_plugin_block;

    /**
     * Create empty ServerUpdated object.
     */
    public ServerUpdated() {}
}
