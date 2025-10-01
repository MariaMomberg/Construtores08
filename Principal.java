package Heranca;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Taylor Swift", "+1 9796373");
		System.out.println("Pessoa");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		PessoaFisica pessoafisica = new PessoaFisica("Ariana Grande", "+1 9865834", "123.456.789-00", "200.456.998-X");
		System.out.println("\nPessoa física: ");
		System.out.println("Nome: " + pessoafisica.getNome());
		System.out.println("Telefone: " + pessoafisica.getTelefone());
		System.out.println("CPF: " + pessoafisica.getCpf());
		System.out.println("RG: " + pessoafisica.getRg());

		PessoaJuridica pessoajuridica = new PessoaJuridica("Empresa Z", "(11) 9999-9999", "12.345.678/9001-23");
		System.out.println("\nPessoa jurídica:");
		System.out.println("Nome: " + pessoajuridica.getNome());
		System.out.println("Telefone: " + pessoajuridica.getTelefone());
		System.out.println("CNPJ: " + pessoajuridica.getCnpj());
	}
}