package io.nqa.teamspeak.query.client;

/**
 * List of channel types
 */
public enum ChannelType {
    /** Normal channel */
    PERMANENT(0),
    /** Deleted when the server restarts */
    SEMI_PERMANENT(1),
    /** Deleted when empty */
    TEMPORARY(2);

    final int value;
    ChannelType(int value) {
        this.value = value;
    }

    public static ChannelType from(int value) {
        for (ChannelType type : ChannelType.values()) {
            if (type.value == value) return type;
        }
        return null;
    }
}
