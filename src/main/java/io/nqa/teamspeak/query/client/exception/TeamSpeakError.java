package io.nqa.teamspeak.query.client.exception;

/**
 * List of errors used with {@link TeamSpeakClientQueryException}.
 */
public enum TeamSpeakError {
    /** Unknown error */
    UNKNOWN,
    /** Connection to client lost */
    CONNECTION_LOST,
    /** Client refused connection */
    CONNECTION_REFUSED,
    /** Incoming message is null */
    MESSAGE_NULL,
    /** Received multiple variables without list */
    MULTIPLE_VARIABLES_NO_LIST,
    /** Variable does not contain equals - is without value */
    VARIABLE_WITHOUT_EQUALS
}
