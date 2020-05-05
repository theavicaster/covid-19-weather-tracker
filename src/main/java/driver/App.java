package driver;

import java.util.ArrayList;

import apicalls.apicaller.CountryCode;
import apicalls.apicaller.CovidTimeSeries;
import apicalls.apicaller.GeocodedLocations;
import apicalls.apicaller.WeatherInformation;

public class App {

	public static void main(String[] args) {
		
		//Converting multiple words as separate
		//CL arguments into a single string
		String countryString = "";
		for(String word : args)
		{
			countryString+=word;
			countryString+=" ";
		}
		countryString = countryString.trim();
		
		//Fetching the corresponding country code
		CountryCode cc = new CountryCode(countryString);
		
		//Fetching the geographic coordinates of
		//the 5 most populous locations of the country
		GeocodedLocations loc = new GeocodedLocations(cc.countryCode);
		
		//Fetching the countries' historical infection data
		CovidTimeSeries cov = new CovidTimeSeries(cc.countryCode);
		
		int noOfDays = cov.confirmed.size();
		ArrayList<WeatherInformation> weatherTimeSeries = new ArrayList<WeatherInformation>();
		
		for(int i=0; i<noOfDays; i++)
		{
			long unixTime = cov.dates.get(i).toEpochSecond();
			weatherTimeSeries.add(new WeatherInformation(loc,unixTime));
			System.out.println("Weather information for day "+ i + " fetched!");
		}
		
		System.out.println("Weather information fetched!\nFinished fetching data!\n");
		
		System.out.println(loc.locations[0] + " " + loc.regions[0]);
		System.out.println(cov.confirmed.get(3) + " " + cov.deaths.get(3));
		System.out.println(String.format("%.2f",weatherTimeSeries.get(3).locWeather[0].temperatureHigh) + " " +
				           String.format("%.2f",weatherTimeSeries.get(3).locWeather[0].temperatureLow));
		
	}

}
