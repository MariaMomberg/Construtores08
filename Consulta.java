package Aula8Construtores;

public class Consulta {
    private String data;
    private String nomePcente;
    private String nomeDents;

    public Consulta(String data, String nomePcente, String nomeDents) {
        this.data = data;
        this.nomePcente = nomePcente;
        this.nomeDents = nomeDents;
    }
    public Consulta(String nomePcente, String nomeDents) {
        this.nomePcente = nomePcente;
        this.nomeDents = nomeDents;
    }
    public Consulta(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public String getNomePcente() {
        return nomePcente;
    }
    public String getNomeDents() {
        return nomeDents;
    }
}



