package io.nqa.teamspeak.query.client;

/**
 * List of host message modes
 */
public enum HostMessageMode {
    /** Don't display anything */
    NONE(0),
    /** Display message inside log */
    LOG(1),
    /** Display message inside a modal dialog */
    MODAL(2),
    /** Display message inside a modal dialog and quit/close server/connection */
    MODAL_QUIT(3);

    final int value;
    HostMessageMode(int value) {
        this.value = value;
    }

    /**
     * Get HostMessageMode from Integer.
     *
     * @param value HostMessageMode value
     * @return this object
     */
    public static HostMessageMode from(int value) {
        for (HostMessageMode mode : HostMessageMode.values()) {
            if (mode.value == value) return mode;
        }
        return null;
    }
}
