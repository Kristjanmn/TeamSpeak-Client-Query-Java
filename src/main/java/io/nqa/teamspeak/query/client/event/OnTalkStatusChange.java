package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.TalkStatusChange;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnTalkStatusChange extends ApplicationEvent {
    private final TalkStatusChange talkStatus;

    public OnTalkStatusChange(final TalkStatusChange talkStatus) {
        super(talkStatus);
        this.talkStatus = talkStatus;
    }
}
