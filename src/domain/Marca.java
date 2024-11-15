package domain;

public class Marca {
    private int id;
    private String nome;

    public Marca() {

    }

    public Marca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
