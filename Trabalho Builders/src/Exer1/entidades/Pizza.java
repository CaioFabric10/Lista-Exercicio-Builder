package Exer1.entidades;

import Exer1.builders.PizzaBuilder;

import java.util.List;

public class Pizza {
    public String massa;
    public String tamanho;
    public List<String> ingredientes;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.massa = pizzaBuilder.massa;
        this.tamanho = pizzaBuilder.tamanho;
        this.ingredientes = pizzaBuilder.ingredientes;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza\n");
        sb.append("Massa: ").append(massa).append("\n");
        sb.append("Tamanho: ").append(tamanho).append("\n");
        sb.append("Ingredientes: ").append(ingredientes).append("\n");
        return sb.toString();
    }




    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }
}