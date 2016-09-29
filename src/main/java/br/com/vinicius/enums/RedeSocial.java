package br.com.vinicius.enums;


public enum RedeSocial {

	FaceBook("FACEBOOK"),
	WhastApp("WHASTAPP"),
	Google("GOOGLE"),
	Instragram("INSTRAGRAM"),
	Linkedin("LINKEDIN");
	
	
	private String redeSocial;
	
	RedeSocial(String redeSocial){
		this.redeSocial = redeSocial;
	}

	public String getRedeSocial() {
		return redeSocial;
	}

	
	
	
}
