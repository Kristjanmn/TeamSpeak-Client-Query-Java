package io.nqa.teamspeak.query.client;

/**
 * List of text message target modes.
 */
public enum TextMessageTargetMode {
    /** Unknown target */
    UNKNOWN(0),
    /** Message goes to client - private message */
    CLIENT(1),
    /** Message goes to channel - channel members can see */
    CHANNEL(2),
    /** Message goes to server - everybody on server can see */
    SERVER(3);

    final int value;
    TextMessageTargetMode(int value) {
        this.value = value;
    }

    /**
     * Get TextMessageTargetMode from Integer.
     *
     * @param value TextMessageTargetMode value
     * @return this object
     */
    public static TextMessageTargetMode from(int value) {
        for (TextMessageTargetMode mode : TextMessageTargetMode.values()) {
            if (mode.value == value) return mode;
        }
        return null;
    }
}
