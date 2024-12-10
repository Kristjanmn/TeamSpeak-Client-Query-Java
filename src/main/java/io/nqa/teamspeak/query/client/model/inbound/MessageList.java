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
        public Integer msgid;
        public String cluid;
        public String subject;
        public Long timestamp;
        public Integer flag_read;
    }
}