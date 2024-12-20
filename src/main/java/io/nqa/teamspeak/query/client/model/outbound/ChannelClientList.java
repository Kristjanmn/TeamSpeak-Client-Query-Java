package io.nqa.teamspeak.query.client.model.outbound;

/**
 * Details on channelclientlist request.
 */
public class ChannelClientList {
    /** Channel ID */
    public final Integer cid;
    /**
     * Provides additional parameter(s):<br>
     * client_unique_identifier
     */
    public Boolean uid;
    /**
     * Provides additional parameter(s):<br>
     * client_away<br>
     * client_away_message
     */
    public Boolean away;
    /**
     * Provides additional parameter(s):<br>
     * client_flag_talking<br>
     * client_input_muted<br>
     * client_output_muted<br>
     * client_input_hardware<br>
     * client_output_hardware<br>
     * client_talk_power<br>
     * client_is_talker<br>
     * client_is_priority_speaker<br>
     * client_is_recording<br>
     * client_is_channel_commander<br>
     * client_is_muted
     */
    public Boolean voice;
    /**
     * Provides additional parameter(s):<br>
     * client_servergroups<br>
     * client_channel_group_id
     */
    public Boolean groups;
    /**
     * Provides additional parameter(s):<br>
     * client_icon_id
     */
    public Boolean icon;
    /**
     * Provides additional parameter(s):<br>
     * client_country
     */
    public Boolean country;

    /**
     * Create ChannelClientList object.
     *
     * @param cid Channel ID
     */
    public ChannelClientList(int cid) {
        this.cid = cid;
    }

    /**
     * Set {@link #uid} to true.
     *
     * @return this object
     */
    public ChannelClientList uid() {
        this.uid = true;
        return this;
    }

    /**
     * Set {@link #uid}.
     *
     * @param uid show additional parameters
     * @return this object
     */
    public ChannelClientList uid(boolean uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Set {@link #away} to true.
     *
     * @return this object
     */
    public ChannelClientList away() {
        this.away = true;
        return this;
    }

    /**
     * Set {@link #away}.
     *
     * @param away show additional parameters
     * @return this object
     */
    public ChannelClientList away(boolean away) {
        this.away = away;
        return this;
    }

    /**
     * Set {@link #voice} to true.
     *
     * @return this object
     */
    public ChannelClientList voice() {
        this.voice = true;
        return this;
    }

    /**
     * Set {@link #voice}.
     *
     * @param voice show additional parameters
     * @return this object
     */
    public ChannelClientList voice(boolean voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Set {@link #groups} to true.
     *
     * @return this object
     */
    public ChannelClientList groups() {
        this.groups = true;
        return this;
    }

    /**
     * Set {@link #groups}.
     *
     * @param groups show additional parameters
     * @return this object
     */
    public ChannelClientList groups(boolean groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Set {@link #icon} to true.
     *
     * @return this object
     */
    public ChannelClientList icon() {
        this.icon = true;
        return this;
    }

    /**
     * Set {@link #icon}.
     *
     * @param icon show additional parameters
     * @return this object
     */
    public ChannelClientList icon(boolean icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Set {@link #country} to true.
     *
     * @return this object
     */
    public ChannelClientList country() {
        this.country = true;
        return this;
    }

    /**
     * Set {@link #country}.
     *
     * @param country show additional parameters
     * @return this object
     */
    public ChannelClientList country(boolean country) {
        this.country = country;
        return this;
    }
}
