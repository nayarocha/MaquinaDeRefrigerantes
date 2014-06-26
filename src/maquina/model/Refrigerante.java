package maquina.model;

public class Refrigerante {
	private String nomeRefrigerante;
	private double precoRefrigerante;
	
	public Refrigerante(String nome) {
		this.setNomeRefrigerante(nome);
		switch (nome) {
			case "coca-cola":
	            this.precoRefrigerante = 3.75;
	        break;
	        case "guarana":
	            this.precoRefrigerante = 3.25;
	        break;
	        case "sprite":
	            this.precoRefrigerante = 2.75;
	        break;
	        case "sukita":
	            this.precoRefrigerante = 3.00;
	        break;
	        case "schweppes":
	        	this.precoRefrigerante = 4.00;
	        break;     
		}
	}
	
	public String getNomeRefrigerante() {
		return nomeRefrigerante;
	}
	
	public void setNomeRefrigerante(String nomeRefrigerante) {
		this.nomeRefrigerante = nomeRefrigerante;
	}
	
	public double getPrecoRefrigerante() {
		return precoRefrigerante;
	}
	
}