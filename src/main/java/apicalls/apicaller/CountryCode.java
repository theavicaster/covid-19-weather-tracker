package apicalls.apicaller;

import org.json.JSONArray;
import org.json.JSONObject;

import apicalls.apicallerbase.RESTAPICaller;

public class CountryCode extends RESTAPICaller {
	
	public String countryCode;
	
	public CountryCode(String countryString)
	{
		//URLify the country string
		countryString = countryString.trim().replaceAll(" ", "%20");
		
		String urlString = "https://restcountries.eu/rest/v2/name/"+countryString+"?fullText=true";
		getJSONResponse(urlString);
		
		parseJSONResponse(JSONResponse);
		
		System.out.println("Country code fetched! - " + countryCode);
	}
	
	private void parseJSONResponse(String JSONResponse)
	{
		JSONArray countryInfo = new JSONArray(JSONResponse);
		JSONObject info = countryInfo.getJSONObject(0);
		
		countryCode = info.getString("alpha2Code");
		
	}

}
