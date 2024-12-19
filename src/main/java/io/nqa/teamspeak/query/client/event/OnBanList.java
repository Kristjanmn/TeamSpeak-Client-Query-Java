package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.BanList;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered upon receiving ban list from TeamSpeak client.<br>
 * Provides {@link BanList} object.
 */
@Getter
public class OnBanList extends ApplicationEvent {
    /** List of bans received from client */
    private final BanList banList;

    /**
     * Cast the event.
     *
     * @param banList Object containing event details
     */
    public OnBanList(BanList banList) {
        super(banList);
        this.banList = banList;
    }
}
