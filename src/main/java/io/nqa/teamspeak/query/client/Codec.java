package io.nqa.teamspeak.query.client;

/**
 * List of audio codecs used in TeamSpeak
 */
public enum Codec {
    /** Mono, 16bit, 8kHz, bitrate dependent on the quality setting */
    SPEEDX_NARROWBAND(0),
    /** Mono, 16bit, 16kHz, bitrate dependent on the quality setting */
    SPEEDX_WIDEBAND(1),
    /** Mono, 16bit, 32kHz, bitrate dependent on the quality setting */
    SPEEDX_ULTRAWIDEBAND(2),
    /** Mono, 16bit, 48kHz, bitrate dependent on the quality setting */
    CELT_MONO(3),
    /** Mono, 16bit, 48kHz, bitrate dependent on the quality setting, optimized for voice */
    OPUS_VOICE(4),
    /** Stereo, 16bit, 48kHz, bitrate dependent on the quality setting, optimized for music */
    OPUS_MUSIC(5);

    final int value;
    Codec(int value) {
        this.value = value;
    }

    public static Codec from(int value) {
        for (Codec codec : Codec.values()) {
            if (codec.value == value) return codec;
        }
        return null;
    }
}
