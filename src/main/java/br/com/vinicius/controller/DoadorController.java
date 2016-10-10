package br.com.vinicius.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.vinicius.enums.RedeSocial;
import br.com.vinicius.enums.TipoSanguineo;

@Controller
@RequestMapping("/lifeblood")
public class DoadorController {
	
	
	//-------------------------- Configurando Enum Rede Social na View ----------------------------
	
	@ModelAttribute
	public List<RedeSocial> todasRedeSociais(){return Arrays.asList(RedeSocial.values());}
	
	//--------------------------------------------------------------------------------------------
	
	//--------------------------Configurando Enum Tipo Sanguineo na View--------------------------
	
	@ModelAttribute
	public List<TipoSanguineo> todosTipoSanguineo(){return Arrays.asList(TipoSanguineo.values());}
	
	//---------------------------------------------------------------------------------------------

}
