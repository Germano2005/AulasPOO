package domain;

public class Cor {
    private int id;
    private String nome;

    public Cor() {

    }

    public Cor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
