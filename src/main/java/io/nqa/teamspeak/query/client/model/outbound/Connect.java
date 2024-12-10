package io.nqa.teamspeak.query.client.model.outbound;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Connect {
    public String address;
    public String password;
    public String nickname;
    public Integer channel;
    public String channel_pw;
    public String token;
}
