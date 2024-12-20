package io.nqa.teamspeak.query.client.event;

import io.nqa.teamspeak.query.client.model.inbound.ClientChannelGroupChanged;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Triggered when client channel group is changed.<br>
 * Provides {@link ClientChannelGroupChanged} object.
 */
@Getter
public class OnClientChannelGroupChanged extends ApplicationEvent {
    /** Event details */
    private final ClientChannelGroupChanged clientChannelGroupChanged;

    /**
     * Cast the event.
     *
     * @param clientChannelGroupChanged Object containing event details
     */
    public OnClientChannelGroupChanged(ClientChannelGroupChanged clientChannelGroupChanged) {
        super(clientChannelGroupChanged);
        this.clientChannelGroupChanged = clientChannelGroupChanged;
    }
}
