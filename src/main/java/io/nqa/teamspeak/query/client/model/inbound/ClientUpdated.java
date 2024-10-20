package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientUpdated extends TeamSpeakNotifyModel {
    /** Client ID */
    public int clid;
    /** Client version */
    public String client_version;
    /** Client platform */
    public String client_platform;
    /** Client nickname */
    public String client_nickname;
    public String client_login_name;
    /** 1 = Client is away */
    public int client_away;
    /** Timestamp of when client was created */
    public long client_created;
    /** Timestamp of when client was last connected */
    public long client_lastconnected;
    public int client_totalconnections;
    public long client_month_bytes_uploaded;
    public long client_month_bytes_downloaded;
    public long client_total_bytes_uploaded;
    public long client_total_bytes_downloaded;
    public long client_input_hardware;

    // notifyclientupdated
    // schandlerid=1
    // clid=335
    // client_version=3.6.2\s[Build:\s1695203293]
    // client_platform=Windows
    // client_login_name
    // client_created=1396725449
    // client_lastconnected=1728541859
    // client_totalconnections=4762
    // client_month_bytes_uploaded=1967516
    // client_month_bytes_downloaded=83791033
    // client_total_bytes_uploaded=6805212607
    // client_total_bytes_downloaded=6335332969
    // client_input_hardware=0
}
