package io.nqa.teamspeak.query.client.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Message {
    private int handler;
    private int messageId;
    private String clientUniqueID;
    private String subject;
    private String message;
    private long timestamp;
    private boolean read;

    /* notifymessage
     * schandlerid=1
     * msgid=91
     * cluid=tJGpfENDHdBWW1S+7PqtJN2BopY=
     * subject=Re:\s<no\sSubject>
     * message="Kristjanmn"\swrote:\n>\sthat's\sway\smore\sthan\s5\shours\sbro\nshit\si\sknow\sforgot\si\salso\shad\sto\smove\ssome\sthings\ssince\sim\smoving\sto\sa\snew\shouse
     * timestamp=1416533061 */
}
