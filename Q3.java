<<<<<<< HEAD
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
=======
long count = Files.lines(Paths.get("students.csv")).skip(1).count();
System.out.println("Total Records: " + count);
>>>>>>> fe81228e1c11f3bcb1b725fb58d562ce87f52814
