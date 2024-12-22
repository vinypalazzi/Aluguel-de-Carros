Aqui está um exemplo de README para o seu projeto de aluguel de carros:

---

# Sistema de Aluguel de Carros

Este é um sistema simples para gerenciamento de aluguel de carros, desenvolvido em Java com base nos conceitos de Programação Orientada a Objetos (POO).

## 📋 Descrição

O sistema permite gerenciar carros e clientes, possibilitando:
- Alugar e devolver carros.
- Verificar a disponibilidade de carros.
- Consultar informações detalhadas sobre os carros e os clientes.

Este projeto foi projetado para praticar os princípios de POO, como encapsulamento, responsabilidade única e interação entre objetos.

---

## 🚀 Funcionalidades

### Para **carros**:
- Exibir detalhes como marca, modelo, ano e disponibilidade.
- Alterar o status de disponibilidade (alugado ou disponível).

### Para **clientes**:
- Alugar carros disponíveis.
- Devolver carros alugados.
- Consultar informações sobre o carro alugado.

---

## 🛠️ Estrutura do Código

O projeto contém três classes principais:

1. **Carro**:  
   Representa os carros disponíveis para aluguel, com os seguintes atributos e métodos:
    - Atributos: `marca`, `modelo`, `ano`, `disponivel`.
    - Métodos:
        - `alugar()`: Marca o carro como indisponível.
        - `devolver()`: Marca o carro como disponível.
        - `exibirDetalhes()`: Exibe os detalhes do carro.

2. **Cliente**:  
   Representa os clientes que alugam os carros, com os seguintes atributos e métodos:
    - Atributos: `nome`, `carroAlugado`.
    - Métodos:
        - `alugarCarro(Carro carro)`: Permite ao cliente alugar um carro disponível.
        - `devolverCarro()`: Permite ao cliente devolver o carro alugado.
        - `infoCliente()`: Exibe informações do cliente e do carro alugado.

3. **Teste**:  
   Classe principal para executar testes no sistema e verificar os cenários, como:
    - Alugar carros.
    - Devolver carros.
    - Tentar realizar operações inválidas (ex.: alugar carros indisponíveis).

---

## 🔧 Pré-requisitos

- **Java JDK**: Certifique-se de que o Java Development Kit esteja instalado no seu sistema.
- **IDE ou Editor de Texto**: Como IntelliJ, Eclipse ou VS Code.

---

## ▶️ Como Executar

1. Clone o repositório ou copie o código para o seu editor.
2. Compile o projeto com o comando:
   ```bash  
   javac main/*.java  
   ```  
3. Execute o programa principal:
   ```bash  
   java main.Teste  
   ```  

---

## 🧪 Exemplos de Testes

Os testes no arquivo `Teste.java` cobrem os seguintes cenários:
1. Aluguel de um carro disponível.
2. Tentativa de alugar um carro já alugado.
3. Devolver um carro alugado.
4. Tentativa de devolver um carro sem possuir um.
5. Verificação dos detalhes dos clientes e carros após as operações.

---

## 🌟 O que você pode aprender?

- Aplicar conceitos fundamentais de POO.
- Criar e gerenciar relações entre classes.
- Implementar métodos para simular ações no sistema.
- Identificar e tratar erros comuns em lógica de negócios.

---

## 📚 Melhorias Futuras

- Implementar persistência de dados para armazenar informações entre execuções.
- Adicionar uma interface gráfica para facilitar o uso do sistema.
- Permitir múltiplos carros alugados por cliente.
- Gerenciar listas de clientes e carros dinamicamente.

---

## 🤝 Contribuições

Sugestões, relatórios de bugs e contribuições são bem-vindos!

---  

### 🛡️ Licença

Este projeto é para fins educacionais e está disponível sob a licença [MIT](https://opensource.org/licenses/MIT).

**Desenvolvido por Vinícius**  