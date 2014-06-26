package maquina.model;

public class Compra {
	private double credito;
	private double troco;
	
	
	public double getCredito() {
		return credito;
	}

	public double getTroco() {
		return troco;
	}

	public void setCredito(double credito) {
		
		this.credito = credito;
	}
	
	public void somaCredito(double soma) {
		this.credito += soma;
		
	}
	
	public double getSomaCredito(){
		return credito;
	}
	
	public void mostrarCredito(){
		System.out.println("TOTAL INSERIDO: "+this.getCredito());		
	}
	
	public void setTroco(Refrigerante refri) {
		this.troco =  this.credito - refri.getPrecoRefrigerante();
	}

}


