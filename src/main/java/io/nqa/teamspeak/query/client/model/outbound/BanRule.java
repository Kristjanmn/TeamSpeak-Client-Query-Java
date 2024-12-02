package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

/**
 * Details on new ban rule.
 */
@Builder
@ToString
public class BanRule {
    /** IP address */
    public String ip;
    /** Name to ban */
    public String name;
    /** Unique ID */
    public String uid;
    /** Ban duration in seconds */
    public long time;
    /** Reason for the ban */
    public String banreason;
}
