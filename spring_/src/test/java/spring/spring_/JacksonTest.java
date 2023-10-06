package spring.spring_.JacksonTest;

import com.lookout.service.jackson.Jackson;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

public class JacksonTest {
	
	private Jackson j;

	@Before
	public void setup() {
		System.out.println("Before testing...");
		j = new Jackson();
	}
	
	@After
	public void cleanup() {
		System.out.println("Cleaning up the testing...");
	}

	@Test
	public void test1() {
		Size size = j.getSize("{\"crime\":\"petty theft\", \"date occurred\":10/03/22}");
		Assert.assertEquals(3, size);
	}


}

