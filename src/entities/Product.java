package entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void entradaEstoque(int quantos) {
        if (quantos > 0) {
            quantidade += quantos;
        }
    }

    public void saidaEstoque(int quantos) {
        if (quantos > 0 && quantos <= quantidade) {
            quantidade -= quantos;
        }
        else {
            System.out.println("Näo a estoque disponível!");
        }
    }

    public double soma() {
        return preco * quantidade;
    }

    public String toString() {
        return "Product data: " +
                nome +
                ", " +
                String.format("R$ %.2f",preco) +
                ", " +
                quantidade +
                ", " +
                "Total: " +
                String.format("$%.2f", soma());
    }

}
