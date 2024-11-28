package MainApp;
import domain.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int pergunta, id = 0;

        ETipoCombustivel[] combustiveis = ETipoCombustivel.values();
        ECategoria[] categorias = ECategoria.values();

        //Classes
        Marca marca = new Marca();
        Modelo modelo =  new Modelo();
        Cor cor = new Cor();
        Veiculo veiculo = new Veiculo();

        //atribuições
        do {
            veiculo.setPlaca(JOptionPane.showInputDialog("Digite o número da placa"));// Placa
            cor.setNome(JOptionPane.showInputDialog("Digite a cor do veículo"));//Cor
            modelo.setDescricao(JOptionPane.showInputDialog("Digite a descricao do veículo"));//Descrição
            marca.setNome(JOptionPane.showInputDialog("Digite o nome da marca"));//Marca
            modelo.setMarca(marca);
            modelo.getMotor().setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Digite a potência do motor")));//Potência
            ETipoCombustivel selecionadoCO = (ETipoCombustivel) JOptionPane.showInputDialog(
                    null,
                    "Selecione um combustível",
                    "Combustivel",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    combustiveis,
                    combustiveis[0]);
            modelo.getMotor().setCombustivel(selecionadoCO);
            ECategoria selecionadoCA = (ECategoria) JOptionPane.showInputDialog(
                    null,
                    "Selecione uma categoria",
                    "Categoria",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    categorias,
                    categorias[0]);
            modelo.setCategoria(selecionadoCA);
            veiculo.setCor(cor);
            veiculo.setModelo(modelo);

            print(veiculo);
            pergunta = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais um veículo?");
            id++;
            veiculo.setId(id);
        }while (pergunta == 0);


    }

    public static void print(Veiculo veiculo){
        JOptionPane.showMessageDialog(null,
                "INFORMAÇÕES DO VEÍCULO:" + "\n" +
                "ID.................................. " + veiculo.getId() + "\n" +
                "PLACA.......................... " + veiculo.getPlaca() + "\n" +
                "COR............................. " + veiculo.getCor().getNome() + "\n" +
                "MODELO..................... " + veiculo.getModelo().getDescricao() + "\n" +
                "MARCA........................ " + veiculo.getModelo().getMarca().getNome() + "\n" +
                "POTÊNCIA.................. " + veiculo.getModelo().getMotor().getPotencia() + "\n" +
                "COMBUSTÍVEL.......... " + veiculo.getModelo().getMotor().getCombustivel() + "\n" +
                "CATEGORIA................. " + veiculo.getModelo().getCategoria().getMostra());
    }
}
