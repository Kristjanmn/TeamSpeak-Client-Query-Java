package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class ChannelAddPerm {
    private int cid;
    private int permid;
    private String permsid;
    private int permvalue;
}
