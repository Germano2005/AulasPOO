package domain;

public class Modelo {
    private int id;
    private String descricao;
    private Marca marca;
    private Motor motor = new Motor();
    private ECategoria categoria;

    public Modelo() {

    }

    public Modelo(String descricao, Marca marca) {
        this.descricao = descricao;
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }
}
