package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.TalkStatus;
import io.nqa.teamspeak.query.client.event.OnTalkStatusChange;
import lombok.ToString;

/**
 * Provided with {@link OnTalkStatusChange} event.
 */
@ToString
public class TalkStatusChange extends TeamSpeakNotifyModel {
    /** Reference {@link TalkStatus} */
    public Integer status;
    /** 1 - Whisper */
    public Integer isreceivedwhisper;
    /** Talking Client ID */
    public Integer clid;

    /**
     * Create empty TalkStatusChange object.
     */
    public TalkStatusChange() {}
}
