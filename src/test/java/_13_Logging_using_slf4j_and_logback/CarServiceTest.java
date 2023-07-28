package _13_Logging_using_slf4j_and_logback;

import org.daniel._13_Logging_using_slf4j_and_logback.CarService;
import org.junit.jupiter.api.Test;
public class CarServiceTest {
    @Test
    public  void shouldDemonstrateLogging (){
        CarService carService = new CarService();
        carService.process("BMW");
    }
}
