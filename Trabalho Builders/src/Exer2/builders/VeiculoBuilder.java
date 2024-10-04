package Exer2.builders;

import Exer2.entidades.Veiculo;

public class VeiculoBuilder {
    public String tipo;
    public String cor;
    public int quantiRoda;

    public VeiculoBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public VeiculoBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public VeiculoBuilder setQuantiRoda(int quantiRoda) {
        this.quantiRoda = quantiRoda;
        return this;
    }

    public Veiculo build() {
        return new Veiculo(this);
    }
}
