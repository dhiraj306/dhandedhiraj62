package MavenProject123.project11;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class FirstAPITest {
	@Test
	public void readAllDetails()
	{
		// request the server
		Response response = RestAssured.get("https://chercher.tech/sample/api/product/read");
		// store the response body in string
		String responseBody = response.getBody().asString();
		// print the response
		System.out.println("Response Body is =>  " + responseBody);
		// store the response code
		int responseStatusCode = response.getStatusCode();
		System.out.println("************************************************");
		System.out.println("Status Code => "+ responseStatusCode);
		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
	}
}