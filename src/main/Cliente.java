package main;

public class Cliente {
    String nome;
    Carro carroAlugado = null;

    Cliente(String nome) {
        this.nome = nome;
    }

    void alugarCarro(Carro carro) {
        if (carro.disponivel && carroAlugado == null) {
            carro.alugar();
            this.carroAlugado = carro;
        } else if (carro == carroAlugado) {
            System.out.println("\nErro! Esse já é seu carro");
        } else if (carroAlugado != null) {
            System.out.println("\nErro! Você já tem um carro alugado, devolva-o para alugar outro");
        } else {
            System.out.println("\nErro! Esse carro já foi alugado");
        }
    }

    void devolverCarro() {
        if (carroAlugado != null) {
            carroAlugado.devolver();
            this.carroAlugado = null;
        } else {
            System.out.println("\nErro! Você não tem carro para devolver\n");
        }
    }

    String infoCliente() {
        if (carroAlugado != null) {
            return String.format("\nNome: %s\nCarro: \nMarca: %s\nModelo: %s\nAno: %d", this.nome, carroAlugado.marca,
                    carroAlugado.modelo, carroAlugado.ano);
        } else {
            return String.format("\nNome: %s\nCarro: Nenhum", this.nome);
        }

    }
}