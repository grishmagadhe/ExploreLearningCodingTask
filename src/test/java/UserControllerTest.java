
//Uncomment the test cases to perform testing

/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.explore.users.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserControllerTest {

	public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	private RestTemplate restTemplate = new TestRestTemplate();

	// @Autowired
	// private UserService userService;

	@Test
	public void testGetUserDetailsApi() {

		User user = new User(2, "Sophie", "Kinsela");

		int userId = user.getId();
		User apiResponse=null;
		// Uncomment the below two lines when testing is needed
		
		apiResponse = restTemplate.getForObject(
				"http://localhost:8080/ws/user/list/" + userId, User.class);

		// Verify that the data from the API and data hardcoded are same
		assertNotNull(apiResponse);
		assertEquals(user.getFirstName(), apiResponse.getFirstName());
		assertEquals(user.getId(), apiResponse.getId());
		assertEquals(user.getLastName(), apiResponse.getLastName());

	}

	@Test
	public void testGetAllUsersSuccess() {
		// Add some test data for the API
		User user1 = new User(4, "John", "Grisham");

		User user2 = new User(5, "Meg", "cabot");

		User user3 = new User(6, "Sydney", "Sheldon");
		Map<String, Object> apiResponse=null;
		// Uncomment the below two lines when testing is neededd
		
		 apiResponse = restTemplate.getForObject(
				"http://localhost:8080/ws/user/list", Map.class);

		// Assert the response from the API
		int totalUsers = Integer.parseInt(apiResponse.get("totalUsers")
				.toString());
		assertTrue(totalUsers == 3);

		List<Map<String, Object>> usersList = (List<Map<String, Object>>) apiResponse
				.get("users");
		assertTrue(usersList.size() == 3);

	}



}*/
