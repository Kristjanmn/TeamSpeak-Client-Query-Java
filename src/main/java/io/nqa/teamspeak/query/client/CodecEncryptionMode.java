package io.nqa.teamspeak.query.client;

/**
 * List of codec encryption modes
 */
public enum CodecEncryptionMode {
    /** Voice encryption is configured per channel */
    PER_CHANNEL(0),
    /** Voice encryption is globally off */
    FORCED_OFF(1),
    /** Voice encryption is globally on */
    FORCED_ON(2);

    final int value;
    CodecEncryptionMode(int value) {
        this.value = value;
    }

    public static CodecEncryptionMode from(int value) {
        for (CodecEncryptionMode mode : CodecEncryptionMode.values()) {
            if (mode.value == value) return mode;
        }
        return null;
    }
}
