package Aula8Construtores;

public class ConsultaMain {
	public static void main(String[] args) {

		String hoje = new String();

		Consulta consulta1 = new Consulta(hoje);
		Consulta consulta2 = new Consulta("Maria", "Dr. Gustavo");
		Consulta consulta3 = new Consulta(hoje, "Murillo", "Dra. Nayara");

		System.out.println("Consulta 1 - Data: 01/10/2025 " + consulta1.getData());
		System.out.println("Consulta 2 - Paciente: " + consulta2.getNomePcente() + " | Dentista: " + consulta2.getNomeDents());
		System.out.println("Consulta 3 - Data: 01/10/2025 " + consulta3.getData() + " | Paciente: " + consulta3.getNomePcente()
				+ " | Dentista: " + consulta3.getNomeDents());
	}
}
