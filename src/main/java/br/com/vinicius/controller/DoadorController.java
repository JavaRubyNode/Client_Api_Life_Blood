package br.com.vinicius.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.vinicius.client.DoadorClient;
import br.com.vinicius.domain.Doador;
import br.com.vinicius.enums.RedeSocial;
import br.com.vinicius.enums.TipoSanguineo;

@Controller
@RequestMapping("/lifeblood")
public class DoadorController {
	
	private static final String Cadrastro_View ="CadastroDoador";
	private static final String Lista_View = "ListaDoador";
	
	// instanciado objeto client que comunica com a API Web Service
	
	private DoadorClient client =new DoadorClient("http://localhost:8080");
	
	
	
	//-------------Configurando Enum Rede Social na View para ComboBox----------------------------
	
	@ModelAttribute
	public List<RedeSocial> todasRedeSociais(){return Arrays.asList(RedeSocial.values());}
	
	//--------------------------------------------------------------------------------------------
	
	//-------------Configurando Enum Tipo Sanguineo na View para ComboBox--------------------------
	
	@ModelAttribute
	public List<TipoSanguineo> todosTipoSanguineo(){return Arrays.asList(TipoSanguineo.values());}
	
	//---------------------------------------------------------------------------------------------
	
	
	//--------------------------Carregar a tela de Cadastro---------------------------------------------------------------------
	
	@RequestMapping("/novo")
	public ModelAndView novoDoador(){ModelAndView mv = new ModelAndView(Cadrastro_View); mv.addObject(new Doador());return mv;}
	
	//-------------------------------------------------------------------------------------------------------------------------

	
	//----------------------------Metodo Salvar usando HTTP Post-----------------------------------
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(Doador doador){client.salvar(doador);}
	
	//---------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/listar")
	public List<Doador> listar (){return client.listar();}
}
