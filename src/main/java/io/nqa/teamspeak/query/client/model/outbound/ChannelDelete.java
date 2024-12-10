package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

/**
 * Details on which channel to delete.
 */
@Builder
@ToString
public class ChannelDelete {
    /** ID of channel to delete */
    public Integer cid;
    /** 1 = the channel will be deleted even if there are clients within */
    public Integer force;
}
