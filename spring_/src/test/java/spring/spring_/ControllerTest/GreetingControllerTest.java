package spring.spring_.ControllerTest;

import com.lookout.service.controller.IController;
import com.lookout.service.models.Greeting;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {

    @Test
    public void testGetMessageWithDefaultValue() {
        // Create an instance of controller
        IController yourController = new IController();

        // Set up a default value for the @RequestParam
        String defaultValue = "Hello, world!";

        // Call the getMessage method with the default value
        Greeting greeting = yourController.getMessage(defaultValue);

        // Check if the message in the Greeting object matches the default value
        assertEquals(defaultValue, greeting.getMessage());
    }

    @Test
    public void testGetMessageWithCustomValue() {
        // Create an instance of controller
      IController yourController = new IController();

        // Set up a custom value for the @RequestParam
        String customValue = "Custom Message";

        // Call the getMessage method with the custom value
        Greeting greeting = yourController.getMessage(customValue);

        // Check if the message in the Greeting object matches the custom value
        assertEquals(customValue, greeting.getMessage());
    }
}

