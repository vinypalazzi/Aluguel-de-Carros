package main;

public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", "R8", 2020);
        Carro carro2 = new Carro("Ferrari", "La Ferrari", 2024);

        Cliente cliente1 = new Cliente("Vinícius");
        Cliente cliente2 = new Cliente("Kauan");

        //Testando erros:

        //Alugando carro
        cliente1.alugarCarro(carro1);
        cliente2.alugarCarro(carro2);

        //Tentando alugar o proprio carro:
        cliente2.alugarCarro(carro2);

        //Tentando alugar outro carro sem ter devolvido:
        cliente1.alugarCarro(carro2);

        cliente1.devolverCarro();

        //Tentando alugar um carro já alugado:
        cliente1.alugarCarro(carro2);

        //Tentando devolver carro sem carro:
        cliente1.devolverCarro();



        //Vendo informações:
        System.out.println(cliente1.infoCliente());
        System.out.println(cliente2.infoCliente());

        System.out.println(carro1.exibirDetalhes());
        System.out.println(carro2.exibirDetalhes());
    }
}