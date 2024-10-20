package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ConnectionInfo extends TeamSpeakNotifyModel {
    public int clid;
    public String connection_client_ip;
    public int connection_client_port;
    public double connection_ping;
    public double connection_ping_deviation;
    public long connection_connected_time;
    public long connection_packets_sent_speech;
    public long connection_packets_sent_keepalive;
    public long connection_packets_sent_control;
    public long connection_bytes_sent_speech;
    public long connection_bytes_sent_keepalive;
    public long connection_bytes_sent_control;
    public long connection_packets_received_speech;
    public long connection_packets_received_keepalive;
    public long connection_packets_received_control;
    public long connection_bytes_received_speech;
    public long connection_bytes_received_keepalive;
    public long connection_bytes_received_control;
    public double connection_client2server_packetloss_speech;
    public double connection_client2server_packetloss_keepalive;
    public double connection_client2server_packetloss_control;
    public double connection_client2server_packetloss_total;
    public double connection_server2client_packetloss_speech;
    public double connection_server2client_packetloss_keepalive;
    public double connection_server2client_packetloss_control;
    public double connection_server2client_packetloss_total;
    public long connection_bandwidth_sent_last_second_speech;
    public long connection_bandwidth_sent_last_second_keepalive;
    public long connection_bandwidth_sent_last_second_control;
    public long connection_bandwidth_sent_last_minute_speech;
    public long connection_bandwidth_sent_last_minute_keepalive;
    public long connection_bandwidth_sent_last_minute_control;
    public long connection_bandwidth_received_last_second_speech;
    public long connection_bandwidth_received_last_second_keepalive;
    public long connection_bandwidth_received_last_second_control;
    public long connection_bandwidth_received_last_minute_speech;
    public long connection_bandwidth_received_last_minute_keepalive;
    public long connection_bandwidth_received_last_minute_control;
    public long connection_filetransfer_bandwidth_sent;
    public long connection_filetransfer_bandwidth_received;
    public long connection_idle_time;
}
