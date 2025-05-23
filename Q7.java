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