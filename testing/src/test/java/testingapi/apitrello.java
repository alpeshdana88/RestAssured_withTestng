package testingapi;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class apitrello {
	public static String baseurl = "https://trello.com/";
	// create a board
	@Test (priority = 0)
	public void createABoard() {
		RestAssured.baseURI=baseurl;
		given().queryParam("key","1a37f3219aa780e7331acd0428c452df").queryParam("token", "353977b00961699d912374f18fe8ac717e90fa4fecf3fbe76b05f98865c6411a")
		.header("content-Type","application/json")
		.when().post("1/boards/?name=alpeshtrello")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
	
	/* perform three operation
	
	@Test (enabled = false)
	
	public void createAListOnBoard() {
		//https://api.trello.com/1/boards/{id}/lists?name={name}
		RestAssured.baseURI=baseurl;
		given().queryParam("key","1a37f3219aa780e7331acd0428c452df").queryParam("token", "353977b00961699d912374f18fe8ac717e90fa4fecf3fbe76b05f98865c6411a")
		.queryParam("id", "xTuDFW9S").queryParam("name", "apitestng").header("content-Type","application/json")
		.when().post("1/boards/xTuDFW9S/lists?name=apitesting/")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
	
	@Test (enabled = false)
	public void creatALabel(){
		RestAssured.baseURI=baseurl;
		given().queryParam("key","1a37f3219aa780e7331acd0428c452df").queryParam("token", "353977b00961699d912374f18fe8ac717e90fa4fecf3fbe76b05f98865c6411a")
		.header("content-Type","application/json")
		.when().post("1/boards/xTuDFW9S/labels?name=apialpeshtest&color=blue")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
	
	@Test (enabled = false)
	public void emailkeycreate() {
		
		RestAssured.baseURI=baseurl;
		given().queryParam("key","1a37f3219aa780e7331acd0428c452df").queryParam("token", "353977b00961699d912374f18fe8ac717e900a4fecf3fbe76b05f98865c6411a")
		.header("content-Type","application/json")
		.when().post("1/boards/xTuDFW9S/emailKey/generate")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
		}
	// delete a board
	@Test (enabled = false)
	public void DeleteAboard() {
		
		RestAssured.baseURI=baseurl;
		given().queryParam("key","1a37f3219aa780e7331acd0428c452df").queryParam("token", "353977b00961699d912374f18fe8ac717e90fa4fecf3fbe76b05f98865c6411a")
		.header("content-Type","application/json")
		.when().delete("1/boards/xTuDFW9S")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
		
	}*/
	
	
	
	
	


}
	