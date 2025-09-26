package Aula8Construtores;
import java.util.Date;

public class Consulta {
    private Date data;
    private String nomePcente;
    private String nomeDents;

    public Consulta(Date data, String nomePcente, String nomeDents) {
        this.data = data;
        this.nomePcente = nomePcente;
        this.nomeDents = nomeDents;
    }
    public Consulta(String nomePcente, String nomeDents) {
        this.nomePcente = nomePcente;
        this.nomeDents = nomeDents;
    }
    public Consulta(Date data) {
        this.data = data;
    }
    public Date getData() {
        return data;
    }
    public String getNomePcente() {
        return nomePcente;
    }
    public String getNomeDents() {
        return nomeDents;
    }
}

