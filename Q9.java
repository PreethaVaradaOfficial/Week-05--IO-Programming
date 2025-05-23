import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.*;

import java.io.*;
import java.util.*;

class CensorUtil {
    public static String maskTeam(String teamName) {
        if (teamName.contains(" ")) {
            return teamName.substring(0, teamName.indexOf(" ")) + " ***";
        }
        return "***";
    }

    public static String redactPlayer(String name) {
        return "REDACTED";
    }
}

public class IPLCensorAnalyzer {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // JSON Censorship
        List<Map<String, Object>> matches = mapper.readValue(new File("ipl.json"), new TypeReference<>() {});
        for (Map<String, Object> match : matches) {
            match.put("team1", CensorUtil.maskTeam((String) match.get("team1")));
            match.put("team2", CensorUtil.maskTeam((String) match.get("team2")));
            match.put("player_of_match", CensorUtil.redactPlayer((String) match.get("player_of_match")));
        }
        mapper.writeValue(new File("ipl_censored.json"), matches);

        // CSV Censorship
        CSVReader reader = new CSVReader(new FileReader("ipl.csv"));
        List<String[]> allData = reader.readAll();
        reader.close();

        List<String[]> modified = new ArrayList<>();
        for (String[] row : allData) {
            row[0] = CensorUtil.maskTeam(row[0]); // team1
            row[1] = CensorUtil.maskTeam(row[1]); // team2
            row[2] = CensorUtil.redactPlayer(row[2]); // player_of_match
            modified.add(row);
        }

        CSVWriter writer = new CSVWriter(new FileWriter("ipl_censored.csv"));
        writer.writeAll(modified);
        writer.close();
    }
}