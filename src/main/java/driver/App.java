package driver;

import java.util.ArrayList;

import com.jakewharton.fliptables.FlipTable;


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
		
		//Setting a table of strings for display
		String[] headers = { "Date", "Confirmed", "Dead", "Recovered", "Active",
							  "New Cases", loc.locations[0], loc.locations[1],
							  loc.locations[2], loc.locations[3], loc.locations[4]};
		String[][] data = new String[noOfDays][11];
		for(int i=0; i<noOfDays; i++)
		{
			data[i][0] = Integer.toString(cov.dates.get(i).getDayOfMonth())+"/"+
					     Integer.toString(cov.dates.get(i).getMonthValue());
			data[i][1] = Integer.toString(cov.confirmed.get(i));
			data[i][2] = Integer.toString(cov.deaths.get(i));
			data[i][3] = Integer.toString(cov.recovered.get(i));
			data[i][4] = Integer.toString(cov.active.get(i));
			data[i][5] = Integer.toString(cov.newCases.get(i));
			
			for(int j=6; j<11; j++)
			{
				//Kinda hacky indexing XD
				//TODO Make this clearer
				int locNo = j-6;
				//Unicode character is for degree
				data[i][j] = String.format("%.2f",weatherTimeSeries.get(i).locWeather[locNo].temperatureHigh)
							 + "\u00B0C Max \n" +
							 String.format("%.2f",weatherTimeSeries.get(i).locWeather[locNo].temperatureLow)
							 + "\u00B0C Min \n" +
							 String.format("%.0f",weatherTimeSeries.get(i).locWeather[locNo].humidity)
							 + "% Humidity";
			}
						 
		}
		
		//Displaying the table to console
		System.out.println(FlipTable.of(headers, data));
		
				
	}

}
