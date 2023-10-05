package spring.spring_.ControllerTest;

import com.lookout.service.controller.IController;
import com.lookout.service.models.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {

    @Test
    public void testGetMessageWithDefaultValue() {
        IController yourController = new IController();
        String defaultValue = "Hello, world!";

        Greeting greeting = yourController.getMessage(defaultValue);
        assertEquals(defaultValue, greeting.getMessage());
    }

    @Test
    public void testGetMessageWithCustomValue() {
      IController yourController = new IController();
        String customValue = "Custom Message";
        
        Greeting greeting = yourController.getMessage(customValue);
        assertEquals(customValue, greeting.getMessage());
    }
}

