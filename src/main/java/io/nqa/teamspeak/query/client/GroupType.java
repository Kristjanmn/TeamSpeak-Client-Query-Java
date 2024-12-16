package io.nqa.teamspeak.query.client;

/**
 * List of group types
 */
public enum GroupType {
    /** Template group (used for new virtual servers) */
    TEMPLATE(0),
    /** Regular group (used for regular clients) */
    REGULAR(1),
    /** Global query group (used for server query clients) */
    QUERY(2);

    final int value;
    GroupType(int value) {
        this.value = value;
    }

    /**
     * Get GroupType from Integer.
     *
     * @param value GroupType value
     * @return this object
     */
    public static GroupType from(int value) {
        for (GroupType type : GroupType.values()) {
            if (type.value == value) return type;
        }
        return null;
    }
}
