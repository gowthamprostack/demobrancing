package Apiautomation.Apiautomation;

import io.restassured.path.json.JsonPath;

public class Utilities {
	
	public static JsonPath responsepath(String s)
	{
		JsonPath p=new JsonPath(s);
		
		return p;
		
	}

}
