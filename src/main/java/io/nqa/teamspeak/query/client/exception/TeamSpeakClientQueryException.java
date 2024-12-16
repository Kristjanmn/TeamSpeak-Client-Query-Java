package io.nqa.teamspeak.query.client.exception;

/**
 * Main exception class for {@link io.nqa.teamspeak.query.client}.
 */
public class TeamSpeakClientQueryException extends RuntimeException {
    /**
     * Throw exception with message.
     *
     * @param message plain text message
     */
    public TeamSpeakClientQueryException(String message) {
        super(message);
    }

    /**
     * Throw exception with {@link TeamSpeakError}.
     *
     * @param error {@link TeamSpeakError}
     */
    public TeamSpeakClientQueryException(TeamSpeakError error) {
        super(String.valueOf(error));
    }
}
