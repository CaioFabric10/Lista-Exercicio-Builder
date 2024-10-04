package Exer2.entidades;

import Exer2.builders.VeiculoBuilder;

public class Veiculo {
    public String tipo;
    public String cor;
    public int quantiRoda;

    public Veiculo(VeiculoBuilder builder) {
        this.tipo = builder.tipo;
        this.cor = builder.cor;
        this.quantiRoda = builder.quantiRoda;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de veículo: ").append(tipo).append("\n");
        sb.append("Cor: ").append(cor).append("\n");
        sb.append("Quantidade de rodas: ").append(quantiRoda).append("\n");
        return sb.toString();
    }

    public static VeiculoBuilder builder() {
        return new VeiculoBuilder();
    }
}
