package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BanClient {
    private int clid;
    private int cldbid;
    private String uid;
    private long time;
    private String banreason;
}
