package apicalls.apicaller;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import apicalls.apicallerbase.RESTAPICaller;

public class CovidTimeSeries extends RESTAPICaller {
	
	public ArrayList<ZonedDateTime> dates;
	public ArrayList<Integer> confirmed;
	public ArrayList<Integer> deaths;
	public ArrayList<Integer> recovered;
	public ArrayList<Integer> active;
	public ArrayList<Integer> newCases;
	
	public CovidTimeSeries(String countryCode)
	{
		dates = new ArrayList<ZonedDateTime>();
		confirmed = new ArrayList<Integer>();
		deaths = new ArrayList<Integer>();
		recovered = new ArrayList<Integer>();
		active = new ArrayList<Integer>();
		newCases = new ArrayList<Integer>();
		
		String urlString = "https://api.covid19api.com/total/country/"+countryCode;
		getJSONResponse(urlString);
		
		parseJSONResponse(JSONResponse);
		
		System.out.println("COVID-19 historical data fetched! - "+ dates.size() + " records.");
	}
	
	private void parseJSONResponse(String JSONResponse)
	{
		JSONArray covidInfo = new JSONArray(JSONResponse);
		
		for(int i=0; i<covidInfo.length(); i++)
		{
			
			JSONObject dailyRecord = covidInfo.getJSONObject(i);
			
			//Start recording when countries hit 500 affected
			if(dailyRecord.getInt("Confirmed") < 500)
				continue;
			
			//Parsing the date string
			String date = dailyRecord.getString("Date");
			int year = Integer.parseInt(date.substring(0,4));
			int month = Integer.parseInt(date.substring(5,7));
			int day = Integer.parseInt(date.substring(8,10));
			ZonedDateTime parseddate = ZonedDateTime.of(year, month, day, 0, 0, 0, 0, ZoneId.systemDefault());
			dates.add(parseddate);
						
			confirmed.add(dailyRecord.getInt("Confirmed"));
			deaths.add(dailyRecord.getInt("Deaths"));
			recovered.add(dailyRecord.getInt("Recovered"));
			active.add(dailyRecord.getInt("Active"));
			
			System.out.println("Record for "+ day + "/" + month + " fetched!");
			
			int noOfDays = confirmed.size();
			
			//Limiting number of API calls for DarkSky
			if(noOfDays>3)
				break;
			
			//No new cases for the first day
			if(noOfDays == 1)
				newCases.add(0);
			else
				newCases.add(confirmed.get(noOfDays-1) - confirmed.get(noOfDays-2));
		
			
			
		}
		
	}

}
