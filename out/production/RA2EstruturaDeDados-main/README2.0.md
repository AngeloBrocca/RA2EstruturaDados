Descrição do código:
Árvore Binária: O código da árvore binária se baseia diversos métodos que fazem a inserção, remoção e busca dos nós. O método inserir e inserirRecursivamente fazem a inserção do nó dentro na árvore, sendo a inserção recursiva a forma com que é inserida que seja verificado se o valor atual inserido não é nulo ou se é maior ou menor que o outro valor. Os métodos remover e removerRecursivamente fazem a remoção do nó da árvore, sendo remoção recursiva a forma com que seja removida o nó da árvore verificando se a posição do nó, não é nula e então realizando o processo que faz a busca pelo menor nó, que será no lado da direita para achar o valor atual e posicioná-lo de acordo, que busca e posiciona o nó para tomar o lugar do removido e assim em diante, para assim o posicionamento dos dados na árvore ser em ordem crescente.
Árvore AVL: O código da árvore binária se baseia em vários métodos, alguns similares a árvore binária como a inserção, remoção e busca, mas com destaque na adição de funções que realizam as rotações dentro das árvores ao inserir ou remover nós. Ao ser feita a inserção ou remoção de um novo nó, no caso da inserção, ou dos valores que permaneceram, no caso da remoção, é analisado se a esquerda, direita ou ambas são o valor com mais peso, sendo feita a rotação contrária a que for e a esquerda se ambas, sendo o lado rotacionado o valor atual, realizando o balanceamento da árvore no caso da remoção. Ao ser feita a inserção ou remoção de um nó, é atualizado a altura a árvore, sendo a inserção ou remoção de um lado a causa, alterando a altura da árvore. O balanceamento é feito com um método que obtém o balanceamento verificando se é nulo a diferença da direita e esquerda na mesma altura. Para ser feita a rotação para a esquerda ou para a direita, junto da atualização da altura que as acompanham, são feitos dois métodos similares para as rotações dos dois lados e um método para altura, que atualiza o valor da altura. Os métodos das rotações fazem a rotação dos valores da esquerda e direita e então chamam o método da altura para atualizar a posição dos lados na altura.

Resultados das árvores binária e AVL:

Testando com 100 elementos:
Árvore Binária (BST) - Inserção: 1 ms
Árvore Binária (BST) - Busca: 0 ms
Árvore Binária (BST) - Remoção: 0 ms
Árvore AVL - Inserção: 1 ms
Árvore AVL - Busca: 0 ms
Árvore AVL - Remoção: 0 ms

Testando com 500 elementos:
Árvore Binária (BST) - Inserção: 0 ms
Árvore Binária (BST) - Busca: 0 ms
Árvore Binária (BST) - Remoção: 0 ms
Árvore AVL - Inserção: 1 ms
Árvore AVL - Busca: 0 ms
Árvore AVL - Remoção: 0 ms

Testando com 1000 elementos:
Árvore Binária (BST) - Inserção: 0 ms
Árvore Binária (BST) - Busca: 0 ms
Árvore Binária (BST) - Remoção: 0 ms
Árvore AVL - Inserção: 0 ms
Árvore AVL - Busca: 1 ms
Árvore AVL - Remoção: 0 ms

Testando com 10000 elementos:
Árvore Binária (BST) - Inserção: 1 ms
Árvore Binária (BST) - Busca: 2 ms
Árvore Binária (BST) - Remoção: 2 ms
Árvore AVL - Inserção: 3 ms
Árvore AVL - Busca: 2 ms
Árvore AVL - Remoção: 5 ms

Testando com 20000 elementos:
Árvore Binária (BST) - Inserção: 3 ms
Árvore Binária (BST) - Busca: 4 ms
Árvore Binária (BST) - Remoção: 4 ms
Árvore AVL - Inserção: 3 ms
Árvore AVL - Busca: 4 ms
Árvore AVL - Remoção: 4 ms

Árvore binária (em segundos)
100 elementos- 0,0004 segundos totais
500 elementos - 0,0027 segundos totais
1000 elementos - 0,0156 segundos totais
10.000 elementos - 0,1618 segundos totais
20.000 elementos - 2,5117 segundos totais

Árvore AVL (em segundos)
100 elementos - 0,0005 segundos totais
500 elementos - 0,0032 segundos totais
1000 elementos - 0,0172 segundos totais
10000 elementos - 0,1826 segundos totais
20000 elementos - 2,6837 segundos totais

Análise e discussão dos resultados:
Observando os resultados e considerando para quais situação cada uma das duas árvores é mais efetiva, a árvore AVL é a melhor escolha, fornecendo desempenho mais consistente do que a árvore Binária, podendo realizar as operações de inserção, remoção e busca com frequência. É possível ver pouca diferença no começo, quando há poucos elementos, mas com o aumento gradual essa diferença vai aumentando, provando a diferença de desempenho entre as duas árvores. Apesar da árvore AVL se apresentar como a melhor escolha, a árvore Binária em casos que o desempenho é um fator mais crítico é possível e necessário ser feitos alterações e ajustes no equilíbrio da árvore, ela é aceitável de ser usada ao invés da árvore AVL.

