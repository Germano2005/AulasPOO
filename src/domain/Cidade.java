package domain;

public class Cidade {
    private String nome;
    private String uf;

    public void definirNome(String nome){
        this.nome = nome;
    }

    public void definirUf(String uf){
        this.uf = uf;
    }

    public String obternome()
    {
        return nome;
    }

    public String obteruf()
    {
        return uf;
    }


}
