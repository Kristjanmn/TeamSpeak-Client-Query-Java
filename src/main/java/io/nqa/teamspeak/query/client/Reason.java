package io.nqa.teamspeak.query.client;

/**
 * List of possible reasons for things to happen.
 */
public enum Reason {
    /** No reason given */
    NONE(0),
    /** Client or channel was moved */
    MOVED(1),
    /** Something to do with channel subscription */
    SUBSCRIPTION(2),
    /** Connection between client and server was lost */
    LOST_CONNECTION(3),
    /** Client was kicked from channel */
    KICK_CHANNEL(4),
    /** Client was kicked from server */
    KICK_SERVER(5),
    /** Client was banned from server */
    KICK_SERVER_BAN(6),
    /** Server was stopped */
    SERVER_STOP(7),
    /** Client disconnected normally */
    CLIENT_DISCONNECT(8),
    /** Channel was updated */
    CHANNEL_UPDATE(9),
    /** Channel was edited */
    CHANNEL_EDIT(10),
    /** Client disconnect due to server shutting down */
    CLIENT_DISCONNECT_SERVER_SHUTDOWN(11);

    final int value;
    Reason(int value) {
        this.value = value;
    }

    /**
     * Get Reason from Integer.
     *
     * @param value Reason value
     * @return this object
     */
    public static Reason from(int value) {
        for (Reason reason : Reason.values()) {
            if (reason.value == value) return reason;
        }
        return null;
    }
}
