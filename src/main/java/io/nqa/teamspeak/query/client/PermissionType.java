package io.nqa.teamspeak.query.client;

public enum PermissionType {
    SERVER_GROUP(0),
    GLOBAL_CLIENT(1),
    CHANNEL(2),
    CHANNEL_GROUP(3),
    CHANNEL_CLIENT(4);

    final int value;
    PermissionType(int value) {
        this.value = value;
    }

    public static PermissionType from(int value) {
        for (PermissionType type : PermissionType.values()) {
            if (type.value == value) return type;
        }
        return null;
    }
}
