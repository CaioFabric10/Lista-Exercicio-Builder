package Exer1.builders;

import Exer1.entidades.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    public String massa;
    public String tamanho;
    public List<String> ingredientes = new ArrayList<>();


    public PizzaBuilder setMassa(String massa) {
        this.massa = massa;
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder addIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
        return this;
    }



    public Pizza build() {
        return new Pizza(this);
    }
}