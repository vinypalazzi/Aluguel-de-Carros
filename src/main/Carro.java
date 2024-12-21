package main;

public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean disponivel = true;

    Carro(String marca, String modelo, int ano) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void alugar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("\nErro! Esse carro já foi alugado!\n");
        }
    }

    void devolver() {
        if (!disponivel) {
            this.disponivel = true;
        } else {
            System.out.println("\nErro! Esse carro já está conosco!\n");
        }
    }

    String exibirDetalhes() {
        return String.format("\nMarca: %s\nModelo: %s\nAno: %d\nDisponibilidade: %s", marca, modelo, ano, disponivel ?
                "Disponivel" : "Indisponivel");
    }
}