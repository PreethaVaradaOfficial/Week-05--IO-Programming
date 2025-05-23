<<<<<<< HEAD
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.File;

public class FilterJsonAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode users = (ArrayNode) mapper.readTree(new File("users.json"));
        for (JsonNode user : users) {
            if (user.get("age").asInt() > 25) {
                System.out.println(user);
            }
        }
    }
}
=======
Files.lines(Paths.get("employees.csv"))
    .skip(1)
    .map(line -> line.split(","))
    .sorted((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])))
    .limit(5)
    .forEach(e -> System.out.println(Arrays.toString(e)));
>>>>>>> fe81228e1c11f3bcb1b725fb58d562ce87f52814
