package apicalls.apicallerbase;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import customutils.HTTPStatusCodeException;

public class RESTAPICaller {
	
	protected String JSONResponse;
		
	protected RESTAPICaller getJSONResponse(String urlString)
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
			
			//This covers most cases where a response
			//is not sent at all
			if(response.statusCode() != 200)
				throw new HTTPStatusCodeException
					("Response received with status code - "+response.statusCode());
			
			responseString = response.body();
			
			//The 403 Forbidden case in some APIs returns
			//a JSON object with a field stating 403, so
			//it must be handled separately
			if(responseString.equals("{\"code\":403,\"error\":\"permission denied\"}"))
			{
				responseString = "";
				throw new HTTPStatusCodeException
					("Response received with status code - 403 Forbidden. Try another API Key.");
			}
		}
		catch(HTTPStatusCodeException | IOException | InterruptedException e)
		{
			System.err.println(e);
		}
		finally
		{		
			JSONResponse = responseString;
		}		
		
		return this;
		
	}
	
}
