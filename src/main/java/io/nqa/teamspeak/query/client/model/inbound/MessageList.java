package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
public class MessageList extends TeamSpeakNotifyModel {
    public List<Message> messages;

    @ToString
    public static class Message {
        public int msgid;
        public String cluid;
        public String subject;
        public long timestamp;
        public int flag_read;
    }
}