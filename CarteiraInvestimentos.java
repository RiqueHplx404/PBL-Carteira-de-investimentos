import java.util.ArrayList;
import java.util.List;

public class CarteiraInvestimentos {

    private Cliente cliente;
    private List<Posicao> posicoes;

    public CarteiraInvestimentos(Cliente cliente) {
        this.cliente = cliente;
        this.posicoes = new ArrayList<>();
    }

    public void adicionarPosicao(Ativo ativo, int quantidade) {
        Posicao posicao = new Posicao(ativo, quantidade);
        posicoes.add(posicao);
    }

    public double calcularPatrimonio() {
        double patrimonio = 0;

        for (Posicao posicao : posicoes) {
            patrimonio += posicao.calcularValor();
        }

        return patrimonio;
    }

    public void exibirResumo() {
        System.out.println("CARTEIRA DE INVESTIMENTOS");
        System.out.println();

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println();

        for (Posicao posicao : posicoes) {
            System.out.println("Ativo: "
                    + posicao.getAtivo().getCodigo()
                    + " - "
                    + posicao.getAtivo().getNome());

            System.out.println("Quantidade: " + posicao.getQuantidade());

            System.out.printf("Preço atual: R$ %.2f%n",
                    posicao.getAtivo().getPrecoAtual());

            System.out.printf("Valor da posição: R$ %.2f%n",
                    posicao.calcularValor());

            System.out.println();
        }

        System.out.printf("Patrimônio total: R$ %.2f%n",
                calcularPatrimonio());
    }
}