<<<<<<< HEAD
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
=======
try (PrintWriter pw = new PrintWriter("employees.csv")) {
    pw.println("ID,Name,Department,Salary");
    pw.println("1,John,IT,5000");
    pw.println("2,Alice,HR,4500");
    // Add 3 more records similarly
>>>>>>> fe81228e1c11f3bcb1b725fb58d562ce87f52814
}