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

        print(nacional);

        Internacional internacional = new Internacional();
        internacional.setId(2);
        internacional.setNome("xyz");
        internacional.setEmail("xyz@email.com");
        internacional.setFone("737374");
        internacional.setPais("Alemanha");
        internacional.setNif("74746464");


        print(internacional);
    }

    public static void print(Fornecedor fornecedor){
        System.out.println("Tipo de fornecedor - " + fornecedor.getClass().getSimpleName());
        System.out.println( fornecedor.getDados()); // aplicação da interface, ISSO É POLIMORFISMO
    }
}
