public class Posicao {

    private Ativo ativo;
    private int quantidade;

    public Posicao(Ativo ativo, int quantidade) {
        this.ativo = ativo;
        this.quantidade = quantidade;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularValor() {
        return ativo.getPrecoAtual() * quantidade;
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade vendida deve ser maior que zero.");
        } else if (quantidade > this.quantidade) {
            System.out.println("Venda não realizada. Quantidade insuficiente.");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Venda realizada com sucesso.");
        }
    }
}