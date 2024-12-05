package domain;

public abstract class Fornecedor implements IResumoDados {
    private int id;
    private String nome;
    private String email;
    private String fone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append("ID....").append(this.getId()).append("\n");
        dados.append("NOME....").append(this.getNome()).append("\n");
        dados.append("EMAIL....").append(this.getEmail()).append("\n");
        dados.append("FONE....").append(this.getFone()).append("\n");

        return dados.toString();
    }

    @Override
    public String getDados(String msg){
        StringBuilder dados = new StringBuilder();
        dados.append(getDados()).append("\n").append("Mensagem adicional").append(msg);

        return dados.toString();
    }
}
