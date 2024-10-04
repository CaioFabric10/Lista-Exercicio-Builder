package Exer2;

import Exer2.entidades.Veiculo;

public class Main {
    public static void main(String[] args) {
        comBuilder();
        semBuilder();
    }

    public static void comBuilder() {
        Veiculo moto = Veiculo.builder()
                .setTipo("Moto")
                .setCor("Vermelha")
                .setQuantiRoda(2)
                .build();

        Veiculo carro = Veiculo.builder()
                .setTipo("Carro")
                .setCor("Azul")
                .setQuantiRoda(4)
                .build();

        System.out.println(moto);
        System.out.println("======================");
        System.out.println(carro);
        System.out.println("======================");

    }

    public static void semBuilder() {
        Veiculo moto = new Veiculo(Veiculo.builder()
                .setTipo("Moto")
                .setCor("Preta")
                .setQuantiRoda(2));

        Veiculo carro = new Veiculo(Veiculo.builder()
                .setTipo("Carro")
                .setCor("Branco")
                .setQuantiRoda(4));

        System.out.println(moto);
        System.out.println("======================");
        System.out.println(carro);
        System.out.println("======================");

    }
}
