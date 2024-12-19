package io.nqa.teamspeak.query.client.model.outbound;

import lombok.ToString;

/**
 * Object containing new connection information.
 */
@ToString
public class Connect {
    /** Server address */
    public String address;
    /** Server password */
    public String password;
    /** Nickname to use */
    public String nickname;
    /** Channel ID to join */
    public Integer channel;
    /** Channel password */
    public String channel_pw;
    /** Server token */
    public String token;

    /**
     * Create empty Connect object.
     */
    public Connect() {}

    /**
     * Set address to connect to.
     *
     * @param address Server address
     * @return this object
     */
    public Connect address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Set password to use when connecting to server. Needed if server is password protected.
     *
     * @param password Server password
     * @return this object
     */
    public Connect password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Set nickname to use once connected.
     *
     * @param nickname Nickname to use
     * @return this object
     */
    public Connect nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * Set channel ID to join.
     *
     * @param channel Channel ID
     * @return this object
     */
    public Connect channel(int channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Set channel password to use. Needed if connection directly to password protected channel.
     * @param channel_pw Channel password
     * @return this object
     */
    public Connect channel_pw(String channel_pw) {
        this.channel_pw = channel_pw;
        return this;
    }

    /**
     * Set server token to use upon successful connection.
     *
     * @param token Server token
     * @return this object
     */
    public Connect token(String token) {
        this.token = token;
        return this;
    }
}
