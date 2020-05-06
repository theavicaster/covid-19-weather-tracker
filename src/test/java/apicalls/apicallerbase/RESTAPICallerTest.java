package apicalls.apicallerbase;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RESTAPICallerTest {

	@Test
	void testGetJSONResponse() {
		
		RESTAPICaller call = new RESTAPICaller();
		
		String pokemonUrlString = "https://pokeapi.co/api/v2/evolution-chain/1/";
		String bulbasaurResponse = "{\"baby_trigger_item\":null,\"chain\":{\"evolution_details\":[],\"evolves_to\":[{\"evolution_details\":[{\"gender\":null,\"held_item\":null,\"item\":null,\"known_move\":null,\"known_move_type\":null,\"location\":null,\"min_affection\":null,\"min_beauty\":null,\"min_happiness\":null,\"min_level\":16,\"needs_overworld_rain\":false,\"party_species\":null,\"party_type\":null,\"relative_physical_stats\":null,\"time_of_day\":\"\",\"trade_species\":null,\"trigger\":{\"name\":\"level-up\",\"url\":\"https://pokeapi.co/api/v2/evolution-trigger/1/\"},\"turn_upside_down\":false}],\"evolves_to\":[{\"evolution_details\":[{\"gender\":null,\"held_item\":null,\"item\":null,\"known_move\":null,\"known_move_type\":null,\"location\":null,\"min_affection\":null,\"min_beauty\":null,\"min_happiness\":null,\"min_level\":32,\"needs_overworld_rain\":false,\"party_species\":null,\"party_type\":null,\"relative_physical_stats\":null,\"time_of_day\":\"\",\"trade_species\":null,\"trigger\":{\"name\":\"level-up\",\"url\":\"https://pokeapi.co/api/v2/evolution-trigger/1/\"},\"turn_upside_down\":false}],\"evolves_to\":[],\"is_baby\":false,\"species\":{\"name\":\"venusaur\",\"url\":\"https://pokeapi.co/api/v2/pokemon-species/3/\"}}],\"is_baby\":false,\"species\":{\"name\":\"ivysaur\",\"url\":\"https://pokeapi.co/api/v2/pokemon-species/2/\"}}],\"is_baby\":false,\"species\":{\"name\":\"bulbasaur\",\"url\":\"https://pokeapi.co/api/v2/pokemon-species/1/\"}},\"id\":1}";
				
		assertEquals(bulbasaurResponse,call.getJSONResponse(pokemonUrlString).JSONResponse, "PokeAPI call should get correct response.");
		
	}
	
	@Test
	void testHTTPStatusCodeException403() {
		
		RESTAPICaller call = new RESTAPICaller();
		
		String status403String = "https://api.darksky.net/forecast/invalidAPIKey/22.5726,88.3639,1587297600?exclude=currently,hourly,flags?units=si";
						
		//Forbidden returns a JSON object with a status code
		//key with 403 value
		assertEquals("", call.getJSONResponse(status403String).JSONResponse, "40 should return empty string");
		
	}
	
	@Test
	void testHTTPStatusCodeException404() {
		
		RESTAPICaller call = new RESTAPICaller();
		
		String status404String = "https://pokeapi.co/api/v2/evolution-chain/1337/";
		//Not found returns status code of response 404
		
		//Since assertThrows requires an exception to be thrown, but we
		//catch our exception, so checking if response string is empty
		assertEquals("", call.getJSONResponse(status404String).JSONResponse, "404 should return empty string");
		
	}

}
