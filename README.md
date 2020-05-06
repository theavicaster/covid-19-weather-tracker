# COVID-19 Weather Tracker

> A command line interface based Java application utilizing RESTful web services to fetch weather conditions corresponding to COVID-19 infections by date.


![Screenshot](https://github.com/theavicaster/covid-19-weather-tracker/blob/master/weather.png)

A simple Java application to practice switching over from a Python to a Java development environment.

Java based Tools/Frameworks used -
* Eclipse IDE
* JUnit 5
* Apache Maven

---

## REST API Calls

* [REST Countries](https://restcountries.eu/) fetches the country code for a country name as an input string.
* [GeoDB Cities](http://geodb-cities-api.wirefreethought.com/) fetches the geographical coordinates for the top 5 most populated cities using obtained country code.
* [COVID-19 API](https://covid19api.com/) fetches the historical time series infection counts using obtained country code.
* [Dark Sky](https://darksky.net/forecast/40.7127,-74.0059/us12/en) fetches the weather conditions based on date from COVID time series data, and geographical coordinates obtained for top locations.
* [PokeAPI](https://pokeapi.co/) for testing REST API calls. (Couldn't resist)

---

## Usage

To run the executable JAR file on your environment, run -
```
java -jar covidweather-0.0.1-SNAPSHOT-shaded.jar "Country"
```
Some examples -
```
java -jar covidweather-0.0.1-SNAPSHOT-shaded.jar India
java -jar covidweather-0.0.1-SNAPSHOT-shaded.jar USA
java -jar covidweather-0.0.1-SNAPSHOT-shaded.jar United States of America
```
---

## Configuration

Dark Sky has a limit of 1000 API calls in 24 hours.
Set your own API key in `src/main/java/config/Config.java`

The number of days in executable JAR have been limited to 16.
Set your own higher limit in `src/main/java/apicalls/apicaller/CovidTimeSeries.java`

---

## Sample Output

### Italy - Initial Stage
---
```
Country code fetched! - IT
Geocoded locations fetched! - 
Province of Rome
Province of Naples
province of Milan
Rome
Province of Turin
Record for 27/2 fetched!
Record for 28/2 fetched!
Record for 29/2 fetched!
Record for 1/3 fetched!
Record for 2/3 fetched!
Record for 3/3 fetched!
Record for 4/3 fetched!
Record for 5/3 fetched!
Record for 6/3 fetched!
Record for 7/3 fetched!
Record for 8/3 fetched!
Record for 9/3 fetched!
Record for 10/3 fetched!
Record for 11/3 fetched!
Record for 12/3 fetched!
Record for 13/3 fetched!
COVID-19 historical data fetched! - 16 records.
API Key set!
Weather information for day 0 fetched!
Weather information for day 1 fetched!
Weather information for day 2 fetched!
Weather information for day 3 fetched!
Weather information for day 4 fetched!
Weather information for day 5 fetched!
Weather information for day 6 fetched!
Weather information for day 7 fetched!
Weather information for day 8 fetched!
Weather information for day 9 fetched!
Weather information for day 10 fetched!
Weather information for day 11 fetched!
Weather information for day 12 fetched!
Weather information for day 13 fetched!
Weather information for day 14 fetched!
Weather information for day 15 fetched!
Weather information fetched!
Finished fetching data!

╔══════╤═══════════╤══════╤═══════════╤════════╤═══════════╤══════════════════╤════════════════════╤═══════════════════╤══════════════╤═══════════════════╗
║ Date │ Confirmed │ Dead │ Recovered │ Active │ New Cases │ Province of Rome │ Province of Naples │ province of Milan │ Rome         │ Province of Turin ║
╠══════╪═══════════╪══════╪═══════════╪════════╪═══════════╪══════════════════╪════════════════════╪═══════════════════╪══════════════╪═══════════════════╣
║ 27/2 │ 655       │ 17   │ 45        │ 593    │ 0         │ 16.56°C Max      │ 16.16°C Max        │ 14.20°C Max       │ 16.56°C Max  │ 12.51°C Max       ║
║      │           │      │           │        │           │ 2.67°C Min       │ 8.31°C Min         │ 0.58°C Min        │ 2.67°C Min   │ -0.56°C Min       ║
║      │           │      │           │        │           │ 69% Humidity     │ 70% Humidity       │ 54% Humidity      │ 69% Humidity │ 39% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 28/2 │ 888       │ 21   │ 46        │ 821    │ 233       │ 15.25°C Max      │ 14.81°C Max        │ 13.10°C Max       │ 15.25°C Max  │ 11.74°C Max       ║
║      │           │      │           │        │           │ 10.62°C Min      │ 11.11°C Min        │ 4.84°C Min        │ 10.62°C Min  │ -1.02°C Min       ║
║      │           │      │           │        │           │ 55% Humidity     │ 48% Humidity       │ 45% Humidity      │ 55% Humidity │ 40% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 29/2 │ 1128      │ 29   │ 46        │ 1053   │ 240       │ 18.13°C Max      │ 16.99°C Max        │ 15.77°C Max       │ 18.13°C Max  │ 14.48°C Max       ║
║      │           │      │           │        │           │ 3.47°C Min       │ 6.74°C Min         │ 3.24°C Min        │ 3.47°C Min   │ 2.72°C Min        ║
║      │           │      │           │        │           │ 53% Humidity     │ 62% Humidity       │ 30% Humidity      │ 53% Humidity │ 40% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 1/3  │ 1694      │ 34   │ 83        │ 1577   │ 566       │ 17.12°C Max      │ 16.27°C Max        │ 12.46°C Max       │ 17.12°C Max  │ 12.96°C Max       ║
║      │           │      │           │        │           │ 10.75°C Min      │ 9.91°C Min         │ 6.33°C Min        │ 10.75°C Min  │ 2.46°C Min        ║
║      │           │      │           │        │           │ 58% Humidity     │ 61% Humidity       │ 51% Humidity      │ 58% Humidity │ 48% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 2/3  │ 2036      │ 52   │ 149       │ 1835   │ 342       │ 17.76°C Max      │ 17.29°C Max        │ 9.16°C Max        │ 17.76°C Max  │ 11.77°C Max       ║
║      │           │      │           │        │           │ 9.39°C Min       │ 12.38°C Min        │ 2.69°C Min        │ 9.39°C Min   │ 2.03°C Min        ║
║      │           │      │           │        │           │ 76% Humidity     │ 76% Humidity       │ 79% Humidity      │ 76% Humidity │ 71% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 3/3  │ 2502      │ 79   │ 160       │ 2263   │ 466       │ 17.64°C Max      │ 16.84°C Max        │ 7.84°C Max        │ 17.64°C Max  │ 5.37°C Max        ║
║      │           │      │           │        │           │ 9.03°C Min       │ 11.43°C Min        │ 4.61°C Min        │ 9.03°C Min   │ 2.03°C Min        ║
║      │           │      │           │        │           │ 83% Humidity     │ 80% Humidity       │ 84% Humidity      │ 83% Humidity │ 81% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 4/3  │ 3089      │ 107  │ 276       │ 2706   │ 587       │ 13.78°C Max      │ 13.57°C Max        │ 14.26°C Max       │ 13.78°C Max  │ 15.41°C Max       ║
║      │           │      │           │        │           │ 4.73°C Min       │ 8.46°C Min         │ 2.49°C Min        │ 4.73°C Min   │ 0.12°C Min        ║
║      │           │      │           │        │           │ 74% Humidity     │ 73% Humidity       │ 68% Humidity      │ 74% Humidity │ 49% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 5/3  │ 3858      │ 148  │ 414       │ 3296   │ 769       │ 16.38°C Max      │ 14.93°C Max        │ 14.88°C Max       │ 16.38°C Max  │ 15.51°C Max       ║
║      │           │      │           │        │           │ 2.28°C Min       │ 7.62°C Min         │ 3.86°C Min        │ 2.28°C Min   │ 1.75°C Min        ║
║      │           │      │           │        │           │ 70% Humidity     │ 72% Humidity       │ 58% Humidity      │ 70% Humidity │ 39% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 6/3  │ 4636      │ 197  │ 523       │ 3916   │ 778       │ 15.43°C Max      │ 15.87°C Max        │ 10.29°C Max       │ 15.43°C Max  │ 10.17°C Max       ║
║      │           │      │           │        │           │ 11.15°C Min      │ 11.49°C Min        │ 4.27°C Min        │ 11.15°C Min  │ 1.26°C Min        ║
║      │           │      │           │        │           │ 63% Humidity     │ 69% Humidity       │ 75% Humidity      │ 63% Humidity │ 69% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 7/3  │ 5883      │ 233  │ 589       │ 5061   │ 1247      │ 15.18°C Max      │ 15.66°C Max        │ 10.40°C Max       │ 15.18°C Max  │ 13.60°C Max       ║
║      │           │      │           │        │           │ 5.02°C Min       │ 8.39°C Min         │ 3.68°C Min        │ 5.02°C Min   │ -0.23°C Min       ║
║      │           │      │           │        │           │ 78% Humidity     │ 76% Humidity       │ 78% Humidity      │ 78% Humidity │ 69% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 8/3  │ 7375      │ 366  │ 622       │ 6387   │ 1492      │ 15.61°C Max      │ 14.83°C Max        │ 17.77°C Max       │ 15.61°C Max  │ 16.99°C Max       ║
║      │           │      │           │        │           │ 4.29°C Min       │ 7.67°C Min         │ 1.93°C Min        │ 4.29°C Min   │ 0.64°C Min        ║
║      │           │      │           │        │           │ 74% Humidity     │ 76% Humidity       │ 53% Humidity      │ 74% Humidity │ 42% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 9/3  │ 9172      │ 463  │ 724       │ 7985   │ 1797      │ 17.51°C Max      │ 16.51°C Max        │ 15.41°C Max       │ 17.51°C Max  │ 15.02°C Max       ║
║      │           │      │           │        │           │ 2.12°C Min       │ 6.75°C Min         │ 4.86°C Min        │ 2.12°C Min   │ 3.21°C Min        ║
║      │           │      │           │        │           │ 58% Humidity     │ 59% Humidity       │ 52% Humidity      │ 58% Humidity │ 42% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 10/3 │ 10149     │ 631  │ 724       │ 8794   │ 977       │ 15.56°C Max      │ 14.56°C Max        │ 11.36°C Max       │ 15.56°C Max  │ 12.36°C Max       ║
║      │           │      │           │        │           │ 2.66°C Min       │ 7.62°C Min         │ 3.11°C Min        │ 2.66°C Min   │ 1.32°C Min        ║
║      │           │      │           │        │           │ 63% Humidity     │ 60% Humidity       │ 69% Humidity      │ 63% Humidity │ 64% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 11/3 │ 12462     │ 827  │ 1045      │ 10590  │ 2313      │ 18.07°C Max      │ 16.86°C Max        │ 16.52°C Max       │ 18.07°C Max  │ 16.92°C Max       ║
║      │           │      │           │        │           │ 4.17°C Min       │ 8.07°C Min         │ 3.93°C Min        │ 4.17°C Min   │ 4.31°C Min        ║
║      │           │      │           │        │           │ 62% Humidity     │ 58% Humidity       │ 56% Humidity      │ 62% Humidity │ 46% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 12/3 │ 12462     │ 827  │ 1045      │ 10590  │ 0         │ 19.97°C Max      │ 17.89°C Max        │ 19.70°C Max       │ 19.97°C Max  │ 22.61°C Max       ║
║      │           │      │           │        │           │ 6.08°C Min       │ 9.53°C Min         │ 6.95°C Min        │ 6.08°C Min   │ 6.19°C Min        ║
║      │           │      │           │        │           │ 65% Humidity     │ 68% Humidity       │ 65% Humidity      │ 65% Humidity │ 54% Humidity      ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────────┼────────────────────┼───────────────────┼──────────────┼───────────────────╢
║ 13/3 │ 17660     │ 1266 │ 1439      │ 14955  │ 5198      │ 19.62°C Max      │ 18.00°C Max        │ 16.73°C Max       │ 19.62°C Max  │ 17.63°C Max       ║
║      │           │      │           │        │           │ 8.21°C Min       │ 10.67°C Min        │ 9.05°C Min        │ 8.21°C Min   │ 7.68°C Min        ║
║      │           │      │           │        │           │ 72% Humidity     │ 73% Humidity       │ 77% Humidity      │ 72% Humidity │ 75% Humidity      ║
╚══════╧═══════════╧══════╧═══════════╧════════╧═══════════╧══════════════════╧════════════════════╧═══════════════════╧══════════════╧═══════════════════╝

```


### India
---
```
Country code fetched! - IN
Geocoded locations fetched! - 
Delhi
Jammu and Kashmir
Mumbai
Bangalore
Chennai
COVID-19 historical data fetched! - 43 records.
API Key set!
Weather information fetched!
Finished fetching data!

╔══════╤═══════════╤══════╤═══════════╤════════╤═══════════╤══════════════╤═══════════════════╤══════════════╤══════════════╤══════════════╗
║ Date │ Confirmed │ Dead │ Recovered │ Active │ New Cases │ Delhi        │ Jammu and Kashmir │ Mumbai       │ Bangalore    │ Chennai      ║
╠══════╪═══════════╪══════╪═══════════╪════════╪═══════════╪══════════════╪═══════════════════╪══════════════╪══════════════╪══════════════╣
║ 24/3 │ 536       │ 10   │ 40        │ 486    │ 0         │ 32.52°C Max  │ -5.99°C Max       │ 31.53°C Max  │ 33.84°C Max  │ 32.13°C Max  ║
║      │           │      │           │        │           │ 19.33°C Min  │ -14.71°C Min      │ 25.69°C Min  │ 18.68°C Min  │ 24.03°C Min  ║
║      │           │      │           │        │           │ 38% Humidity │ 92% Humidity      │ 73% Humidity │ 48% Humidity │ 73% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 25/3 │ 657       │ 12   │ 43        │ 602    │ 121       │ 33.80°C Max  │ -5.64°C Max       │ 30.74°C Max  │ 32.53°C Max  │ 32.52°C Max  ║
║      │           │      │           │        │           │ 22.36°C Min  │ -15.12°C Min      │ 24.92°C Min  │ 18.34°C Min  │ 23.67°C Min  ║
║      │           │      │           │        │           │ 45% Humidity │ 89% Humidity      │ 76% Humidity │ 47% Humidity │ 73% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 26/3 │ 727       │ 20   │ 45        │ 662    │ 70        │ 31.91°C Max  │ -4.36°C Max       │ 31.58°C Max  │ 33.54°C Max  │ 32.19°C Max  ║
║      │           │      │           │        │           │ 21.19°C Min  │ -12.14°C Min      │ 25.59°C Min  │ 18.13°C Min  │ 24.16°C Min  ║
║      │           │      │           │        │           │ 41% Humidity │ 81% Humidity      │ 78% Humidity │ 46% Humidity │ 74% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 27/3 │ 887       │ 20   │ 73        │ 794    │ 160       │ 25.91°C Max  │ -4.59°C Max       │ 31.92°C Max  │ 32.68°C Max  │ 32.54°C Max  ║
║      │           │      │           │        │           │ 18.26°C Min  │ -11.37°C Min      │ 26.41°C Min  │ 17.23°C Min  │ 22.86°C Min  ║
║      │           │      │           │        │           │ 59% Humidity │ 99% Humidity      │ 74% Humidity │ 44% Humidity │ 69% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 28/3 │ 987       │ 24   │ 84        │ 879    │ 100       │ 30.08°C Max  │ -8.53°C Max       │ 32.22°C Max  │ 33.68°C Max  │ 32.38°C Max  ║
║      │           │      │           │        │           │ 17.71°C Min  │ -18.46°C Min      │ 25.45°C Min  │ 17.24°C Min  │ 22.42°C Min  ║
║      │           │      │           │        │           │ 55% Humidity │ 98% Humidity      │ 66% Humidity │ 39% Humidity │ 69% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 29/3 │ 1024      │ 27   │ 95        │ 902    │ 37        │ 30.88°C Max  │ -6.76°C Max       │ 32.06°C Max  │ 33.78°C Max  │ 32.82°C Max  ║
║      │           │      │           │        │           │ 17.71°C Min  │ -16.64°C Min      │ 25.39°C Min  │ 18.06°C Min  │ 22.32°C Min  ║
║      │           │      │           │        │           │ 43% Humidity │ 87% Humidity      │ 62% Humidity │ 36% Humidity │ 71% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 30/3 │ 1251      │ 32   │ 102       │ 1117   │ 227       │ 31.41°C Max  │ -6.34°C Max       │ 31.98°C Max  │ 34.39°C Max  │ 32.49°C Max  ║
║      │           │      │           │        │           │ 16.87°C Min  │ -13.76°C Min      │ 24.85°C Min  │ 17.01°C Min  │ 22.28°C Min  ║
║      │           │      │           │        │           │ 38% Humidity │ 80% Humidity      │ 65% Humidity │ 36% Humidity │ 71% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 31/3 │ 1397      │ 35   │ 123       │ 1239   │ 146       │ 32.82°C Max  │ -4.94°C Max       │ 31.46°C Max  │ 33.98°C Max  │ 32.66°C Max  ║
║      │           │      │           │        │           │ 19.80°C Min  │ -11.29°C Min      │ 23.91°C Min  │ 18.25°C Min  │ 23.26°C Min  ║
║      │           │      │           │        │           │ 39% Humidity │ 94% Humidity      │ 69% Humidity │ 36% Humidity │ 73% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 1/4  │ 1998      │ 58   │ 148       │ 1792   │ 601       │ 33.72°C Max  │ -8.91°C Max       │ 31.59°C Max  │ 34.63°C Max  │ 33.72°C Max  ║
║      │           │      │           │        │           │ 20.73°C Min  │ -17.17°C Min      │ 24.47°C Min  │ 19.67°C Min  │ 24.12°C Min  ║
║      │           │      │           │        │           │ 40% Humidity │ 100% Humidity     │ 69% Humidity │ 34% Humidity │ 73% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 2/4  │ 2543      │ 72   │ 191       │ 2280   │ 545       │ 31.31°C Max  │ -8.70°C Max       │ 32.57°C Max  │ 35.01°C Max  │ 33.92°C Max  ║
║      │           │      │           │        │           │ 18.60°C Min  │ -17.65°C Min      │ 24.86°C Min  │ 19.43°C Min  │ 24.45°C Min  ║
║      │           │      │           │        │           │ 37% Humidity │ 93% Humidity      │ 68% Humidity │ 37% Humidity │ 75% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 3/4  │ 2567      │ 72   │ 192       │ 2303   │ 24        │ 32.50°C Max  │ -5.40°C Max       │ 31.76°C Max  │ 34.87°C Max  │ 34.19°C Max  ║
║      │           │      │           │        │           │ 16.14°C Min  │ -13.61°C Min      │ 24.82°C Min  │ 17.63°C Min  │ 23.52°C Min  ║
║      │           │      │           │        │           │ 28% Humidity │ 70% Humidity      │ 73% Humidity │ 40% Humidity │ 75% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 4/4  │ 3082      │ 86   │ 229       │ 2767   │ 515       │ 33.93°C Max  │ -5.58°C Max       │ 31.05°C Max  │ 35.45°C Max  │ 33.53°C Max  ║
║      │           │      │           │        │           │ 17.02°C Min  │ -14.18°C Min      │ 24.28°C Min  │ 18.50°C Min  │ 24.75°C Min  ║
║      │           │      │           │        │           │ 30% Humidity │ 83% Humidity      │ 75% Humidity │ 40% Humidity │ 73% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 5/4  │ 3588      │ 99   │ 229       │ 3260   │ 506       │ 33.89°C Max  │ -6.43°C Max       │ 31.07°C Max  │ 35.48°C Max  │ 34.26°C Max  ║
║      │           │      │           │        │           │ 19.47°C Min  │ -15.32°C Min      │ 25.02°C Min  │ 20.87°C Min  │ 26.62°C Min  ║
║      │           │      │           │        │           │ 35% Humidity │ 85% Humidity      │ 76% Humidity │ 51% Humidity │ 79% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 6/4  │ 4778      │ 136  │ 375       │ 4267   │ 1190      │ 35.48°C Max  │ -7.70°C Max       │ 30.83°C Max  │ 34.34°C Max  │ 34.80°C Max  ║
║      │           │      │           │        │           │ 20.19°C Min  │ -14.69°C Min      │ 25.02°C Min  │ 21.41°C Min  │ 25.45°C Min  ║
║      │           │      │           │        │           │ 32% Humidity │ 95% Humidity      │ 77% Humidity │ 53% Humidity │ 80% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 7/4  │ 5311      │ 150  │ 421       │ 4740   │ 533       │ 35.23°C Max  │ -5.88°C Max       │ 30.70°C Max  │ 31.77°C Max  │ 34.24°C Max  ║
║      │           │      │           │        │           │ 19.94°C Min  │ -14.77°C Min      │ 24.34°C Min  │ 20.16°C Min  │ 26.17°C Min  ║
║      │           │      │           │        │           │ 31% Humidity │ 88% Humidity      │ 75% Humidity │ 58% Humidity │ 78% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 8/4  │ 5916      │ 178  │ 506       │ 5232   │ 605       │ 34.34°C Max  │ -4.87°C Max       │ 31.16°C Max  │ 29.78°C Max  │ 33.81°C Max  ║
║      │           │      │           │        │           │ 19.30°C Min  │ -15.19°C Min      │ 23.75°C Min  │ 21.03°C Min  │ 26.32°C Min  ║
║      │           │      │           │        │           │ 31% Humidity │ 82% Humidity      │ 73% Humidity │ 58% Humidity │ 82% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 9/4  │ 6725      │ 226  │ 620       │ 5879   │ 809       │ 34.82°C Max  │ -2.37°C Max       │ 31.33°C Max  │ 32.28°C Max  │ 33.51°C Max  ║
║      │           │      │           │        │           │ 21.28°C Min  │ -10.48°C Min      │ 24.23°C Min  │ 21.07°C Min  │ 24.17°C Min  ║
║      │           │      │           │        │           │ 30% Humidity │ 79% Humidity      │ 74% Humidity │ 54% Humidity │ 81% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 10/4 │ 7598      │ 246  │ 774       │ 6578   │ 873       │ 36.03°C Max  │ -3.15°C Max       │ 32.06°C Max  │ 32.61°C Max  │ 33.12°C Max  ║
║      │           │      │           │        │           │ 22.85°C Min  │ -13.25°C Min      │ 25.73°C Min  │ 19.39°C Min  │ 25.78°C Min  ║
║      │           │      │           │        │           │ 28% Humidity │ 96% Humidity      │ 74% Humidity │ 48% Humidity │ 77% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 11/4 │ 8446      │ 288  │ 969       │ 7189   │ 848       │ 37.61°C Max  │ -0.51°C Max       │ 32.73°C Max  │ 32.51°C Max  │ 32.83°C Max  ║
║      │           │      │           │        │           │ 25.43°C Min  │ -10.21°C Min      │ 26.46°C Min  │ 19.99°C Min  │ 24.54°C Min  ║
║      │           │      │           │        │           │ 27% Humidity │ 71% Humidity      │ 74% Humidity │ 51% Humidity │ 75% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 12/4 │ 9205      │ 331  │ 1080      │ 7794   │ 759       │ 37.47°C Max  │ 1.52°C Max        │ 33.59°C Max  │ 33.71°C Max  │ 33.79°C Max  ║
║      │           │      │           │        │           │ 24.91°C Min  │ -9.57°C Min       │ 26.22°C Min  │ 18.84°C Min  │ 24.27°C Min  ║
║      │           │      │           │        │           │ 25% Humidity │ 76% Humidity      │ 70% Humidity │ 41% Humidity │ 72% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 13/4 │ 10453     │ 358  │ 1181      │ 8914   │ 1248      │ 38.98°C Max  │ 1.29°C Max        │ 32.21°C Max  │ 34.14°C Max  │ 33.78°C Max  ║
║      │           │      │           │        │           │ 25.37°C Min  │ -10.38°C Min      │ 26.18°C Min  │ 19.18°C Min  │ 24.01°C Min  ║
║      │           │      │           │        │           │ 26% Humidity │ 85% Humidity      │ 78% Humidity │ 32% Humidity │ 72% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 14/4 │ 11487     │ 393  │ 1359      │ 9735   │ 1034      │ 39.15°C Max  │ 0.50°C Max        │ 33.37°C Max  │ 33.96°C Max  │ 33.25°C Max  ║
║      │           │      │           │        │           │ 25.11°C Min  │ -8.02°C Min       │ 26.24°C Min  │ 17.38°C Min  │ 24.97°C Min  ║
║      │           │      │           │        │           │ 27% Humidity │ 92% Humidity      │ 74% Humidity │ 26% Humidity │ 73% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 15/4 │ 12322     │ 405  │ 1432      │ 10485  │ 835       │ 38.68°C Max  │ -3.38°C Max       │ 33.56°C Max  │ 34.04°C Max  │ 33.28°C Max  ║
║      │           │      │           │        │           │ 25.13°C Min  │ -11.99°C Min      │ 26.11°C Min  │ 19.53°C Min  │ 24.16°C Min  ║
║      │           │      │           │        │           │ 22% Humidity │ 100% Humidity     │ 75% Humidity │ 28% Humidity │ 73% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 16/4 │ 13430     │ 448  │ 1768      │ 11214  │ 1108      │ 38.82°C Max  │ -1.48°C Max       │ 31.70°C Max  │ 34.29°C Max  │ 34.32°C Max  ║
║      │           │      │           │        │           │ 25.46°C Min  │ -12.11°C Min      │ 25.77°C Min  │ 20.21°C Min  │ 26.09°C Min  ║
║      │           │      │           │        │           │ 19% Humidity │ 91% Humidity      │ 82% Humidity │ 43% Humidity │ 75% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 17/4 │ 14352     │ 486  │ 2041      │ 11825  │ 922       │ 36.72°C Max  │ -5.49°C Max       │ 31.53°C Max  │ 35.12°C Max  │ 35.46°C Max  ║
║      │           │      │           │        │           │ 21.06°C Min  │ -10.28°C Min      │ 26.21°C Min  │ 20.92°C Min  │ 26.71°C Min  ║
║      │           │      │           │        │           │ 25% Humidity │ 98% Humidity      │ 82% Humidity │ 43% Humidity │ 77% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 18/4 │ 15722     │ 521  │ 2463      │ 12738  │ 1370      │ 34.66°C Max  │ -6.38°C Max       │ 32.57°C Max  │ 35.39°C Max  │ 34.99°C Max  ║
║      │           │      │           │        │           │ 21.91°C Min  │ -13.77°C Min      │ 26.54°C Min  │ 20.25°C Min  │ 25.63°C Min  ║
║      │           │      │           │        │           │ 43% Humidity │ 100% Humidity     │ 77% Humidity │ 45% Humidity │ 76% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 19/4 │ 17615     │ 559  │ 2854      │ 14202  │ 1893      │ 35.26°C Max  │ -5.29°C Max       │ 33.51°C Max  │ 34.48°C Max  │ 34.63°C Max  ║
║      │           │      │           │        │           │ 23.05°C Min  │ -14.41°C Min      │ 26.81°C Min  │ 19.91°C Min  │ 26.24°C Min  ║
║      │           │      │           │        │           │ 33% Humidity │ 90% Humidity      │ 74% Humidity │ 47% Humidity │ 78% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 20/4 │ 18539     │ 592  │ 3273      │ 14674  │ 924       │ 31.84°C Max  │ -3.04°C Max       │ 35.22°C Max  │ 34.18°C Max  │ 33.53°C Max  ║
║      │           │      │           │        │           │ 20.30°C Min  │ -12.14°C Min      │ 25.76°C Min  │ 19.36°C Min  │ 25.14°C Min  ║
║      │           │      │           │        │           │ 36% Humidity │ 84% Humidity      │ 64% Humidity │ 46% Humidity │ 76% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 21/4 │ 20080     │ 645  │ 3975      │ 15460  │ 1541      │ 34.01°C Max  │ -3.28°C Max       │ 33.43°C Max  │ 34.90°C Max  │ 34.12°C Max  ║
║      │           │      │           │        │           │ 21.28°C Min  │ -13.46°C Min      │ 25.94°C Min  │ 20.58°C Min  │ 26.18°C Min  ║
║      │           │      │           │        │           │ 39% Humidity │ 94% Humidity      │ 69% Humidity │ 42% Humidity │ 74% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 22/4 │ 21370     │ 681  │ 4370      │ 16319  │ 1290      │ 35.64°C Max  │ -1.88°C Max       │ 32.18°C Max  │ 34.27°C Max  │ 34.01°C Max  ║
║      │           │      │           │        │           │ 25.11°C Min  │ -12.53°C Min      │ 27.02°C Min  │ 21.96°C Min  │ 26.96°C Min  ║
║      │           │      │           │        │           │ 29% Humidity │ 83% Humidity      │ 77% Humidity │ 48% Humidity │ 77% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 23/4 │ 23077     │ 721  │ 5012      │ 17344  │ 1707      │ 34.53°C Max  │ -1.39°C Max       │ 32.58°C Max  │ 34.71°C Max  │ 34.08°C Max  ║
║      │           │      │           │        │           │ 21.97°C Min  │ -11.04°C Min      │ 26.38°C Min  │ 21.88°C Min  │ 26.77°C Min  ║
║      │           │      │           │        │           │ 30% Humidity │ 82% Humidity      │ 76% Humidity │ 53% Humidity │ 79% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 24/4 │ 24530     │ 780  │ 5498      │ 18252  │ 1453      │ 37.13°C Max  │ -0.51°C Max       │ 32.92°C Max  │ 31.55°C Max  │ 34.69°C Max  ║
║      │           │      │           │        │           │ 25.16°C Min  │ -11.22°C Min      │ 27.11°C Min  │ 20.75°C Min  │ 27.77°C Min  ║
║      │           │      │           │        │           │ 34% Humidity │ 74% Humidity      │ 78% Humidity │ 59% Humidity │ 78% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 25/4 │ 26283     │ 825  │ 5939      │ 19519  │ 1753      │ 34.84°C Max  │ -0.32°C Max       │ 32.53°C Max  │ 30.71°C Max  │ 33.59°C Max  ║
║      │           │      │           │        │           │ 24.27°C Min  │ -10.07°C Min      │ 26.04°C Min  │ 20.82°C Min  │ 27.59°C Min  ║
║      │           │      │           │        │           │ 35% Humidity │ 78% Humidity      │ 75% Humidity │ 67% Humidity │ 81% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 26/4 │ 27890     │ 881  │ 6523      │ 20486  │ 1607      │ 34.03°C Max  │ -0.77°C Max       │ 32.28°C Max  │ 31.76°C Max  │ 34.04°C Max  ║
║      │           │      │           │        │           │ 21.10°C Min  │ -9.32°C Min       │ 26.17°C Min  │ 21.77°C Min  │ 28.06°C Min  ║
║      │           │      │           │        │           │ 42% Humidity │ 90% Humidity      │ 73% Humidity │ 61% Humidity │ 79% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 27/4 │ 29451     │ 939  │ 7137      │ 21375  │ 1561      │ 32.80°C Max  │ -1.21°C Max       │ 32.17°C Max  │ 31.05°C Max  │ 33.91°C Max  ║
║      │           │      │           │        │           │ 22.11°C Min  │ -9.76°C Min       │ 26.71°C Min  │ 20.35°C Min  │ 26.47°C Min  ║
║      │           │      │           │        │           │ 55% Humidity │ 96% Humidity      │ 76% Humidity │ 60% Humidity │ 82% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 28/4 │ 31324     │ 1008 │ 7747      │ 22569  │ 1873      │ 34.07°C Max  │ -0.17°C Max       │ 32.73°C Max  │ 32.86°C Max  │ 33.26°C Max  ║
║      │           │      │           │        │           │ 24.74°C Min  │ -9.23°C Min       │ 27.81°C Min  │ 20.15°C Min  │ 27.29°C Min  ║
║      │           │      │           │        │           │ 51% Humidity │ 91% Humidity      │ 76% Humidity │ 59% Humidity │ 80% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 29/4 │ 33062     │ 1079 │ 8437      │ 23546  │ 1738      │ 37.24°C Max  │ 1.38°C Max        │ 32.32°C Max  │ 27.23°C Max  │ 34.37°C Max  ║
║      │           │      │           │        │           │ 26.54°C Min  │ -9.47°C Min       │ 27.60°C Min  │ 20.47°C Min  │ 27.38°C Min  ║
║      │           │      │           │        │           │ 42% Humidity │ 84% Humidity      │ 79% Humidity │ 73% Humidity │ 76% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 30/4 │ 34863     │ 1154 │ 9068      │ 24641  │ 1801      │ 38.37°C Max  │ 1.04°C Max        │ 32.18°C Max  │ 32.53°C Max  │ 33.99°C Max  ║
║      │           │      │           │        │           │ 25.65°C Min  │ -9.36°C Min       │ 27.65°C Min  │ 21.26°C Min  │ 27.46°C Min  ║
║      │           │      │           │        │           │ 39% Humidity │ 93% Humidity      │ 80% Humidity │ 55% Humidity │ 78% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 1/5  │ 37257     │ 1223 │ 10007     │ 26027  │ 2394      │ 39.58°C Max  │ 2.96°C Max        │ 31.90°C Max  │ 33.79°C Max  │ 35.18°C Max  ║
║      │           │      │           │        │           │ 25.11°C Min  │ -6.99°C Min       │ 27.22°C Min  │ 21.55°C Min  │ 26.73°C Min  ║
║      │           │      │           │        │           │ 36% Humidity │ 71% Humidity      │ 79% Humidity │ 52% Humidity │ 79% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 2/5  │ 39699     │ 1323 │ 10819     │ 27557  │ 2442      │ 38.87°C Max  │ 0.29°C Max        │ 32.46°C Max  │ 33.01°C Max  │ 35.92°C Max  ║
║      │           │      │           │        │           │ 25.88°C Min  │ -8.11°C Min       │ 27.68°C Min  │ 20.61°C Min  │ 27.28°C Min  ║
║      │           │      │           │        │           │ 41% Humidity │ 99% Humidity      │ 79% Humidity │ 55% Humidity │ 78% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 3/5  │ 42505     │ 1391 │ 11775     │ 29339  │ 2806      │ 35.32°C Max  │ -2.43°C Max       │ 32.79°C Max  │ 34.17°C Max  │ 34.78°C Max  ║
║      │           │      │           │        │           │ 22.60°C Min  │ -10.06°C Min      │ 27.02°C Min  │ 21.57°C Min  │ 26.61°C Min  ║
║      │           │      │           │        │           │ 48% Humidity │ 99% Humidity      │ 78% Humidity │ 54% Humidity │ 78% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 4/5  │ 46437     │ 1566 │ 12847     │ 32024  │ 3932      │ 35.59°C Max  │ -3.77°C Max       │ 33.28°C Max  │ 33.71°C Max  │ 35.26°C Max  ║
║      │           │      │           │        │           │ 24.27°C Min  │ -10.73°C Min      │ 27.05°C Min  │ 22.49°C Min  │ 26.92°C Min  ║
║      │           │      │           │        │           │ 50% Humidity │ 96% Humidity      │ 77% Humidity │ 51% Humidity │ 76% Humidity ║
╟──────┼───────────┼──────┼───────────┼────────┼───────────┼──────────────┼───────────────────┼──────────────┼──────────────┼──────────────╢
║ 5/5  │ 49400     │ 1693 │ 14142     │ 33565  │ 2963      │ 35.82°C Max  │ -3.28°C Max       │ 32.96°C Max  │ 35.33°C Max  │ 35.28°C Max  ║
║      │           │      │           │        │           │ 22.52°C Min  │ -12.28°C Min      │ 27.33°C Min  │ 20.87°C Min  │ 27.12°C Min  ║
║      │           │      │           │        │           │ 44% Humidity │ 92% Humidity      │ 79% Humidity │ 43% Humidity │ 77% Humidity ║
╚══════╧═══════════╧══════╧═══════════╧════════╧═══════════╧══════════════╧═══════════════════╧══════════════╧══════════════╧══════════════╝

```
### United States of America
---
```
Country code fetched! - US
Geocoded locations fetched! - 
Los Angeles County
New York City
Cook County
Harris County
Maricopa County
COVID-19 historical data fetched! - 59 records.
API Key set!
Weather information fetched!
Finished fetching data!

╔══════╤═══════════╤═══════╤═══════════╤════════╤═══════════╤════════════════════╤═══════════════╤══════════════╤═══════════════╤═════════════════╗
║ Date │ Confirmed │ Dead  │ Recovered │ Active │ New Cases │ Los Angeles County │ New York City │ Cook County  │ Harris County │ Maricopa County ║
╠══════╪═══════════╪═══════╪═══════════╪════════╪═══════════╪════════════════════╪═══════════════╪══════════════╪═══════════════╪═════════════════╣
║ 8/3  │ 518       │ 21    │ 7         │ 490    │ 0         │ 17.88°C Max        │ 8.70°C Max    │ 10.69°C Max  │ 17.25°C Max   │ 27.36°C Max     ║
║      │           │       │           │        │           │ 10.42°C Min        │ 0.46°C Min    │ 2.45°C Min   │ 8.95°C Min    │ 13.34°C Min     ║
║      │           │       │           │        │           │ 69% Humidity       │ 51% Humidity  │ 57% Humidity │ 58% Humidity  │ 31% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 9/3  │ 583       │ 22    │ 7         │ 554    │ 65        │ 19.30°C Max        │ 13.84°C Max   │ 17.98°C Max  │ 22.49°C Max   │ 23.60°C Max     ║
║      │           │       │           │        │           │ 9.26°C Min         │ 5.33°C Min    │ 7.91°C Min   │ 16.19°C Min   │ 9.14°C Min      ║
║      │           │       │           │        │           │ 62% Humidity       │ 42% Humidity  │ 40% Humidity │ 73% Humidity  │ 36% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 10/3 │ 959       │ 28    │ 8         │ 923    │ 376       │ 23.57°C Max        │ 19.67°C Max   │ 13.87°C Max  │ 23.70°C Max   │ 25.08°C Max     ║
║      │           │       │           │        │           │ 13.73°C Min        │ 8.81°C Min    │ 1.99°C Min   │ 17.80°C Min   │ 15.02°C Min     ║
║      │           │       │           │        │           │ 50% Humidity       │ 41% Humidity  │ 70% Humidity │ 80% Humidity  │ 44% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 11/3 │ 1281      │ 36    │ 8         │ 1237   │ 322       │ 19.79°C Max        │ 17.29°C Max   │ 6.00°C Max   │ 27.17°C Max   │ 23.09°C Max     ║
║      │           │       │           │        │           │ 14.92°C Min        │ 5.80°C Min    │ 0.58°C Min   │ 16.66°C Min   │ 15.67°C Min     ║
║      │           │       │           │        │           │ 77% Humidity       │ 63% Humidity  │ 79% Humidity │ 82% Humidity  │ 61% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 12/3 │ 1663      │ 41    │ 12        │ 1610   │ 382       │ 22.67°C Max        │ 12.74°C Max   │ 7.43°C Max   │ 27.39°C Max   │ 20.29°C Max     ║
║      │           │       │           │        │           │ 12.72°C Min        │ 4.13°C Min    │ 1.71°C Min   │ 18.78°C Min   │ 16.24°C Min     ║
║      │           │       │           │        │           │ 70% Humidity       │ 57% Humidity  │ 77% Humidity │ 78% Humidity  │ 91% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 13/3 │ 2179      │ 49    │ 12        │ 2118   │ 516       │ 16.95°C Max        │ 9.43°C Max    │ 12.98°C Max  │ 28.78°C Max   │ 21.01°C Max     ║
║      │           │       │           │        │           │ 11.79°C Min        │ 7.31°C Min    │ 0.70°C Min   │ 20.02°C Min   │ 11.47°C Min     ║
║      │           │       │           │        │           │ 76% Humidity       │ 74% Humidity  │ 80% Humidity │ 75% Humidity  │ 89% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 14/3 │ 2727      │ 58    │ 12        │ 2657   │ 548       │ 14.85°C Max        │ 19.42°C Max   │ 9.35°C Max   │ 27.92°C Max   │ 17.78°C Max     ║
║      │           │       │           │        │           │ 12.50°C Min        │ 5.33°C Min    │ 1.49°C Min   │ 20.79°C Min   │ 9.64°C Min      ║
║      │           │       │           │        │           │ 83% Humidity       │ 71% Humidity  │ 54% Humidity │ 81% Humidity  │ 81% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 15/3 │ 3499      │ 73    │ 12        │ 3414   │ 772       │ 15.63°C Max        │ 12.92°C Max   │ 3.70°C Max   │ 27.56°C Max   │ 21.23°C Max     ║
║      │           │       │           │        │           │ 11.65°C Min        │ 5.01°C Min    │ -0.17°C Min  │ 20.31°C Min   │ 10.28°C Min     ║
║      │           │       │           │        │           │ 82% Humidity       │ 44% Humidity  │ 69% Humidity │ 81% Humidity  │ 69% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 16/3 │ 4632      │ 99    │ 17        │ 4516   │ 1133      │ 17.93°C Max        │ 11.37°C Max   │ 4.71°C Max   │ 27.80°C Max   │ 23.87°C Max     ║
║      │           │       │           │        │           │ 11.36°C Min        │ 0.39°C Min    │ -0.97°C Min  │ 18.39°C Min   │ 10.51°C Min     ║
║      │           │       │           │        │           │ 69% Humidity       │ 50% Humidity  │ 70% Humidity │ 83% Humidity  │ 59% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 17/3 │ 6421      │ 133   │ 17        │ 6271   │ 1789      │ 16.22°C Max        │ 6.93°C Max    │ 5.20°C Max   │ 24.69°C Max   │ 24.48°C Max     ║
║      │           │       │           │        │           │ 7.52°C Min         │ 4.42°C Min    │ 1.96°C Min   │ 20.10°C Min   │ 11.76°C Min     ║
║      │           │       │           │        │           │ 70% Humidity       │ 55% Humidity  │ 82% Humidity │ 83% Humidity  │ 57% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 18/3 │ 7783      │ 164   │ 105       │ 7514   │ 1362      │ 15.48°C Max        │ 11.56°C Max   │ 8.27°C Max   │ 28.82°C Max   │ 22.48°C Max     ║
║      │           │       │           │        │           │ 8.02°C Min         │ 4.08°C Min    │ 1.86°C Min   │ 20.63°C Min   │ 11.58°C Min     ║
║      │           │       │           │        │           │ 66% Humidity       │ 81% Humidity  │ 61% Humidity │ 81% Humidity  │ 56% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 19/3 │ 13747     │ 258   │ 121       │ 13368  │ 5964      │ 18.83°C Max        │ 10.56°C Max   │ 6.83°C Max   │ 28.19°C Max   │ 18.75°C Max     ║
║      │           │       │           │        │           │ 9.91°C Min         │ 5.39°C Min    │ 3.29°C Min   │ 21.74°C Min   │ 8.92°C Min      ║
║      │           │       │           │        │           │ 55% Humidity       │ 57% Humidity  │ 76% Humidity │ 80% Humidity  │ 73% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 20/3 │ 19273     │ 349   │ 147       │ 18777  │ 5526      │ 16.30°C Max        │ 10.48°C Max   │ 13.96°C Max  │ 29.24°C Max   │ 17.32°C Max     ║
║      │           │       │           │        │           │ 10.68°C Min        │ 7.17°C Min    │ 4.17°C Min   │ 22.07°C Min   │ 7.74°C Min      ║
║      │           │       │           │        │           │ 67% Humidity       │ 84% Humidity  │ 90% Humidity │ 79% Humidity  │ 65% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 21/3 │ 25600     │ 442   │ 176       │ 24982  │ 6327      │ 19.11°C Max        │ 21.75°C Max   │ 5.31°C Max   │ 23.09°C Max   │ 21.36°C Max     ║
║      │           │       │           │        │           │ 11.63°C Min        │ 5.94°C Min    │ -2.44°C Min  │ 11.93°C Min   │ 10.04°C Min     ║
║      │           │       │           │        │           │ 65% Humidity       │ 81% Humidity  │ 79% Humidity │ 90% Humidity  │ 51% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 22/3 │ 33276     │ 586   │ 178       │ 32512  │ 7676      │ 20.59°C Max        │ 10.81°C Max   │ 0.27°C Max   │ 15.62°C Max   │ 22.86°C Max     ║
║      │           │       │           │        │           │ 10.49°C Min        │ 0.93°C Min    │ -2.94°C Min  │ 13.94°C Min   │ 10.11°C Min     ║
║      │           │       │           │        │           │ 65% Humidity       │ 51% Humidity  │ 68% Humidity │ 84% Humidity  │ 48% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 23/3 │ 43843     │ 786   │ 178       │ 42879  │ 10567     │ 21.79°C Max        │ 6.86°C Max    │ 2.98°C Max   │ 25.44°C Max   │ 23.26°C Max     ║
║      │           │       │           │        │           │ 12.21°C Min        │ 2.59°C Min    │ -0.16°C Min  │ 20.10°C Min   │ 11.94°C Min     ║
║      │           │       │           │        │           │ 68% Humidity       │ 50% Humidity  │ 75% Humidity │ 89% Humidity  │ 49% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 24/3 │ 53736     │ 1008  │ 348       │ 52380  │ 9893      │ 18.76°C Max        │ 6.41°C Max    │ 6.57°C Max   │ 28.42°C Max   │ 24.01°C Max     ║
║      │           │       │           │        │           │ 10.74°C Min        │ 2.11°C Min    │ -0.36°C Min  │ 21.38°C Min   │ 10.52°C Min     ║
║      │           │       │           │        │           │ 71% Humidity       │ 81% Humidity  │ 83% Humidity │ 84% Humidity  │ 49% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 25/3 │ 65778     │ 1316  │ 361       │ 64101  │ 12042     │ 18.63°C Max        │ 12.42°C Max   │ 8.05°C Max   │ 30.96°C Max   │ 25.40°C Max     ║
║      │           │       │           │        │           │ 11.48°C Min        │ 4.25°C Min    │ -0.39°C Min  │ 20.29°C Min   │ 11.16°C Min     ║
║      │           │       │           │        │           │ 69% Humidity       │ 70% Humidity  │ 77% Humidity │ 78% Humidity  │ 44% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 26/3 │ 83836     │ 1726  │ 681       │ 81429  │ 18058     │ 19.19°C Max        │ 8.30°C Max    │ 13.62°C Max  │ 31.71°C Max   │ 24.64°C Max     ║
║      │           │       │           │        │           │ 8.02°C Min         │ 1.85°C Min    │ 6.37°C Min   │ 19.06°C Min   │ 12.09°C Min     ║
║      │           │       │           │        │           │ 61% Humidity       │ 75% Humidity  │ 76% Humidity │ 77% Humidity  │ 41% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 27/3 │ 101657    │ 2265  │ 869       │ 98523  │ 17821     │ 18.29°C Max        │ 13.49°C Max   │ 8.62°C Max   │ 31.81°C Max   │ 21.03°C Max     ║
║      │           │       │           │        │           │ 8.20°C Min         │ 8.07°C Min    │ 2.15°C Min   │ 21.01°C Min   │ 7.43°C Min      ║
║      │           │       │           │        │           │ 50% Humidity       │ 67% Humidity  │ 84% Humidity │ 76% Humidity  │ 38% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 28/3 │ 121465    │ 2731  │ 1072      │ 117662 │ 19808     │ 20.01°C Max        │ 17.97°C Max   │ 9.53°C Max   │ 31.97°C Max   │ 18.43°C Max     ║
║      │           │       │           │        │           │ 9.64°C Min         │ 7.62°C Min    │ 6.91°C Min   │ 22.17°C Min   │ 5.77°C Min      ║
║      │           │       │           │        │           │ 46% Humidity       │ 59% Humidity  │ 87% Humidity │ 71% Humidity  │ 39% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 29/3 │ 140909    │ 3420  │ 2665      │ 134824 │ 19444     │ 20.29°C Max        │ 10.60°C Max   │ 14.46°C Max  │ 27.34°C Max   │ 22.38°C Max     ║
║      │           │       │           │        │           │ 9.69°C Min         │ 7.17°C Min    │ 7.74°C Min   │ 12.61°C Min   │ 9.11°C Min      ║
║      │           │       │           │        │           │ 57% Humidity       │ 71% Humidity  │ 89% Humidity │ 77% Humidity  │ 37% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 30/3 │ 161831    │ 4192  │ 5644      │ 151995 │ 20922     │ 20.08°C Max        │ 9.11°C Max    │ 9.43°C Max   │ 28.48°C Max   │ 24.77°C Max     ║
║      │           │       │           │        │           │ 10.24°C Min        │ 5.89°C Min    │ 4.07°C Min   │ 18.96°C Min   │ 9.01°C Min      ║
║      │           │       │           │        │           │ 63% Humidity       │ 89% Humidity  │ 74% Humidity │ 53% Humidity  │ 31% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 31/3 │ 188172    │ 5367  │ 7024      │ 175781 │ 26341     │ 23.58°C Max        │ 11.39°C Max   │ 9.83°C Max   │ 28.69°C Max   │ 26.39°C Max     ║
║      │           │       │           │        │           │ 11.53°C Min        │ 4.66°C Min    │ 1.64°C Min   │ 20.47°C Min   │ 11.09°C Min     ║
║      │           │       │           │        │           │ 61% Humidity       │ 83% Humidity  │ 70% Humidity │ 69% Humidity  │ 34% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 1/4  │ 213242    │ 6501  │ 8474      │ 198267 │ 25070     │ 25.04°C Max        │ 8.36°C Max    │ 6.01°C Max   │ 24.35°C Max   │ 28.23°C Max     ║
║      │           │       │           │        │           │ 13.03°C Min        │ 2.99°C Min    │ 2.08°C Min   │ 11.12°C Min   │ 14.14°C Min     ║
║      │           │       │           │        │           │ 54% Humidity       │ 79% Humidity  │ 81% Humidity │ 69% Humidity  │ 35% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 2/4  │ 243622    │ 7921  │ 9001      │ 226700 │ 30380     │ 23.54°C Max        │ 12.23°C Max   │ 10.08°C Max  │ 24.34°C Max   │ 29.62°C Max     ║
║      │           │       │           │        │           │ 14.10°C Min        │ 2.96°C Min    │ 0.60°C Min   │ 16.28°C Min   │ 13.92°C Min     ║
║      │           │       │           │        │           │ 65% Humidity       │ 61% Humidity  │ 78% Humidity │ 64% Humidity  │ 33% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 3/4  │ 275367    │ 9246  │ 9707      │ 256414 │ 31745     │ 21.12°C Max        │ 13.94°C Max   │ 14.41°C Max  │ 25.61°C Max   │ 28.89°C Max     ║
║      │           │       │           │        │           │ 11.17°C Min        │ 6.71°C Min    │ 5.91°C Min   │ 19.09°C Min   │ 12.03°C Min     ║
║      │           │       │           │        │           │ 65% Humidity       │ 54% Humidity  │ 66% Humidity │ 75% Humidity  │ 27% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 4/4  │ 308650    │ 10855 │ 14652     │ 283143 │ 33283     │ 21.28°C Max        │ 11.77°C Max   │ 19.42°C Max  │ 26.59°C Max   │ 29.31°C Max     ║
║      │           │       │           │        │           │ 11.59°C Min        │ 7.26°C Min    │ 3.98°C Min   │ 12.48°C Min   │ 11.81°C Min     ║
║      │           │       │           │        │           │ 64% Humidity       │ 72% Humidity  │ 59% Humidity │ 81% Humidity  │ 29% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 5/4  │ 336802    │ 12375 │ 17448     │ 306979 │ 28152     │ 20.91°C Max        │ 14.23°C Max   │ 7.41°C Max   │ 17.58°C Max   │ 28.82°C Max     ║
║      │           │       │           │        │           │ 13.00°C Min        │ 7.04°C Min    │ 1.64°C Min   │ 13.01°C Min   │ 13.21°C Min     ║
║      │           │       │           │        │           │ 67% Humidity       │ 75% Humidity  │ 79% Humidity │ 86% Humidity  │ 29% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 6/4  │ 366317    │ 13894 │ 19581     │ 332842 │ 29515     │ 16.98°C Max        │ 15.03°C Max   │ 9.32°C Max   │ 24.00°C Max   │ 27.72°C Max     ║
║      │           │       │           │        │           │ 12.83°C Min        │ 8.56°C Min    │ 1.23°C Min   │ 16.84°C Min   │ 11.84°C Min     ║
║      │           │       │           │        │           │ 72% Humidity       │ 79% Humidity  │ 63% Humidity │ 82% Humidity  │ 27% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 7/4  │ 397121    │ 16191 │ 21763     │ 359167 │ 30804     │ 17.09°C Max        │ 16.98°C Max   │ 16.40°C Max  │ 25.38°C Max   │ 26.88°C Max     ║
║      │           │       │           │        │           │ 11.34°C Min        │ 8.72°C Min    │ 11.13°C Min  │ 21.74°C Min   │ 11.59°C Min     ║
║      │           │       │           │        │           │ 75% Humidity       │ 58% Humidity  │ 69% Humidity │ 88% Humidity  │ 29% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 8/4  │ 428654    │ 18270 │ 23559     │ 386825 │ 31533     │ 18.66°C Max        │ 17.07°C Max   │ 25.61°C Max  │ 30.70°C Max   │ 28.19°C Max     ║
║      │           │       │           │        │           │ 10.52°C Min        │ 10.04°C Min   │ 8.46°C Min   │ 22.01°C Min   │ 12.73°C Min     ║
║      │           │       │           │        │           │ 72% Humidity       │ 49% Humidity  │ 76% Humidity │ 84% Humidity  │ 30% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 9/4  │ 462780    │ 20255 │ 25410     │ 417115 │ 34126     │ 16.89°C Max        │ 17.41°C Max   │ 20.00°C Max  │ 32.19°C Max   │ 24.88°C Max     ║
║      │           │       │           │        │           │ 10.47°C Min        │ 7.43°C Min    │ 3.65°C Min   │ 21.39°C Min   │ 10.24°C Min     ║
║      │           │       │           │        │           │ 68% Humidity       │ 77% Humidity  │ 78% Humidity │ 81% Humidity  │ 39% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 10/4 │ 496535    │ 22333 │ 28790     │ 445412 │ 33755     │ 14.62°C Max        │ 14.19°C Max   │ 8.81°C Max   │ 33.68°C Max   │ 22.26°C Max     ║
║      │           │       │           │        │           │ 10.41°C Min        │ 3.49°C Min    │ 0.44°C Min   │ 18.68°C Min   │ 10.24°C Min     ║
║      │           │       │           │        │           │ 78% Humidity       │ 73% Humidity  │ 54% Humidity │ 79% Humidity  │ 42% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 11/4 │ 526396    │ 24342 │ 31270     │ 470784 │ 29861     │ 19.00°C Max        │ 9.62°C Max    │ 9.48°C Max   │ 24.31°C Max   │ 24.60°C Max     ║
║      │           │       │           │        │           │ 10.08°C Min        │ 2.89°C Min    │ 4.63°C Min   │ 15.28°C Min   │ 12.69°C Min     ║
║      │           │       │           │        │           │ 68% Humidity       │ 58% Humidity  │ 57% Humidity │ 71% Humidity  │ 35% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 12/4 │ 555313    │ 26086 │ 32988     │ 496239 │ 28917     │ 22.26°C Max        │ 12.38°C Max   │ 17.78°C Max  │ 25.02°C Max   │ 21.97°C Max     ║
║      │           │       │           │        │           │ 13.34°C Min        │ 4.58°C Min    │ 8.65°C Min   │ 21.89°C Min   │ 10.38°C Min     ║
║      │           │       │           │        │           │ 69% Humidity       │ 46% Humidity  │ 51% Humidity │ 80% Humidity  │ 48% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 13/4 │ 580619    │ 27870 │ 43482     │ 509267 │ 25306     │ 16.46°C Max        │ 15.53°C Max   │ 18.41°C Max  │ 31.84°C Max   │ 24.96°C Max     ║
║      │           │       │           │        │           │ 12.59°C Min        │ 11.23°C Min   │ 1.54°C Min   │ 10.12°C Min   │ 13.13°C Min     ║
║      │           │       │           │        │           │ 82% Humidity       │ 61% Humidity  │ 74% Humidity │ 69% Humidity  │ 52% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 14/4 │ 607670    │ 30262 │ 47763     │ 529645 │ 27051     │ 18.67°C Max        │ 17.69°C Max   │ 6.66°C Max   │ 20.73°C Max   │ 25.53°C Max     ║
║      │           │       │           │        │           │ 10.48°C Min        │ 7.47°C Min    │ -1.92°C Min  │ 8.77°C Min    │ 12.64°C Min     ║
║      │           │       │           │        │           │ 76% Humidity       │ 87% Humidity  │ 63% Humidity │ 60% Humidity  │ 46% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 15/4 │ 636350    │ 32734 │ 52096     │ 551520 │ 28680     │ 25.90°C Max        │ 13.84°C Max   │ 4.53°C Max   │ 20.87°C Max   │ 27.52°C Max     ║
║      │           │       │           │        │           │ 13.31°C Min        │ 5.07°C Min    │ -2.45°C Min  │ 8.49°C Min    │ 11.61°C Min     ║
║      │           │       │           │        │           │ 63% Humidity       │ 54% Humidity  │ 56% Humidity │ 63% Humidity  │ 27% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 16/4 │ 667592    │ 34827 │ 54703     │ 578062 │ 31242     │ 28.84°C Max        │ 11.27°C Max   │ 3.84°C Max   │ 22.32°C Max   │ 28.67°C Max     ║
║      │           │       │           │        │           │ 12.36°C Min        │ 4.97°C Min    │ -2.37°C Min  │ 9.86°C Min    │ 11.68°C Min     ║
║      │           │       │           │        │           │ 35% Humidity       │ 50% Humidity  │ 63% Humidity │ 56% Humidity  │ 13% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 17/4 │ 699706    │ 37411 │ 58545     │ 603750 │ 32114     │ 24.67°C Max        │ 9.57°C Max    │ 7.58°C Max   │ 24.21°C Max   │ 29.63°C Max     ║
║      │           │       │           │        │           │ 13.26°C Min        │ 1.43°C Min    │ 0.01°C Min   │ 16.49°C Min   │ 12.99°C Min     ║
║      │           │       │           │        │           │ 60% Humidity       │ 47% Humidity  │ 46% Humidity │ 62% Humidity  │ 14% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 18/4 │ 732197    │ 39753 │ 64840     │ 627604 │ 32491     │ 19.83°C Max        │ 10.61°C Max   │ 4.43°C Max   │ 27.63°C Max   │ 30.07°C Max     ║
║      │           │       │           │        │           │ 14.34°C Min        │ 5.80°C Min    │ 0.07°C Min   │ 15.36°C Min   │ 12.76°C Min     ║
║      │           │       │           │        │           │ 69% Humidity       │ 55% Humidity  │ 82% Humidity │ 82% Humidity  │ 17% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 19/4 │ 758809    │ 40945 │ 70337     │ 647527 │ 26612     │ 19.26°C Max        │ 8.99°C Max    │ 13.84°C Max  │ 23.24°C Max   │ 26.21°C Max     ║
║      │           │       │           │        │           │ 12.74°C Min        │ 2.67°C Min    │ 6.59°C Min   │ 19.98°C Min   │ 12.69°C Min     ║
║      │           │       │           │        │           │ 66% Humidity       │ 81% Humidity  │ 63% Humidity │ 86% Humidity  │ 32% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 20/4 │ 784326    │ 42659 │ 72329     │ 669338 │ 25517     │ 20.43°C Max        │ 15.94°C Max   │ 15.36°C Max  │ 28.02°C Max   │ 27.94°C Max     ║
║      │           │       │           │        │           │ 12.73°C Min        │ 9.62°C Min    │ 1.34°C Min   │ 17.25°C Min   │ 15.26°C Min     ║
║      │           │       │           │        │           │ 67% Humidity       │ 55% Humidity  │ 59% Humidity │ 91% Humidity  │ 33% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 21/4 │ 811865    │ 45086 │ 75204     │ 691575 │ 27539     │ 20.69°C Max        │ 13.07°C Max   │ 17.49°C Max  │ 28.97°C Max   │ 30.20°C Max     ║
║      │           │       │           │        │           │ 12.68°C Min        │ 6.58°C Min    │ 2.08°C Min   │ 18.98°C Min   │ 15.26°C Min     ║
║      │           │       │           │        │           │ 70% Humidity       │ 56% Humidity  │ 56% Humidity │ 79% Humidity  │ 24% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 22/4 │ 840351    │ 47412 │ 77366     │ 715573 │ 28486     │ 24.01°C Max        │ 14.08°C Max   │ 10.62°C Max  │ 30.32°C Max   │ 28.06°C Max     ║
║      │           │       │           │        │           │ 12.98°C Min        │ 1.66°C Min    │ 3.09°C Min   │ 21.20°C Min   │ 14.04°C Min     ║
║      │           │       │           │        │           │ 63% Humidity       │ 71% Humidity  │ 41% Humidity │ 74% Humidity  │ 33% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 23/4 │ 869170    │ 49724 │ 80203     │ 739243 │ 28819     │ 29.97°C Max        │ 10.77°C Max   │ 16.23°C Max  │ 28.49°C Max   │ 33.59°C Max     ║
║      │           │       │           │        │           │ 18.23°C Min        │ 3.74°C Min    │ 6.86°C Min   │ 23.77°C Min   │ 17.15°C Min     ║
║      │           │       │           │        │           │ 51% Humidity       │ 41% Humidity  │ 55% Humidity │ 87% Humidity  │ 28% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 24/4 │ 905358    │ 51493 │ 99079     │ 754786 │ 36188     │ 32.23°C Max        │ 10.69°C Max   │ 13.37°C Max  │ 30.69°C Max   │ 36.27°C Max     ║
║      │           │       │           │        │           │ 18.56°C Min        │ 6.13°C Min    │ 4.79°C Min   │ 15.79°C Min   │ 18.43°C Min     ║
║      │           │       │           │        │           │ 43% Humidity       │ 46% Humidity  │ 79% Humidity │ 60% Humidity  │ 15% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 25/4 │ 938154    │ 53755 │ 100372    │ 784027 │ 32796     │ 36.63°C Max        │ 9.99°C Max    │ 8.28°C Max   │ 32.88°C Max   │ 36.84°C Max     ║
║      │           │       │           │        │           │ 18.55°C Min        │ 5.12°C Min    │ 4.97°C Min   │ 18.43°C Min   │ 19.39°C Min     ║
║      │           │       │           │        │           │ 41% Humidity       │ 88% Humidity  │ 81% Humidity │ 63% Humidity  │ 14% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 26/4 │ 965785    │ 54881 │ 106988    │ 803916 │ 27631     │ 33.77°C Max        │ 16.27°C Max   │ 7.34°C Max   │ 26.83°C Max   │ 37.44°C Max     ║
║      │           │       │           │        │           │ 16.93°C Min        │ 8.23°C Min    │ 5.28°C Min   │ 14.26°C Min   │ 19.74°C Min     ║
║      │           │       │           │        │           │ 47% Humidity       │ 68% Humidity  │ 83% Humidity │ 61% Humidity  │ 11% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 27/4 │ 988197    │ 56259 │ 111424    │ 820514 │ 22412     │ 30.88°C Max        │ 9.74°C Max    │ 15.57°C Max  │ 29.82°C Max   │ 38.45°C Max     ║
║      │           │       │           │        │           │ 16.64°C Min        │ 4.33°C Min    │ 4.08°C Min   │ 15.29°C Min   │ 20.45°C Min     ║
║      │           │       │           │        │           │ 54% Humidity       │ 82% Humidity  │ 54% Humidity │ 53% Humidity  │ 13% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 28/4 │ 1012582   │ 58355 │ 115936    │ 838291 │ 24385     │ 27.47°C Max        │ 10.78°C Max   │ 19.63°C Max  │ 29.18°C Max   │ 37.84°C Max     ║
║      │           │       │           │        │           │ 15.26°C Min        │ 4.52°C Min    │ 10.04°C Min  │ 22.09°C Min   │ 19.89°C Min     ║
║      │           │       │           │        │           │ 63% Humidity       │ 78% Humidity  │ 60% Humidity │ 67% Humidity  │ 11% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 29/4 │ 1039909   │ 60967 │ 120720    │ 858222 │ 27327     │ 28.57°C Max        │ 17.63°C Max   │ 22.70°C Max  │ 28.61°C Max   │ 38.07°C Max     ║
║      │           │       │           │        │           │ 14.62°C Min        │ 7.29°C Min    │ 11.46°C Min  │ 16.72°C Min   │ 20.39°C Min     ║
║      │           │       │           │        │           │ 68% Humidity       │ 62% Humidity  │ 78% Humidity │ 87% Humidity  │ 11% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 30/4 │ 1069424   │ 62996 │ 153947    │ 852481 │ 29515     │ 26.55°C Max        │ 12.76°C Max   │ 12.53°C Max  │ 28.04°C Max   │ 39.52°C Max     ║
║      │           │       │           │        │           │ 15.78°C Min        │ 9.75°C Min    │ 5.04°C Min   │ 13.13°C Min   │ 21.96°C Min     ║
║      │           │       │           │        │           │ 80% Humidity       │ 79% Humidity  │ 93% Humidity │ 68% Humidity  │ 13% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 1/5  │ 1103461   │ 64943 │ 164015    │ 874503 │ 34037     │ 26.42°C Max        │ 15.06°C Max   │ 11.02°C Max  │ 28.30°C Max   │ 38.62°C Max     ║
║      │           │       │           │        │           │ 14.39°C Min        │ 10.74°C Min   │ 2.50°C Min   │ 14.09°C Min   │ 19.85°C Min     ║
║      │           │       │           │        │           │ 77% Humidity       │ 87% Humidity  │ 80% Humidity │ 52% Humidity  │ 12% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 2/5  │ 1132539   │ 66369 │ 175382    │ 890788 │ 29078     │ 26.02°C Max        │ 16.84°C Max   │ 18.76°C Max  │ 30.06°C Max   │ 38.40°C Max     ║
║      │           │       │           │        │           │ 15.20°C Min        │ 9.54°C Min    │ 11.93°C Min  │ 18.56°C Min   │ 20.02°C Min     ║
║      │           │       │           │        │           │ 70% Humidity       │ 87% Humidity  │ 57% Humidity │ 62% Humidity  │ 9% Humidity     ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 3/5  │ 1158040   │ 67682 │ 180152    │ 910206 │ 25501     │ 26.44°C Max        │ 21.17°C Max   │ 25.14°C Max  │ 31.38°C Max   │ 36.09°C Max     ║
║      │           │       │           │        │           │ 13.47°C Min        │ 11.61°C Min   │ 12.42°C Min  │ 20.66°C Min   │ 17.64°C Min     ║
║      │           │       │           │        │           │ 64% Humidity       │ 52% Humidity  │ 55% Humidity │ 70% Humidity  │ 15% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 4/5  │ 1180375   │ 68922 │ 187180    │ 924273 │ 22335     │ 26.19°C Max        │ 24.14°C Max   │ 22.92°C Max  │ 32.26°C Max   │ 36.05°C Max     ║
║      │           │       │           │        │           │ 13.99°C Min        │ 14.87°C Min   │ 4.48°C Min   │ 20.63°C Min   │ 17.29°C Min     ║
║      │           │       │           │        │           │ 68% Humidity       │ 63% Humidity  │ 43% Humidity │ 69% Humidity  │ 15% Humidity    ║
╟──────┼───────────┼───────┼───────────┼────────┼───────────┼────────────────────┼───────────────┼──────────────┼───────────────┼─────────────────╢
║ 5/5  │ 1203892   │ 71043 │ 189791    │ 943496 │ 23517     │ 28.68°C Max        │ 20.30°C Max   │ 8.11°C Max   │ 33.12°C Max   │ 36.56°C Max     ║
║      │           │       │           │        │           │ 16.14°C Min        │ 7.47°C Min    │ 5.09°C Min   │ 23.28°C Min   │ 20.16°C Min     ║
║      │           │       │           │        │           │ 60% Humidity       │ 54% Humidity  │ 69% Humidity │ 73% Humidity  │ 12% Humidity    ║
╚══════╧═══════════╧═══════╧═══════════╧════════╧═══════════╧════════════════════╧═══════════════╧══════════════╧═══════════════╧═════════════════╝

```
