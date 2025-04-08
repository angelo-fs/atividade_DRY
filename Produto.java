public class Produto {
    private final String nome;
    private final double preco;
    private final double percentualDesconto;

    public Produto(String nome, double preco, double percentualDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularPrecoFinal() {
        return preco - (preco * percentualDesconto);
    }

    public void imprimirPrecoFinal() {
        System.out.println(nome + " - Preço final: R$ " + calcularPrecoFinal());
    }
}