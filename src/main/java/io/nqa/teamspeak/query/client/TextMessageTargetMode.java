package io.nqa.teamspeak.query.client;

public enum TextMessageTargetMode {
    UNKNOWN(0),
    CLIENT(1),
    CHANNEL(2),
    SERVER(3);

    final int value;
    TextMessageTargetMode(int value) {
        this.value = value;
    }

    public static TextMessageTargetMode from(int value) {
        for (TextMessageTargetMode mode : TextMessageTargetMode.values()) {
            if (mode.value == value) return mode;
        }
        return null;
    }
}
