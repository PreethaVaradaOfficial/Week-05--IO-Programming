<<<<<<< HEAD
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {
    public static void main(String[] args) {
        String json = "{\"name\": \"John\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readTree(json);
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
=======
String searchName = "Alice";
Files.lines(Paths.get("employees.csv"))
    .skip(1)
    .map(line -> line.split(","))
    .filter(data -> data[1].equalsIgnoreCase(searchName))
    .forEach(data -> System.out.println("Dept: " + data[2] + ", Salary: " + data[3]));
>>>>>>> fe81228e1c11f3bcb1b725fb58d562ce87f52814
