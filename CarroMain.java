package Aula8Construtores;

public class CarroMain {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Camaro",125);
		Carro carro2 = new Carro("Ferrari", 865);
		Carro carro3 = new Carro("Civic",  179);
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro2.getNumChase());
		System.out.println(carro3.getPlaca() + carro3.getNumChase());
	}
	}

