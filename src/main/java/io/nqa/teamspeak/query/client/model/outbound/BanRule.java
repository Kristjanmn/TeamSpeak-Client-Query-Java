package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class BanRule {
    private String ipAddress;   // regexp
    private String name;        // regexp
    private String clientUid;
    private long time;
    private String reason;
}
