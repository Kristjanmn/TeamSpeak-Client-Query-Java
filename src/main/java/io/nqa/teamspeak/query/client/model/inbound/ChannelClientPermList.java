package io.nqa.teamspeak.query.client.model.inbound;

import io.nqa.teamspeak.query.client.event.OnChannelPermList;
import lombok.ToString;

/**
 * Provided with {@link OnChannelPermList} event.
 */
@ToString
public class ChannelClientPermList extends TeamSpeakNotifyModel {
    /** Channel ID */
    public Integer cid;
    /** Client Database ID */
    public Integer cldbid;
    /** Permission ID */
    public Integer permid;
    /** Permission ID as String */
    public String permsid;
    /** Permission value */
    public Integer permvalue;
    /** 1 - Permission is negated */
    public Integer permnegated;
    /** 1 - Permission gets skipped */
    public Integer permskip;

    /**
     * Create empty ChannelClientPermList object.
     */
    public ChannelClientPermList() {}
}
