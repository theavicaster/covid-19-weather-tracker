package apicalls.apicallerbase;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RESTAPICaller {
	
	protected String JSONResponse;
		
	protected void getJSONResponse(String urlString)
	{
		
		String responseString = "";
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
							.uri(URI.create(urlString))
							.build();
		
		try
		{
			HttpResponse<String> response 
				= client.send(request, HttpResponse.BodyHandlers.ofString());
			
			if(response.statusCode() != 200)
				throw new HTTPStatusCodeException
					("Response received with status code - "+response.statusCode());
			
			responseString = response.body();
			
		}
		catch(HTTPStatusCodeException | IOException | InterruptedException e)
		{
			System.err.print(e);
		}
		finally
		{
			JSONResponse = responseString;
		}		
		
	}
	
}
