import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration(classes = BookmydrApplication.class)  // Specify the main application class
@SpringBootTest
public class BookmydrApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true);  // Dummy assertion to validate the context loading
    }
}
