package EncapsulamentoBanco;

import java.util.Scanner;

public class ObjetoContaBancaria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria(100000.00);

		System.out.println("Informe o valor para depositar: ");
		conta.depositar(ler.nextDouble());

		System.out.println("Insira outro valro para depositar");
		conta.depositar(ler.nextDouble());

		System.out.println("Insira o valor para sacar: ");
		conta.sacar(ler.nextDouble());

		System.out.println("Saldo final: R$ " + conta.getSaldo());
		ler.close();
	}
}
