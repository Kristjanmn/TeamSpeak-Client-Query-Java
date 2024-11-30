package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BanRule {
    private String ip;
    private String name;
    private String uid;
    private long time;
    private String banreason;
}
