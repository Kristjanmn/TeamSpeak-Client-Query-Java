package io.nqa.teamspeak.query.client;

public enum LogLevel {
    ERROR(0),
    WARNING(1),
    DEBUG(2),
    INFO(3);

    final int value;
    LogLevel(int value) {
        this.value = value;
    }

    public static LogLevel from(int value) {
        for (LogLevel level : LogLevel.values()) {
            if (level.value == value) return level;
        }
        return null;
    }
}
