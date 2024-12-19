package io.nqa.teamspeak.query.client.model.outbound;

import io.nqa.commons.Utils;
import io.nqa.teamspeak.query.client.exception.MissingIdentifierException;
import io.nqa.teamspeak.query.client.exception.TooManyIdentifiersException;
import lombok.ToString;

/**
 * Details on client to ban.<br>
 * Requires one of the following: {@link #clid}, {@link #cldbid}
 * or {@link #uid}, the other two identifiers must be null.
 */
@ToString
public class BanClient {
    /** Client's current ID */
    public Integer clid;
    /** Client's Database ID */
    public Integer cldbid;
    /** Client's unique ID */
    public String uid;
    /** Ban duration in seconds. 0 = permanent */
    public Long time;
    /** Reason for the ban */
    public String banreason;

    /**
     * Create empty BanClient object.
     */
    public BanClient() {}

    /**
     * Set Client ID to ban.
     *
     * @param clid Client ID
     * @return this object
     */
    public BanClient clid(int clid) {
        if (Utils.notNull(this.cldbid) || Utils.notBlank(this.uid))
            this.tooManyIdentifiers();
        this.clid = clid;
        return this;
    }

    /**
     * Set Client Database ID to ban.
     *
     * @param cldbid Client Database ID
     * @return this object
     */
    public BanClient cldbid(int cldbid) {
        if (Utils.notNull(this.clid) || Utils.notBlank(this.uid))
            this.tooManyIdentifiers();
        this.cldbid = cldbid;
        return this;
    }

    /**
     * Set Client Unique ID to ban.
     *
     * @param uid Unique ID
     * @return this object
     */
    public BanClient uid(String uid) {
        if (Utils.anyNotNull(this.clid, this.cldbid))
            this.tooManyIdentifiers();
        this.uid = uid;
        return this;
    }

    /**
     * Set ban duration in seconds.
     * 0 = permanent
     *
     * @param time Time in seconds
     * @return this object
     */
    public BanClient time(long time) {
        if (Utils.isNull(this.clid, this.cldbid) || Utils.isBlank(this.uid))
            this.missingIdentifier();
        this.time = time;
        return this;
    }

    /**
     * Set ban reason.
     *
     * @param reason Reason for the ban
     * @return this object
     */
    public BanClient reason(String reason) {
        if (Utils.isNull(this.clid, this.cldbid) || Utils.isBlank(this.uid))
            this.missingIdentifier();
        this.banreason = reason;
        return this;
    }

    /**
     * Throw MissingIdentifierException
     */
    private void missingIdentifier() {
        throw new MissingIdentifierException("Requires one of the following: BanClient.clid, BanClient.cldbid or BanClient.uid");
    }

    /**
     * Throw TooManyIdentifiersException
     */
    private void tooManyIdentifiers() {
        throw new TooManyIdentifiersException("Only one of the following is allowed: BanClient.clid, BanClient.cldbid or BanClient.uid");
    }
}
