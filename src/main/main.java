package main;

import domain.*;

public class main {
    public static void main(String[] args) {
        Cidade c1 = new Cidade();
        c1.definirNome("Florianópolis");
        c1.definirUf("SC");
        Cidade c2 = new Cidade();
        c2.definirNome("Palhoça");
        c2.definirUf("SC");

        print1(c1);

        Aluno a1 = new Aluno();
        a1.definirMatricula(919242);
        a1.setNome("Germano");
        a1.setCpf("321.938.9183-01");
        a1.setEmail("germanodc@email.com");
        a1.setCidade(c1);
        print2(a1);

    }

    public static void print1(Cidade cidade){
        System.out.println("Dados da cidade");
        System.out.println("Nome: " + cidade.obternome());
        System.out.println("UF: " + cidade.obteruf());
    }
    public static void print2(Aluno aluno){
        System.out.println("Dados do aluno: ");
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Cidade: " + aluno.getCidade().obternome()+ " - " + aluno.getCidade().obteruf());
    }
}