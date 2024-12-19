package io.nqa.teamspeak.query.client.model.inbound;

import lombok.ToString;

/**
 * Provide with ...
 */
@ToString
public class ChannelGroupClientList extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Client Database ID */
    public Integer cldbid;
    /** Channel Group ID */
    public Integer cgid;

    /**
     * Create empty ChannelGroupClientList object.
     */
    public ChannelGroupClientList() {}
}
