//Desenvolvido por: Gabriel Fakelmann
// Calculo: Custo final = (custo de fabrica + porcentagem do distribuidor + impostos)

import java.util.Scanner;

public class Custo_Final {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de custo de fábrica: ");
		double cust_fab = sc.nextDouble();

		double porcent_distribuidor = (cust_fab * 28 / 100);
		double impostos = (cust_fab * 45 / 100);

		double cust_final = (cust_fab + porcent_distribuidor + impostos);

		System.out.printf("O valor final deste veículo é: R$%.2f ", cust_final);

		sc.close();
	}

}
