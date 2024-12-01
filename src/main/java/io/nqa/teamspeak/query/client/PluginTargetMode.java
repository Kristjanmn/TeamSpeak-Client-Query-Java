package io.nqa.teamspeak.query.client;

/**
 * List of plugin target modes
 */
public enum PluginTargetMode {
    /** Send to all clients in the current channel */
    CURRENT_CHANNEL(0),
    /** Send to all clients on the server */
    SERVER(1),
    /** Send to all given clients ids */
    CLIENT(2),
    /** Send to all given clients which are subscribed to the current channel */
    CURRENT_CHANNEL_SUBSCRIBED_CLIENTS(3);

    final int value;
    PluginTargetMode(int value) {
        this.value = value;
    }

    public static PluginTargetMode from(int value) {
        for (PluginTargetMode mode : PluginTargetMode.values()) {
            if (mode.value == value) return mode;
        }
        return null;
    }
}
