package io.nqa.teamspeak.query.client;

/**
 * Permission type
 */
public enum PermissionType {
    /** Server group permission */
    SERVER_GROUP(0),
    /** Client permission */
    GLOBAL_CLIENT(1),
    /** Channel permission */
    CHANNEL(2),
    /** Channel group permission */
    CHANNEL_GROUP(3),
    /** Client permission for specific channel */
    CHANNEL_CLIENT(4);

    final int value;
    PermissionType(int value) {
        this.value = value;
    }

    /**
     * Get PermissionType from Integer.
     *
     * @param value PermissionType value
     * @return this object
     */
    public static PermissionType from(int value) {
        for (PermissionType type : PermissionType.values()) {
            if (type.value == value) return type;
        }
        return null;
    }
}
