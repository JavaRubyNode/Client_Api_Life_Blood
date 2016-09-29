package br.com.vinicius.enums;

public enum TipoSanguineo {

	
	A_Positivo("A+"),
	A_Negativo("A-"),
	B_Positivo("B+"),
	B_Negativo("B-"),
	AB_Positivo("AB+"),
	AB_Negativo("AB-"),
	O_Positivo("O+"),
	O_Negativo("O-");
	
    private String sangue;
	
	TipoSanguineo(String sangue) {
		this.sangue = sangue;
	}
	
	public String getSangue() {
		return sangue;
	}
}
