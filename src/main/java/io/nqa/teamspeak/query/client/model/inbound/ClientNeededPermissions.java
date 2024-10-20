package io.nqa.teamspeak.query.client.model.inbound;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ClientNeededPermissions extends TeamSpeakNotifyModel {
    /** Permission ID */
    public int permid;
    /** Permission value */
    public int permvalue;
}
