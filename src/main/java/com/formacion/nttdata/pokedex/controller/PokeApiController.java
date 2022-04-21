package com.formacion.nttdata.pokedex.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.formacion.nttdata.pokedex.dto.PokemonDto;

@RestController
@RequestMapping("/PokeApiController")
public class PokeApiController {
	private static final String URL_API = "https://pokeapi.co/api/v2/pokemon";

	@GetMapping(value = "/getPokemonInfo")
	public PokemonDto getPokemonInfo() {
		PokemonDto pokemonDto = new PokemonDto();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> json = restTemplate.getForEntity(URL_API + "/pikachu", String.class);
		JSONParser parse = new JSONParser();
		JSONObject obj = new JSONObject();
		try {
			obj = (JSONObject) parse.parse(json.getBody().toString());
			JSONArray arr = (JSONArray) obj.get("forms");
			JSONObject j = (JSONObject) arr.get(0);
			pokemonDto.setNombre(j.get("name").toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return pokemonDto;
	}

}