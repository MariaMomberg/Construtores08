package Aula8Construtores;

public class Carro {
private String placa;
private int numChase;

public Carro(String placa, int numChase) {
	this.placa = placa;
	this.numChase = numChase;
}
public Carro(String placa) {
	this.placa = placa;
}
public Carro(int numChase) {
	this.numChase = numChase;
}
public String getPlaca() {
	return placa;

}
public int getNumChase() {
	return numChase;

}
}
