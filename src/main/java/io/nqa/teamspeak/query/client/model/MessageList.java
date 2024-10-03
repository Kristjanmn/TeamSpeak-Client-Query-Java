package io.nqa.teamspeak.query.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class MessageList {
    private int handler;

    /* notifymessagelist schandlerid=1
     * msgid=68 cluid=uZK+7iwSH2xtr7aYFYf64Krmx9Y= subject=Bad\sServer timestamp=1397278553 flag_read=1|
     * msgid=74 cluid=uZK+7iwSH2xtr7aYFYf64Krmx9Y= subject timestamp=1400005791 flag_read=1|
     * msgid=85 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject=ddos timestamp=1410664210 flag_read=1|
     * msgid=91 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject=Re:\s<no\sSubject> timestamp=1416533061 flag_read=1|
     * msgid=94 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject=Re:\s<no\sSubject> timestamp=1417048035 flag_read=1|
     * msgid=116 cluid=7601ixvWWep4rHkWKiHD3z6i0AU= subject=Re:\s<no\sSubject> timestamp=1443156989 flag_read=1|
     * msgid=124 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject timestamp=1455143032 flag_read=1|
     * msgid=126 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject timestamp=1457576058 flag_read=1|
     * msgid=131 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject=Re:\sfree\sg4me timestamp=1461019177 flag_read=1|
     * msgid=132 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject timestamp=1461044088 flag_read=1|
     * msgid=134 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject timestamp=1462326606 flag_read=1|
     * msgid=138 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject timestamp=1464491375 flag_read=1|
     * msgid=139 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject timestamp=1464503841 flag_read=1|
     * msgid=140 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject=Re:\s<no\sSubject> timestamp=1464600457 flag_read=1|
     * msgid=148 cluid=tJGpfENDHdBWW1S+7PqtJN2BopY= subject=Guest\sChannels timestamp=1476261719 flag_read=1|
     * msgid=159 cluid=Jv\/d1+pX7\/q343RrIMPTTVpob+U= subject=Out\sof\sview timestamp=1716592535 flag_read=1 */
}