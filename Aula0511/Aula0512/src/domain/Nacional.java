package domain;

public class Nacional extends Fornecedor{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());//usar da superClasse o método getDados
        dados.append("CNPJ....").append(this.getCnpj()).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String msg){

        return null;
    }

}
