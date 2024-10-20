package io.nqa.teamspeak.query.client.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@ToString
@NoArgsConstructor
public class TeamSpeakVariables {
    Map<String, String> variables = new HashMap<>();
    List<Map<String, String>> repeating = new ArrayList<>();
}
