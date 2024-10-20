package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Message extends TeamSpeakNotifyModel {
    public int msgid;
    public String cluid;
    public String subject;
    public String message;
    public long timestamp;
    public boolean read;

    /* notifymessage
     * schandlerid=1
     * msgid=91
     * cluid=tJGpfENDHdBWW1S+7PqtJN2BopY=
     * subject=Re:\s<no\sSubject>
     * message="Kristjanmn"\swrote:\n>\sthat's\sway\smore\sthan\s5\shours\sbro\nshit\si\sknow\sforgot\si\salso\shad\sto\smove\ssome\sthings\ssince\sim\smoving\sto\sa\snew\shouse
     * timestamp=1416533061 */
}
