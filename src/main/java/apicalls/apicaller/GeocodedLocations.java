package apicalls.apicaller;

import org.json.JSONArray;
import org.json.JSONObject;

import apicalls.apicallerbase.RESTAPICaller;

public class GeocodedLocations extends RESTAPICaller {
	
	public String[] locations;
	public String[] regions;
	public float[] latitudes;
	public float[] longitudes;
	
	public GeocodedLocations(String countryCode)
	{
		locations = new String[5];
		regions = new String[5];
		latitudes = new float[5];
		longitudes = new float[5];
		
		String urlString = "http://geodb-free-service.wirefreethought.com/v1/geo/cities?countryIds="+countryCode+"&sort=-population&limit=5";
		getJSONResponse(urlString);
		
		parseJSONResponse(JSONResponse);
		
		//Hard-coded for top 5 locations
		//TODO Make this dynamic
		System.out.println("Geocoded locations fetched! - ");
		for(int i=0; i<5; i++)
		{
			System.out.println(locations[i]);
		}
		
		
	}
	
	private void parseJSONResponse(String JSONResponse)
	{
		JSONObject locationInfo = new JSONObject(JSONResponse);
		JSONArray data = locationInfo.getJSONArray("data");
		
		for(int i=0; i<5 ; i++)
		{
			JSONObject locationRecord = data.getJSONObject(i);
			
			locations[i] = locationRecord.getString("name");
			regions[i] = locationRecord.getString("region");
			latitudes[i] = locationRecord.getFloat("latitude");
			longitudes[i] = locationRecord.getFloat("longitude");
			
		}
		
	}

}
