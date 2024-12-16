package io.nqa.teamspeak.query.client;

/**
 * List of host banner modes
 */
public enum HostBannerMode {
    /** Don't adjust */
    NO_ADJUST(0),
    /** Adjust and ignore aspect ratio */
    ADJUST_IGNORE_ASPECT(1),
    /** Adjust and keep aspect ratio */
    ADJUST_KEEP_ASPECT(2);

    final int value;
    HostBannerMode(int value) {
        this.value = value;
    }

    /**
     * Get HostBannerMode from Integer.
     *
     * @param value HostBannerMode value
     * @return this object
     */
    public static HostBannerMode from(int value) {
        for (HostBannerMode mode : HostBannerMode.values()) {
            if (mode.value == value) return mode;
        }
        return null;
    }
}
