# RA2EstruturaDeDados

Análise e relatório das árvores e descrição do código:

Resultados:

Árvore binária
  100 -	0,0004 segundos	
  500 -	0,0027 segundos	
  1000 -	0,0156 segundos	
  10.000 -	0,1618 segundos	
  20.000 - 2,5117 segundos	
Árvore AVL
  100 - 0,0005 segundos
  500 - 0,0032 segundos
  1000 - 0,0172 segundos
  10000 - 0,1826 segundos
  20000 - 2,6837 segundos


Árvore Binária de Busca(BST):
  Inserção:
  A Árvore Binária de Busca é uma estrutura de dados que armazena elementos em ordem crescente. Para inserir um elemento na árvore binária, é necessário percorrer a árvore até encontrar o local correto para inserção. A inserção em uma Árvore é relativamente simples e direta.
  No entanto, em casos desbalanceados, pode haver degeneração em uma lista ligada, o que leva a uma complexidade de busca e remoção de O(n).
  Busca e remoção:
  A busca e a remoção em uma Árvore Binária de Busca não balanceada também podem ter complexidade O(n) no pior caso. No entanto, em árvores balanceadas, a complexidade média é O(log n).
  Conclusão:
  É preferível e funciona melhor em situações em que as operações de inserção e remoção são raras ou poucas ou a árvore é mantida balanceada manualmente.


Árvore AVL(AVL):
  Inserção:
  A árvore AVL é uma árvore binária de busca que é balanceada por definição. Isso significa que a altura da árvore é sempre log n, o que garante que as operações de inserção, busca e remoção tenham uma complexidade média de O(log n).
  Busca e remoção:
  A árvore AVL faz o rebalanceamento automático após as operações de inserção e remoção, mantendo a árvore sempre balanceada, oque é uma grande vantagem em cenários onde as operações de atualização são frequentes, com grande quantidade de inserções.
  Conclusão:
  É preferível e funciona melhor em situações em que há um equilíbrio entre as operações de inserção, busca e remoção e em que há grande quantidade de inserções.

Comparação:
  A escolha entre BST e AVL depende das necessidades e da situação.
  Se as operações de inserção, busca e remoção são frequentes e é preciso um desempenho consistente, a AVL é preferível devido ao seu rebalanceamento automático. No entanto, a AVL tem um fator em comparação com a BST não balanceada.
  Se você sabe que as operações de inserção e remoção são raras e deseja uma implementação mais simples, a BST pode ser usada, mas é importante garantir que a árvore seja mantida balanceada.
  Em cenários de busca intensiva, a AVL geralmente oferece um desempenho melhor, já que a altura da árvore é mantida em cheque, garantindo tempos de busca mais curtos.
  Já cenários onde o espaço de memória é crítico, a BST pode ser preferida, pois tem menos overhead devido às informações de altura adicionais nas AVLs.
  Como pode ser observado nos resultados, a árvore AVL tem um desempenho ligeiramente superior ao da árvore binária. A diferença de desempenho é pequena para pequenas entradas, mas aumenta à medida que o tamanho da entrada aumenta.

Conclusão
  Com a comparação dos métodos e das duas árvores, a árvore AVL é uma escolha mais segura em cenários gerais, visto que oferece desempenho consistente.
  Para casos específicos onde o desempenho é crítico e é possível ajustar manualmente o equilíbrio da árvore, a árvore Binária de Busca pode ser uma opção aceitável.

Descrição de classes e métodos da Árvore AVL:
  Import:
  import java.util.Random:  Importa a classe Random da biblioteca Java, que é usada para gerar números aleatórios.
  Classes:
  public class ArvoreAVL: Declaração da classe ArvoreAVL que implementa uma Árvore AVL.
  private No raiz:  Variável de instância que representa o nó raiz da árvore AVL.
  public ArvoreAVL():  Construtor da classe ArvoreAVL, que inicializa a raiz como nula.
  private class No: Classe interna que representa um nó na árvore AVL, contendo um valor, referências para os nós filhos esquerdo e direito e uma altura.
  No(int valor): Construtor da classe No que inicializa um nó com um determinado valor, com nós filhos nulos e uma altura de 1
  Métodos:
  public void inserir(int valor): Método público para inserir um novo nó com um determinado valor na árvore AVL.
  private No inserirRecursivamente(No atual, int valor) - Método privado que insere recursivamente um novo nó na árvore AVL de acordo com o valor passado, mantendo a propriedade de balanceamento AVL.
  public boolean buscar(int valor):  Método público que verifica se um determinado valor está presente na árvore AVL.
  private boolean buscarRecursivamente(No atual, int valor) - Método privado que busca recursivamente um valor na árvore AVL.
  public void remover(int valor):  Método público para remover um nó com um determinado valor da árvore AVL.
  private No removerRecursivamente(No atual, int valor) - Método privado que remove recursivamente um nó com um determinado valor da árvore AVL, mantendo a propriedade de balanceamento AVL.
  private int encontrarMenorValor(No no):  Método privado que encontra o menor valor na subárvore direita do nó fornecido.
  private int altura(No no):  Método privado que calcula a altura de um nó específico.
  private int obterBalanceamento(No no): Método privado que calcula o fator de balanceamento de um nó específico.
  private No rotacaoDireita(No y):  Método privado que executa uma rotação para a direita em torno de um nó específico, mantendo a propriedade de balanceamento AVL.
  private No rotacaoEsquerda(No x):  Método privado que executa uma rotação para a esquerda em torno de um nó específico, mantendo a propriedade de balanceamento AVL.

Descrição de classes e métodos da Árvore Binária:
  Import:
  import java.util.Random:  Importa a classe Random da biblioteca Java, que é usada para gerar números aleatórios.
  Classes:
  public class ArvoreBinaria:  Declaração da classe ArvoreBinaria que representa uma árvore binária. 
  private No raiz:  Variável de instância que representa o nó raiz da árvore.
  public ArvoreBinaria(): Construtor da classe ArvoreBinaria, que inicializa a raiz como nula.
  private class No: Classe interna que representa um nó na árvore binária, contendo um valor e referências para os nós filhos esquerdo e direito.
  No(int valor): Construtor da classe No que inicializa um nó com um determinado valor.
  Métodos:
  public void inserir(int valor):  Método público para inserir um novo nó com um determinado valor na árvore.
  private No inserirRecursivamente(No atual, int valor):  Método privado que insere recursivamente um novo nó na árvore binária de acordo com o valor passado.
  public boolean buscar(int valor): Método público que verifica se um determinado valor está presente na árvore binária.
  private boolean buscarRecursivamente(No atual, int valor):  Método privado que busca recursivamente um valor na árvore binária.
  public void remover(int valor): Método público para remover um nó com um determinado valor da árvore.
  private No removerRecursivamente(No atual, int valor):  Método privado que remove recursivamente um nó com um determinado valor da árvore.
  private int encontrarMenorValor(No no): Método privado que encontra o menor valor na subárvore direita do nó fornecido.



