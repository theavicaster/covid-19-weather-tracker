package config;

public class Config {

	private static String API_KEY1;
	
	static
	{
		//Set your DarkSky API Key
		setAPI_KEY1("53cc570e083b2259d3a61a893eaeb933");
		System.out.println("API Key set!");
	}

	public static String getAPI_KEY1() {
		return API_KEY1;
	}

	public static void setAPI_KEY1(String api_key1) {
		API_KEY1 = api_key1;
	}
	
}
