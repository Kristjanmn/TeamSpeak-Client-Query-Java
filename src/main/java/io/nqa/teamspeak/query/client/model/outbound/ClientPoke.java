package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class ClientPoke {
    /** Message to poke with */
    public final String msg;
    /** Target Client ID */
    public final Integer clid;
}
