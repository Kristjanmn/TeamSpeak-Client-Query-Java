package io.nqa.teamspeak.query.client;

/**
 * List of TalkStatus values
 */
public enum TalkStatus {
    /** Not talking */
    NONE(0),
    /** Talking */
    TALKING(1),
    /** Trying to talk while output is muted */
    TALKING_WHILE_MUTED(2);

    final int value;
    TalkStatus(int value) {
        this.value = value;
    }

    /**
     * Get TalkStatus from Integer.
     *
     * @param value TalkStatus value
     * @return this object
     */
    public static TalkStatus from(int value) {
        for (TalkStatus level : TalkStatus.values()) {
            if (level.value == value) return level;
        }
        return null;
    }
}
