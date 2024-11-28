package domain;

public enum ECategoria {
    PEQUENO("Pequeno"), MEDIO("Médio"), GRANDE("Grande"), MOTO("Moto"), PADRAO("Padrão");

    private String mostra;

    private ECategoria(String mostra){
        this.mostra = mostra;
    }

    public String getMostra(){
        return mostra;
    }

    @Override
    public String toString() {
        return mostra;
    }
}
