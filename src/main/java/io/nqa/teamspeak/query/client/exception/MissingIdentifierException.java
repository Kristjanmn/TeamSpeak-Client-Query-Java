package io.nqa.teamspeak.query.client.exception;

/**
 * Exception thrown when outbound object requires an identifier, but none was provided.
 */
public class MissingIdentifierException extends TeamSpeakClientQueryException {
    /**
     * Throw exception with message.
     *
     * @param message plain text message
     */
    public MissingIdentifierException(String message) {
        super(message);
    }
}
