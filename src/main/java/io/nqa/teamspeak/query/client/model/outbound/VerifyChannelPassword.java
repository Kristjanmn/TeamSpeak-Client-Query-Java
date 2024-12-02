package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class VerifyChannelPassword {
    /** Channel ID */
    public int cid;
    /** Channel password */
    public String password;
}
