package io.nqa.teamspeak.query.client.model.outbound;

import lombok.ToString;

/**
 * Details on which channel to delete.
 */
@ToString
public class ChannelDelete {
    /** ID of channel to delete */
    public final Integer cid;
    /** 1 - the channel will be deleted even if there are clients within */
    public Integer force;

    /**
     * Create empty ChannelDelete object.
     *
     * @param cid Channel ID
     */
    public ChannelDelete(int cid) {
        this.cid = cid;
    }

    /**
     * Create ChannelDeleted with parameters.
     *
     * @param cid channel ID
     * @param force 1 - true
     */
    public ChannelDelete(int cid, int force) {
        this.cid = cid;
        this.force = force;
    }

    /**
     * Set force to 1 (true)
     *
     * @return this object
     */
    public ChannelDelete force() {
        this.force = 1;
        return this;
    }

    /**
     * Set force variable.
     *
     * @param force 1 - true
     * @return this object
     */
    public ChannelDelete force(int force) {
        this.force = force;
        return this;
    }
}
