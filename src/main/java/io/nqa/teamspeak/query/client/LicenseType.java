package io.nqa.teamspeak.query.client;

/**
 * List of TeamSpeak license types
 */
public enum LicenseType {
    /** No licence */
    NO_LICENSE(0),
    /** Offline/LAN license */
    OFFLINE(1),
    /** TeamSpeak SDK license */
    SDK(2),
    /** TeamSpeak SDK offline license */
    SKD_OFFLINE(3),
    /** Non-Profit License (NPL) */
    NPL(4),
    /** Authorised TeamSpeak Host Provider License (ATHP) */
    ATHP(5),
    /** Annual activation license (AAL) */
    AAL(6),
    /** Default license with 32 slots */
    DEFAULT(7),
    /** Gamer license */
    GAMER(8),
    /** Licenses sponsored by TeamSpeak */
    SPONSORSHIP(9),
    /** For use inside corporates */
    COMMERCIAL(10);

    final int value;
    LicenseType(int value) {
        this.value = value;
    }

    /**
     * Get LicenseType from Integer.
     *
     * @param value LicenseType value
     * @return this object
     */
    public static LicenseType from(int value) {
        for (LicenseType type : LicenseType.values()) {
            if (type.value == value) return type;
        }
        return null;
    }
}
