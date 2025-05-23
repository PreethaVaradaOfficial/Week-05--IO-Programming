import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("data.json"));
        String name = root.path("name").asText();
        String email = root.path("email").asText();
        System.out.println("Name: " + name + ", Email: " + email);
    }
}