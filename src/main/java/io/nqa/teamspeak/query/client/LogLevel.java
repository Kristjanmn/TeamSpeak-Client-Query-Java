package io.nqa.teamspeak.query.client;

/**
 * List of logging levels
 */
public enum LogLevel {
    /** Logging level for errors */
    ERROR(0),
    /** Logging level for warnings */
    WARNING(1),
    /** Logging level for debugging */
    DEBUG(2),
    /** Logging level for info */
    INFO(3);

    final int value;
    LogLevel(int value) {
        this.value = value;
    }

    /**
     * Get LogLevel from Integer.
     *
     * @param value LogLevel value
     * @return this object
     */
    public static LogLevel from(int value) {
        for (LogLevel level : LogLevel.values()) {
            if (level.value == value) return level;
        }
        return null;
    }
}
