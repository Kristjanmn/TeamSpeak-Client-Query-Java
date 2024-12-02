package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

/**
 * Details on client to ban.
 */
@Builder
@ToString
public class BanClient {
    /** Client's current ID */
    public int clid;
    /** Client's Database ID */
    public int cldbid;
    /** Client's unique ID */
    public String uid;
    /** Ban duration in seconds. 0 = permanent */
    public long time;
    /** Reason for the ban */
    public String banreason;
}
