package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnConnectionInfo;
import lombok.ToString;

/**
 * Provided with {@link OnConnectionInfo} event.
 */
@ToString
public class ConnectionInfo extends TeamSpeakNotifyModel {
    /** Client ID */
    public Integer clid;
    /** Client IP address */
    public String connection_client_ip;
    /** Client port */
    public Integer connection_client_port;
    /** Client ping */
    public Double connection_ping;
    /** Client ping deviation */
    public Double connection_ping_deviation;
    /** Client connection time */
    public Long connection_connected_time;
    /** Speech packets sent */
    public Long connection_packets_sent_speech;
    /** Keepalive packets sent */
    public Long connection_packets_sent_keepalive;
    /** Control packets sent */
    public Long connection_packets_sent_control;
    /** Speech bytes sent */
    public Long connection_bytes_sent_speech;
    /** KeepAlive bytes sent */
    public Long connection_bytes_sent_keepalive;
    /** Control bytes sent */
    public Long connection_bytes_sent_control;
    /** Speech packets received */
    public Long connection_packets_received_speech;
    /** Keepalive packets received */
    public Long connection_packets_received_keepalive;
    /** Control packets received */
    public Long connection_packets_received_control;
    /** Speech bytes received */
    public Long connection_bytes_received_speech;
    /** Keepalive bytes received */
    public Long connection_bytes_received_keepalive;
    /** Control bytes received */
    public Long connection_bytes_received_control;
    /** client -> server speech packet loss */
    public Double connection_client2server_packetloss_speech;
    /** client -> server keepalive packet loss */
    public Double connection_client2server_packetloss_keepalive;
    /** client -> server control packet loss */
    public Double connection_client2server_packetloss_control;
    /** client -> server total packet loss */
    public Double connection_client2server_packetloss_total;
    /** server -> client speech packet loss */
    public Double connection_server2client_packetloss_speech;
    /** server -> client keepalive packet loss */
    public Double connection_server2client_packetloss_keepalive;
    /** server -> client control packet loss */
    public Double connection_server2client_packetloss_control;
    /** server -> client total packet loss */
    public Double connection_server2client_packetloss_total;
    /** Bandwidth sent last second for speech */
    public Long connection_bandwidth_sent_last_second_speech;
    /** Bandwidth sent last second for keepalive */
    public Long connection_bandwidth_sent_last_second_keepalive;
    /** Bandwidth sent last second for control */
    public Long connection_bandwidth_sent_last_second_control;
    /** Bandwidth sent last minute for speech */
    public Long connection_bandwidth_sent_last_minute_speech;
    /** Bandwidth sent last minute for keepalive */
    public Long connection_bandwidth_sent_last_minute_keepalive;
    /** Bandwidth sent last minute for control */
    public Long connection_bandwidth_sent_last_minute_control;
    /** Bandwidth received last second for speech */
    public Long connection_bandwidth_received_last_second_speech;
    /** Bandwidth received last second for keepalive */
    public Long connection_bandwidth_received_last_second_keepalive;
    /** Bandwidth received last second for control */
    public Long connection_bandwidth_received_last_second_control;
    /** Bandwidth received last minute for speech */
    public Long connection_bandwidth_received_last_minute_speech;
    /** Bandwidth received last minute for keepalive */
    public Long connection_bandwidth_received_last_minute_keepalive;
    /** Bandwidth received last minute for control */
    public Long connection_bandwidth_received_last_minute_control;
    /** File-transfer bandwidth sent */
    public Long connection_filetransfer_bandwidth_sent;
    /** File-transfer bandwidth received */
    public Long connection_filetransfer_bandwidth_received;
    /** Idle time in seconds */
    public Long connection_idle_time;

    /**
     * Create empty ConnectionInfo object.
     */
    public ConnectionInfo() {}
}
