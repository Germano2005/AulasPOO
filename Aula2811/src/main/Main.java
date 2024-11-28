package main;

import domain.Fornecedor;
import domain.Internacional;
import domain.Nacional;

public class Main {
    public static void main(String[] args) {
        Nacional nacional = new Nacional();
        nacional.setId(1);
        nacional.setNome("abc");
        nacional.setEmail("abc@email.com");
        nacional.setFone("13421425");
        nacional.setCnpj("53553533553");


        Internacional internacional = new Internacional();
        internacional.setId(1);
        internacional.setNome("xyz");
        internacional.setEmail("xyz@email.com");
        internacional.setFone("737374");
        internacional.setPais("Alemanha");
        internacional.setNif("74746464");

        print1(nacional);
        print2(internacional);
    }

    public static void print1(Nacional nacional){
        System.out.println("##########################################");
        System.out.println("Nacional");
        System.out.println("CNPJ: " + nacional.getCnpj());
        System.out.println("nome: " + nacional.getNome());
        System.out.println("email: " + nacional.getEmail());
        System.out.println("fone: " + nacional.getFone());
    }

    public static void print2(Internacional internacional){
        System.out.println("##########################################");
        System.out.println("Internacional");
        System.out.println("pais: " + internacional.getPais());
        System.out.println("nif: " + internacional.getNif());
        System.out.println("nome: " + internacional.getNome());
        System.out.println("email: " + internacional.getEmail());
        System.out.println("fone: " + internacional.getFone());
    }
}
