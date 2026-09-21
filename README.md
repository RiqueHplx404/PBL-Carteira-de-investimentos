PROJETO - CARTEIRA DE INVESTIMENTOS

Integrante:
Riquelmy

---

## DESCRIÇÃO DO PROJETO

O projeto implementa um sistema simplificado para representar uma carteira de investimentos de um cliente.

A aplicação utiliza as classes Cliente, Ativo, Posicao e CarteiraInvestimentos, distribuindo as responsabilidades entre os objetos para evitar que a classe Main concentre as regras de negócio.

A classe Main é responsável apenas por criar os objetos, estabelecer os relacionamentos entre eles e iniciar a execução do programa.

---

## ARQUIVOS DO PROJETO

Cliente.java
Representa o cliente proprietário da carteira, armazenando seu nome e CPF.

Ativo.java
Representa um ativo de investimento, armazenando seu código, nome e preço atual.

Posicao.java
Representa a quantidade de determinado ativo pertencente à carteira. É responsável por calcular o valor da posição e controlar a operação de venda.

CarteiraInvestimentos.java
Representa a carteira do cliente, mantendo uma lista de posições. É responsável por adicionar posições, calcular o patrimônio total e exibir o resumo da carteira.

Main.java
Responsável por criar os objetos, estabelecer os relacionamentos e iniciar o fluxo da aplicação.

---

## CASOS DE TESTE

Caso 1 - Carteira com três posições

Foram utilizados os seguintes dados:

PETR4 - 100 unidades - R$ 32,50
ITUB4 - 50 unidades - R$ 38,00
VALE3 - 20 unidades - R$ 62,00

Resultado esperado:

PETR4: R$ 3.250,00
ITUB4: R$ 1.900,00
VALE3: R$ 1.240,00

Patrimônio total: R$ 6.390,00

Caso 2 - Carteira vazia

Foi criada uma carteira sem nenhuma posição.

Resultado esperado:

Patrimônio total: R$ 0,00

Caso 3 - Nova posição

Foi adicionada uma nova posição para testar o cálculo do patrimônio.

Exemplo:

Ativo: ABEV3
Quantidade: 10
Preço atual: R$ 15,00

Valor da nova posição:

10 × R$ 15,00 = R$ 150,00

Considerando a carteira original, o novo patrimônio esperado é:

R$ 6.390,00 + R$ 150,00 = R$ 6.540,00

O resultado apresentado pelo programa foi comparado com o cálculo manual.

---

## DECISÃO DE MODELAGEM

Uma decisão de modelagem importante foi distribuir os cálculos entre as classes responsáveis pelos dados utilizados.

A classe Posicao é responsável por calcular o valor de uma posição, utilizando o preço atual do Ativo e a quantidade.

A classe CarteiraInvestimentos é responsável por calcular o patrimônio total, somando o valor de cada Posicao.

Dessa forma, a classe Main não possui regras de negócio ou cálculos. Ela apenas cria os objetos, estabelece os relacionamentos e chama os métodos necessários.

Também foram utilizados atributos privados para garantir o encapsulamento. A alteração da quantidade de uma posição é realizada por meio do método vender(), que impede quantidades inválidas ou vendas superiores à quantidade disponível.
