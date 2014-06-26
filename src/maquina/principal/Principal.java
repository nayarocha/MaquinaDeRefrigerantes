package maquina.principal;
import maquina.model.*;
import java.util.Scanner;

public class Principal {
	
	static MaquinaRefrigerante maquina = new MaquinaRefrigerante();
	static Compra compra = null;
	static Refrigerante refriEscolha = null;
	
		public static void main(String[] args) {
			gerandoEstoque(); 
			Scanner leia = new Scanner(System.in);
			int cont = -1;
			int opcao;
			
			do{
				Menu menu = new Menu();
				menu.retornaMenu();
				opcao = leia.nextInt();
				
				switch(opcao){
					case 1:		//****VER DISPONIBILIDADE DE REFRIGERANTES NA MÁQUINA
						System.out.println("Refrigerantes disponiveis:" +maquina.quantidadeRefriDisponivel());
						System.out.println(maquina.disponibilidadeRefri());
					break;
					
					case 2: //INSIRA O CRÉDITO
						compra = new Compra();
						int fim = -1;
						
						do{//****OPCOES DO MENU MOEDAS
							menu.menuMoedas();
							int caso = 0;
							double moeda;
							Scanner leCaso = new Scanner(System.in);
							caso = leCaso.nextInt();
							System.out.println("**Para confirmar digite 0**");
							switch(caso){
								case 1:
									moeda = 1;
									insereMoedas(moeda);
								break;
		
								case 10:
									moeda = 0.1;
									insereMoedas(moeda);
								break;
									
								case 25:
									moeda = 0.25;
									insereMoedas(moeda);
								break;
									
								case 50:
									moeda = 0.5;
									insereMoedas(moeda);
								break;
								
								case 0:
								fim = 0;	
							}
						}while(fim != 0); 
						
						break; 
						
					case 3:					
						int fim2 = -1;
						do{
						
								menu.menuRefrigerantes();
								int escolha;
								Scanner leEscolha = new Scanner(System.in);
								escolha = leEscolha.nextInt();
								System.out.println("**Para confirmar digite 0**");
								
								switch(escolha){
									case 1:
										refriEscolha = new Refrigerante("coca-cola");
										//como parametros são objetos o escopo ta valendo
										compraPossivel(maquina, compra, refriEscolha);
										break;
										
									case 2:
										refriEscolha = new Refrigerante("guarana");
										compraPossivel(maquina, compra, refriEscolha);
										break;
										
									case 3:
										refriEscolha = new Refrigerante("sukita");
										compraPossivel(maquina, compra, refriEscolha);
										break;
										
									case 4:	
										refriEscolha = new Refrigerante("sprite");
										compraPossivel(maquina, compra, refriEscolha);
										break;
										
									case 5:
										refriEscolha = new Refrigerante("schweppes");
										compraPossivel(maquina, compra, refriEscolha);
										break;
									
									case 0:  
										fim2 = 0;
									}
								
								}while(fim2!= 0); 
						break;		
							
					//****RETIRE O REFRIGERANTE	
					case 4:				
						System.out.println("FAVOR RECEBA O REFRIGERANTE:");//tira do estoque total e parcial
						System.out.println(maquina.compraRefrigerante(refriEscolha.getNomeRefrigerante()));
						break;
					
					//****RECEBER TROCO	
					case 5:				
						System.out.println("Recebendo troco:"+compra.getTroco());
						compra = null;		
						break;
					
					case 6:				//****SAIR
						System.out.println("Obrigado");
						break;
				}
				
			}while(cont != 0);
	}

	
		
	public static void compraPossivel(MaquinaRefrigerante maquina2, Compra compra2, Refrigerante refriEscolha2) {  
			if((compra.getCredito())>= refriEscolha.getPrecoRefrigerante()){		
				if (maquina.temEsseRefri(refriEscolha) == true) {			
					maquina.aumentaSaldo(compra);
					compra.setTroco(refriEscolha2);
					System.out.println("Seu troco é de "+ compra.getTroco());
				}else{
					System.out.println("Não temos "+refriEscolha.getNomeRefrigerante()+" em nossos estoques");
				}
			}else{
				System.out.println("Esse custa R$ "+ refriEscolha.getPrecoRefrigerante());
			}
	}

	
	//metodo que gera estoque de refrigerantes na máquina
	public static void gerandoEstoque(){
		Refrigerante coca = new Refrigerante("coca-cola");
		Refrigerante guarana = new Refrigerante("guarana" );	
		Refrigerante sukita = new Refrigerante("sukita");
		Refrigerante sprite = new Refrigerante("sprite");
		Refrigerante xwpes = new Refrigerante("schweppes");
		maquina.estoqueRefrigerante(coca, guarana, sukita, sprite, xwpes); 
	}
	
	//metodo para inserir moedas na máquina
	public static void insereMoedas(double moeda){
		compra.somaCredito(moeda);
		compra.mostrarCredito();	
	}
	
}
