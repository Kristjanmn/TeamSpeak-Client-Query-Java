package io.nqa.teamspeak.query.client;

public enum Reason {
    NONE(0),
    MOVED(1),
    SUBSCRIPTION(2),
    LOST_CONNECTION(3),
    KICK_CHANNEL(4),
    KICK_SERVER(5),
    KICK_SERVER_BAN(6),
    SERVER_STOP(7),
    CLIENT_DISCONNECT(8),
    CHANNEL_UPDATE(9),
    CHANNEL_EDIT(10),
    CLIENT_DISCONNECT_SERVER_SHUTDOWN(11);

    final int value;
    Reason(int value) {
        this.value = value;
    }

    public static Reason from(int value) {
        for (Reason reason : Reason.values()) {
            if (reason.value == value) return reason;
        }
        return null;
    }
}
