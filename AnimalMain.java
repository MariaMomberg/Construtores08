package Aula8Construtores;

public class AnimalMain {

    public static void main(String[] args) {
       
        Animal animal1 = new Animal(1.9f);
        Animal animal2 = new Animal("Branco");
        Animal animal3 = new Animal(2.5f, "Cinza");

        System.out.println("Animal 1 - Tamanho: " + animal1.getTamanho());
        System.out.println("Animal 2 - Cor: " + animal2.getCor());
        System.out.println("Animal 3 - Tamanho: " + animal3.getTamanho() + " | Cor: " + animal3.getCor());
    }
}