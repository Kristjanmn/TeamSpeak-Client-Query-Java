package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.BanList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OnBanList extends ApplicationEvent {
    private final BanList banList;

    public OnBanList(BanList banList) {
        super(banList);
        this.banList = banList;
    }
}
