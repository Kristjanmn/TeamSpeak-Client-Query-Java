package io.nqa.teamspeak.query.client.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Object containing variables from message sent by TeamSpeak client.
 */
@Data
@ToString
public class TeamSpeakVariables {
    /** Variables */
    Map<String, String> variables = new HashMap<>();
    /** Repeating variables - likely getting an array */
    List<Map<String, String>> repeating = new ArrayList<>();

    /**
     * Create empty TeamSpeakVariables object.
     */
    public TeamSpeakVariables() {}
}
