package apicalls.apicaller;

import config.Config;
import customutils.LocationWeather;

import org.json.JSONArray;
import org.json.JSONObject;

import apicalls.apicallerbase.RESTAPICaller;


public class WeatherInformation extends RESTAPICaller {
			
	public LocationWeather[] locWeather;
	
	public WeatherInformation(GeocodedLocations loc, long unixTime)
	{
		locWeather = new LocationWeather[5];
		String API_KEY = Config.getAPI_KEY1();
		
		for(int i=0 ;i<5;i++)
		{
			float latitude = loc.latitudes[i];
			float longitude = loc.longitudes[i];
			
			String urlString = "https://api.darksky.net/forecast/"+API_KEY+"/"+latitude+","+longitude+","+unixTime+"?exclude=currently,hourly,flags?units=si";
			getJSONResponse(urlString);
		
			parseJSONResponse(JSONResponse,i);
		}
	}
	
	private void parseJSONResponse(String JSONResponse,int i)
	{
		
		JSONObject weatherInfo = new JSONObject(JSONResponse);
		JSONObject daily = weatherInfo.getJSONObject("daily");
		JSONArray dataArray = daily.getJSONArray("data");
		JSONObject data = dataArray.getJSONObject(0);
		
		//Fahrenheit to Celsius and humidity to percentage
		double temperatureHigh = (5.0/9.0)*(data.getFloat("temperatureHigh")-32.0);
		double temperatureLow = (5.0/9.0)*(data.getFloat("temperatureLow")-32.0);
		double humidity = data.getFloat("humidity")*100;
		
		LocationWeather loc = new LocationWeather(temperatureHigh,temperatureLow,humidity);
		locWeather[i] = loc;
		
	}
	
}
