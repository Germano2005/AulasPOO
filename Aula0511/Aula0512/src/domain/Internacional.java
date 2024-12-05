package domain;

public class Internacional extends Fornecedor {
    private String pais;
    private String nif;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());//usar da superClasse o método getDados
        dados.append("NIF....").append(this.getNif()).append("\n");
        dados.append("PAÍS....").append(this.getPais()).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String msg){
        return null;
    }
}
