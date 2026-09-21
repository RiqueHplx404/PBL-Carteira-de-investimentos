public class Main {

        public static void main(String[] args) {

                Cliente cliente = new Cliente(
                                "Ana Silva",
                                "123.456.789-00");

                Ativo petr4 = new Ativo(
                                "PETR4",
                                "Petrobras",
                                32.50);

                Ativo itub4 = new Ativo(
                                "ITUB4",
                                "Itaú Unibanco",
                                38.00);

                Ativo vale3 = new Ativo(
                                "VALE3",
                                "Vale",
                                62.00);

                CarteiraInvestimentos carteira = new CarteiraInvestimentos(cliente);

                carteira.adicionarPosicao(petr4, 100);
                carteira.adicionarPosicao(itub4, 50);
                carteira.adicionarPosicao(vale3, 20);

                carteira.exibirResumo();
        }
}