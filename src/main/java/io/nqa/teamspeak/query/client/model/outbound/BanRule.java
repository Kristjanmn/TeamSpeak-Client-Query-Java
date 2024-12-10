package io.nqa.teamspeak.query.client.model.outbound;

import io.nqa.commons.Utils;
import io.nqa.teamspeak.query.client.exception.MissingIdentifierException;
import lombok.ToString;

/**
 * Details on new ban rule.
 * All parameters are optional, but at least one of the following
 * must be set: {@link #ip}, {@link #name} or {@link #uid}.
 */
@ToString
public class BanRule {
    /** IP address, can be regex */
    public String ip;
    /** Name to ban, can be regex */
    public String name;
    /** Unique ID */
    public String uid;
    /** Ban duration in seconds */
    public Long time;
    /** Reason for the ban */
    public String banreason;

    /**
     * Set IP Address to ban.
     *
     * @param ip IP Address
     * @return this object
     */
    public BanRule ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Set name to ban.
     *
     * @param name Name to ban
     * @return this object
     */
    public BanRule name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Set Unique Identifier to ban.
     *
     * @param uid Unique Identifier
     * @return this object
     */
    public BanRule uid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Set ban duration. 0 and null equals infinite.
     *
     * @param time Ban duration in seconds
     * @return this object
     */
    public BanRule time(long time) {
        if (Utils.isBlank(this.ip, this.name, this.uid))
            missingIdentifier();
        this.time = time;
        return this;
    }

    /**
     * Set reason for the ban.
     *
     * @param reason Ban reason in plain text
     * @return this object
     */
    public BanRule reason(String reason) {
        if (Utils.isBlank(this.ip, this.name, this.uid))
            missingIdentifier();
        this.banreason = reason;
        return this;
    }

    /**
     * Throw MissingIdentifierException
     */
    private void missingIdentifier() {
        throw new MissingIdentifierException("Requires at least one of the following: BanRule.ip, BanRule.name or BanRule.uid");
    }
}
