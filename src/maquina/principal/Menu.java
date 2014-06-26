package maquina.principal;

public class Menu {
	
	public void retornaMenu(){
		System.out.println("------------------------------------------");
		System.out.println("------  MÁQUINA DE REFRIGERANTES   -------");
		System.out.println("------------------------------------------");
		System.out.println("(1) - VER DISPONIBILIDADE DE REFRIGERANTES NA MÁQUINA:");
		System.out.println("(2) - INSIRA O CRÉDITO NA MÁQUINA");
		System.out.println("(3) - ESCOLHA O REFRIGERANTE");
		System.out.println("(4) - RETIRE O REFRIGERANTE");
		System.out.println("(5) - RECEBER TROCO");
		System.out.println("(6) - SAIR");
	}
	
	public void menuMoedas(){
		System.out.println("------------------------------------------");
		System.out.println("------  MÁQUINA DE REFRIGERANTES   -------");
		System.out.println("------------------------------------------");
		System.out.println("||INSIRA AS MOEDAS:||");
		System.out.println("(10) - R$ 0,10 | (25) - R$ 0,25 |  (50) - R$ 0,50 |  (1)  - R$ 1,00 ");
		System.out.println("                              ");
		System.out.println("||TABELA DE PREÇOS||");
	}
	
	public void menuRefrigerantes(){
		System.out.println("--------   Escolha o Refrigerante   ------\n");
		System.out.println("--------  1 - COCA-COLA: R$ 3,75  --------");
		System.out.println("--------  2 - GUARANÁ:   R$ 3,25  --------");
		System.out.println("--------  3 - SUKITA:    R$ 3,00  --------");
		System.out.println("--------  4 - SPRITE:    R$ 2,75  --------");
		System.out.println("--------  5 - SCHWEPPES: R$ 4,00  --------");
	}

}
