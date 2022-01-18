package testingapi;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class apitrello {
	public static String baseurl = "https://trello.com/";
	// create a board
	@Test (enabled = false)
	public void createABoard() {
		RestAssured.baseURI=baseurl;
		given().queryParam("key","4d74bc137adbcd3bf10604fec816955e").queryParam("token", "9e2cd5b25f15e7ed6f63ee925f828331a89ab9fcb18ab38933ee61a82fc81a60")
		.header("content-Type","application/json")
		.when().post("1/boards/?name=trelloapi")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
	
	//perform three operation
	
	@Test (enabled = true)
	
	public void createAListOnBoard() {
		//https://api.trello.com/1/boards/{id}/lists?name={name}
		RestAssured.baseURI=baseurl;
		given().queryParam("key","4d74bc137adbcd3bf10604fec816955e").queryParam("token", "9e2cd5b25f15e7ed6f63ee925f828331a89ab9fcb18ab38933ee61a82fc81a60")
		.queryParam("id", "q5IDd96z").queryParam("name", "apitestng").header("content-Type","application/json")
		.when().post("1/boards/q5IDd96z/lists?name=apitesting/")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
	
	@Test (enabled = true)
	public void creatALabel(){
		RestAssured.baseURI=baseurl;
		given().queryParam("key","4d74bc137adbcd3bf10604fec816955e").queryParam("token", "9e2cd5b25f15e7ed6f63ee925f828331a89ab9fcb18ab38933ee61a82fc81a60")
		.header("content-Type","application/json")
		.when().post("1/boards/q5IDd96z/labels?name=apialpeshtest&color=blue")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
	
	@Test (enabled = true)
	public void emailkeycreate() {
		
		RestAssured.baseURI=baseurl;
		given().queryParam("key","4d74bc137adbcd3bf10604fec816955e").queryParam("token", "9e2cd5b25f15e7ed6f63ee925f828331a89ab9fcb18ab38933ee61a82fc81a60")
		.header("content-Type","application/json")
		.when().post("1/boards/q5IDd96z/emailKey/generate")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
		}
	// delete a board
	@Test (enabled = false)
	public void DeleteAboard() {
		
		RestAssured.baseURI=baseurl;
		given().queryParam("key","4d74bc137adbcd3bf10604fec816955e").queryParam("token", "9e2cd5b25f15e7ed6f63ee925f828331a89ab9fcb18ab38933ee61a82fc81a60")
		.header("content-Type","application/json")
		.when().delete("1/boards/q5IDd96z")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
		
	}
	
	
	
	
	


}
	