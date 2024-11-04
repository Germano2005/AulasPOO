package domain;

public class Aluno {
    private int matricula;
    private String nome;
    private String cpf;
    private String email;
    private Cidade cidade;

    public void definirMatricula(int matricula){
        if (matricula > 0 && matricula < 10000){
            this.matricula = matricula;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public Cidade getCidade() {
        return cidade;
    }
}

