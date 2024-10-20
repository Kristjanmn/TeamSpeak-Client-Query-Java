package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ChannelDeleted extends TeamSpeakNotifyModel {
    /** Invoker ID */
    public int invokerid;
    /** Invoker name */
    public String invokername;
    /** Invoker Unique ID */
    public String invokeruid;
    /** Channel ID */
    public int cid;
}
