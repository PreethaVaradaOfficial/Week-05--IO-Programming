import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Car> cars = Arrays.asList(
            new Car("Honda", "Civic", 2020),
            new Car("Tesla", "Model 3", 2022)
        );
        String jsonArray = mapper.writeValueAsString(cars);
        System.out.println(jsonArray);
    }
}