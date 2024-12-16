package io.nqa.teamspeak.query.client;

/**
 * List of group naming modes
 */
public enum GroupNamingMode {
    /** No group name is displayed */
    NONE(0),
    /** Group name is displayed before the client name */
    BEFORE(1),
    /** Group name is displayed after the client name */
    AFTER(2);

    final int value;
    GroupNamingMode(int value) {
        this.value = value;
    }

    /**
     * Get GroupNamingMode from Integer.
     *
     * @param value GroupNamingMode value
     * @return this object
     */
    public static GroupNamingMode from(int value) {
        for (GroupNamingMode mode : GroupNamingMode.values()) {
            if (mode.value == value) return mode;
        }
        return null;
    }
}
