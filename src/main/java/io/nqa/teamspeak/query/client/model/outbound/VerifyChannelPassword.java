package io.nqa.teamspeak.query.client.model.outbound;

/**
 * Object for verifying channel password.
 */
public class VerifyChannelPassword {
    /** Channel ID */
    public final Integer cid;
    /** Channel password */
    public final String password;

    public VerifyChannelPassword(int cid, String password) {
        this.cid = cid;
        this.password = password;
    }
}
