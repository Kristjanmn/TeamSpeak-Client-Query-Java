package io.nqa.teamspeak.query.client;

/**
 * List of token types
 */
public enum TokenType {
    /** Server group token */
    SERVER_GROUP(0),
    /** Channel group token */
    CHANNEL_GROUP(1);

    final int value;
    TokenType(int value) {
        this.value = value;
    }

    public static TokenType from(int value) {
        for (TokenType type : TokenType.values()) {
            if (type.value == value) return type;
        }
        return null;
    }
}
