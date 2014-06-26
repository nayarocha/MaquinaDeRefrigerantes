package maquina.model;

public class MaquinaRefrigerante {
	private Refrigerante[] refrigerantes = new Refrigerante[102];
	private double saldo = 10;
	double preco = 0;
	private int quantcoca = 0;
	private int quantguarana = 0;
	private int quantsukita = 0;
	private int quantsprite = 0; 
	private int quantschweppes = 0;
	private int quantTotal = 0;
	
	//metodo que gera refrigerantes na maquina
	public void estoqueRefrigerante(Refrigerante r1, Refrigerante r2 , Refrigerante r3, Refrigerante r4 , Refrigerante r5){
		
		//add coca-cola
		for (int i=0; i<=19; i++){
			refrigerantes[i] = r1;
			quantcoca += 1;
		}
		
		// add guarana
		for(int i=20; i <=39; i++){
			refrigerantes[i] = r2;	
			 quantguarana +=1;
		}
		
		//add sukita
		for(int i=40; i <= 59; i++){
			refrigerantes[i] = r3;
			quantsukita +=1;
		}
	
		//add sprite	
		for(int i = 62 ; i <=81 ; i++){
			refrigerantes[i] = r4;	
			quantsprite +=1;
		}
		
		// add schweppes
		for (int i = 82; i <=101 ; i++){
			refrigerantes[i] = r5;
			quantschweppes +=1;
		}
	}
	
	public Refrigerante[] verEstoque(){	
		return this.refrigerantes;
	}
	
	
	public int quantidadeRefriDisponivel(){
		quantTotal = quantcoca + quantguarana + quantschweppes + quantsprite + quantsukita;
		return quantTotal;
	}
	
	public String disponibilidadeRefri(){
		System.out.println("COCA-COLA:" +quantcoca);
		System.out.println("GUARANA:" +quantguarana);
		System.out.println("SUKITA:" +quantsukita);
		System.out.println("SPRITE:" +quantsprite);
		System.out.println("SCHWEPPES:" +quantschweppes);
		return null;	
	}
	
	public boolean temEsseRefri(Refrigerante nome) {
		for (int i = 0; i < refrigerantes.length; i++) {
			if (refrigerantes[i]!= null && nome.getNomeRefrigerante() == refrigerantes[i].getNomeRefrigerante()){
				return true;
			}
		}
		
		return false;
	}

	public void aumentaSaldo(Compra compra) {
		this.saldo += compra.getCredito();
	}
	
	public double diminuiSaldo(double troco) {
		this.saldo -= troco;
		return saldo;
	}
	
	public String compraRefrigerante(String refrigerante){
		 //remove refrigerantes do estoque - comprando refrigerantes
			for(int i=0; i < refrigerantes.length; i++){
				if (refrigerantes[i]!= null && refrigerante == refrigerantes[i].getNomeRefrigerante()){
					this.quantTotal--;
					this.decrementaQuantidadeParcial(refrigerante);
					System.out.println("voce retirou seu refrigerante :" );
					refrigerantes[i] = null;
					break;
				}				
			}
			return refrigerante;
	}

	//atualiza uantidade de refrigerantes quando ocorre uma nova compra
	private void decrementaQuantidadeParcial(String refrigerante) {	
		if (refrigerante.equals("coca-cola")) {
			this.quantcoca --;
		}
		if (refrigerante.equals("guarana")) {
			this.quantguarana --;
		}
		if (refrigerante.equals("sukita")) {
			this.quantsukita --;
		}
		if (refrigerante.equals("sprite")) {
			this.quantsprite --;
		}
		if (refrigerante.equals("schweppes")) {
			this.quantschweppes --;
		}
	}
				
}


