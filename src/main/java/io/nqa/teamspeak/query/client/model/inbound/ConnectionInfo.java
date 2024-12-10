package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ConnectionInfo extends TeamSpeakNotifyModel {
    public Integer clid;
    public String connection_client_ip;
    public Integer connection_client_port;
    public Double connection_ping;
    public Double connection_ping_deviation;
    public Long connection_connected_time;
    public Long connection_packets_sent_speech;
    public Long connection_packets_sent_keepalive;
    public Long connection_packets_sent_control;
    public Long connection_bytes_sent_speech;
    public Long connection_bytes_sent_keepalive;
    public Long connection_bytes_sent_control;
    public Long connection_packets_received_speech;
    public Long connection_packets_received_keepalive;
    public Long connection_packets_received_control;
    public Long connection_bytes_received_speech;
    public Long connection_bytes_received_keepalive;
    public Long connection_bytes_received_control;
    public Double connection_client2server_packetloss_speech;
    public Double connection_client2server_packetloss_keepalive;
    public Double connection_client2server_packetloss_control;
    public Double connection_client2server_packetloss_total;
    public Double connection_server2client_packetloss_speech;
    public Double connection_server2client_packetloss_keepalive;
    public Double connection_server2client_packetloss_control;
    public Double connection_server2client_packetloss_total;
    public Long connection_bandwidth_sent_last_second_speech;
    public Long connection_bandwidth_sent_last_second_keepalive;
    public Long connection_bandwidth_sent_last_second_control;
    public Long connection_bandwidth_sent_last_minute_speech;
    public Long connection_bandwidth_sent_last_minute_keepalive;
    public Long connection_bandwidth_sent_last_minute_control;
    public Long connection_bandwidth_received_last_second_speech;
    public Long connection_bandwidth_received_last_second_keepalive;
    public Long connection_bandwidth_received_last_second_control;
    public Long connection_bandwidth_received_last_minute_speech;
    public Long connection_bandwidth_received_last_minute_keepalive;
    public Long connection_bandwidth_received_last_minute_control;
    public Long connection_filetransfer_bandwidth_sent;
    public Long connection_filetransfer_bandwidth_received;
    public Long connection_idle_time;
}
