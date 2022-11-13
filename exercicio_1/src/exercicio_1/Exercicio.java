package exercicio_1;

public class Exercicio {

	public static void main(String[] args) {
		
		
		/* Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. 
		Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. 
		Sabendo que, em janeiro, foram gastos 15 mil reais, 
		em fevereiro, 23 mil reais e, em março, 17 mil reais, 
		faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.*/
		
		//variaveis
		int gastosjan = 15000; 
		int gastosfev = 23000;
		int gastosmar = 17000;
		int gastostrimestre = gastosjan+gastosfev+gastosmar; 
		
		//Print gastos totais 
		System.out.println("O gasto total do trimestre foi de " + gastostrimestre);
		
		int mediamensal=gastostrimestre/3;
		
		System.out.println("A média de gastos é de " + mediamensal);
		
		// Exercicio bem simples, dificuldade quase que nula
	}

}
