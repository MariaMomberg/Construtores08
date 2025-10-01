package Heranca;

public class PrincipalVeiculo {
		public static void main(String[] args) {
			Veiculo veiculo = new Veiculo("Carro Chevrolet", "Onix", 2022, "prata");  
			System.out.println("Veículo");
			System.out.println("Marca: " + veiculo.getMarca());
			System.out.println("Modelo: " + veiculo.getModelo());
			System.out.println("Ano: " + veiculo.getAno());
			System.out.println("Cor: " + veiculo.getCor());

			Automovel automovel = new Automovel("Hyundai", "HB20 Comfort Plus", 2021, "branco", 4, "Motor 1.0 turbo");  
			System.out.println("\nAutomóvel: ");
			System.out.println("Marca: " + automovel.getMarca());
			System.out.println("Modelo: " + automovel.getModelo());
			System.out.println("Ano: " + automovel.getAno());
			System.out.println("Cor: " + automovel.getCor());
			System.out.println("Número de portas: " + automovel.getNumeroPortas());
			System.out.println("Motor: " + automovel.getMotor());

			Moto moto = new Moto("Honda", "XRE 300 Sahara", 2024, "Cinza", 293);
			System.out.println("\nMoto:");
			System.out.println("Marca: " + moto.getMarca());
			System.out.println("Modelo: " + moto.getModelo());
			System.out.println("Ano: " + moto.getAno());
			System.out.println("Cor: " + moto.getCor());
			System.out.println("Cilindrada: " + moto.getCilindrada() + " cm³");
		}
	}

