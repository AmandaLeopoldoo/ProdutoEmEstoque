# Exercício Java: Gerenciamento de Estoque de Produto

Este é um exercício simples em Java para gerenciar o estoque de um produto. O programa demonstra o uso de classes, construtores e métodos para representar e manipular dados de um produto, incluindo a adição e remoção de itens no estoque.

## Funcionalidades

- Entrada de dados do produto (nome, preço e quantidade inicial em estoque) pelo terminal.
- Exibição das informações formatadas do produto.
- Adição de produtos ao estoque.
- Remoção de produtos do estoque.
- Exibição dos dados atualizados após cada operação.

## Exemplo de uso

```
Enter product data:
Name: Mouse
Price: 50.00
Quantity in stock: 10

Product data: Mouse, $50.00, 10 units, Total: $500.00

Enter the number of products to add in stock: 5
Updated data: Mouse, $50.00, 15 units, Total: $750.00

Enter the number of products to remove from stock: 3
Updated data: Mouse, $50.00, 12 units, Total: $600.00
```

## Como executar

1. **Clone ou baixe este repositório.**
2. Compile os arquivos Java:
    ```
    javac entities/Product.java Program.java
    ```
3. Execute o programa:
    ```
    java Program
    ```

## Estrutura

- `entities/Product.java` - Classe `Product`, contendo atributos e métodos para o gerenciamento do estoque.
- `Program.java` - Classe principal que faz a interação com o usuário e gerencia o fluxo do programa.

## Conceitos aplicados

- Classes e objetos em Java
- Construtores (incluindo sobrecarga)
- Encapsulamento
- Métodos para atualização do estado do objeto
- Entrada/saída com `Scanner`
- Formatação de strings

## Licença

Este projeto tem fins estritamente educacionais.
