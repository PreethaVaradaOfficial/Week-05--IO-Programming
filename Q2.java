import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node1 = (ObjectNode) mapper.readTree("{\"a\":1, \"b\":2}");
        ObjectNode node2 = (ObjectNode) mapper.readTree("{\"b\":3, \"c\":4}");
        node1.setAll(node2);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node1));
    }
}