package io.nqa.teamspeak.query.client;

/**
 * List of client types.
 */
public enum ClientType {
    /** Regular TeamSpeak client */
    CLIENT(0),
    /** Query client */
    QUERY(1);

    final int value;
    ClientType(int value) {
        this.value = value;
    }

    /**
     * Get ChannelType from Integer.
     *
     * @param value ChannelType value
     * @return this object
     */
    public static ClientType from(int value) {
        for (ClientType type : ClientType.values()) {
            if (type.value == value) return type;
        }
        return null;
    }
}
