package io.nqa.teamspeak.query.client.exception;

import io.nqa.teamspeak.query.client.model.outbound.BanClient;

/**
 * Exception thrown when outbound object has too many identifiers defined.<br>
 * E.g. {@link BanClient} has multiple identifiers but only ONE must be set, nothing more.
 */
public class TooManyIdentifiersException extends TeamSpeakClientQueryException {
    /**
     * Throw exception with message.
     *
     * @param message plain text message
     */
    public TooManyIdentifiersException(String message) {
        super(message);
    }
}
