package br.com.vinicius.client;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.vinicius.domain.Doador;

public class DoadorClient {
	
	private RestTemplate restTemplate;
	private String URI_Base;
	private String URN_Base = "/doador";
	
	
	
	//------------------------------------ Construtor do Client-------------------------------
	public DoadorClient(String url) {
		restTemplate = new RestTemplate();
		URI_Base = url.concat(URN_Base);
	}
	//----------------------------------------------------------------------------------------
	
	
	//------------------------- Listar todos os Doadores Client-------------------------------
	public List<Doador> listar() {
		RequestEntity<Void> request = RequestEntity.get(URI.create(URI_Base)).build();
		ResponseEntity<Doador[]> response = restTemplate.exchange(request, Doador[].class);
		return Arrays.asList(response.getBody());
	}
	//----------------------------------------------------------------------------------------

	
	//----------------------------Salvar Doador na Web Services-------------------------------
	public String salvar(Doador doador) {
		RequestEntity<Doador> request = RequestEntity.post(URI.create(URI_Base)).body(doador);
		ResponseEntity<Void> response = restTemplate.exchange(request, Void.class);
		return response.getHeaders().getLocation().toString();
	}
	//-----------------------------------------------------------------------------------------
	

	
}
