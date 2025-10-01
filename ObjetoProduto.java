package EncapsulamentoVenda;

import java.util.Scanner;

public class ObjetoProduto {
	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = ler.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = ler.nextDouble();

        Produto produto = new Produto(nome, preco);

        System.out.println("/nInformações do produto:");
        produto.exibirInformacoes();

        ler.close();
    }
}

