public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivamente(raiz, valor);
    }

    private No inserirRecursivamente(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivamente(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivamente(atual.direita, valor);
        } else {
            // Valor já existe na árvore, não faz nada
            return atual;
        }

        // Atualiza a altura do nó atual
        atual.altura = 1 + Math.max(altura(atual.esquerda), altura(atual.direita));

        // Verifica o fator de balanceamento do nó atual
        int balanceamento = getBalanceamento(atual);

        // Casos de desbalanceamento e rotações
        if (balanceamento > 1) {
            if (valor < atual.esquerda.valor) {
                return rotacaoDireita(atual);
            } else {
                atual.esquerda = rotacaoEsquerda(atual.esquerda);
                return rotacaoDireita(atual);
            }
        }
        if (balanceamento < -1) {
            if (valor > atual.direita.valor) {
                return rotacaoEsquerda(atual);
            } else {
                atual.direita = rotacaoDireita(atual.direita);
                return rotacaoEsquerda(atual);
            }
        }

        return atual;
    }

    private void atualizarAlturaNo(No no){
        no.altura = Math.max(altura(no.esquerda), altura(no.direita)) + 1;
    }


    // Método para realizar rotação à esquerda
    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No sA = x.direita;

        x.direita = y;
        y.esquerda = sA;

        atualizarAlturaNo(y);
        atualizarAlturaNo(x);

        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No sA = y.esquerda;

        y.esquerda = x;
        x.direita = sA;

        atualizarAlturaNo(x);
        atualizarAlturaNo(y);

        return y;
    }

    // Obter a altura de um nó (ou 0 se nulo)
    private int altura(No n) {
        return n == null ? 0 : n.altura;
    }

    // Obter o fator de balanceamento de um nó
    private int getBalanceamento(No n) {
        return n == null ? 0 : altura(n.esquerda) - altura(n.direita);
    }


    public boolean buscar(int valor) {
        return buscarRecursivamente(raiz, valor);
    }

    private boolean buscarRecursivamente(No atual, int valor) {
        if (atual == null) {
            return false;
        }

        if (valor == atual.valor) {
            return true;
        }

        return valor < atual.valor
                ? buscarRecursivamente(atual.esquerda, valor)
                : buscarRecursivamente(atual.direita, valor);
    }

    public void remover(int valor) {
        raiz = removerRecursivamente(raiz, valor);
    }

    private No removerRecursivamente(No atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor == atual.valor) {
            if (atual.esquerda == null) {
                return atual.direita;
            } else if (atual.direita == null) {
                return atual.esquerda;
            }

            atual.valor = encontrarMenorValor(atual.direita);
            atual.direita = removerRecursivamente(atual.direita, atual.valor);
        } else if (valor < atual.valor) {
            atual.esquerda = removerRecursivamente(atual.esquerda, valor);
        } else {
            atual.direita = removerRecursivamente(atual.direita, valor);
        }

        return atual;
    }

    private int encontrarMenorValor(No no) {
        return no.esquerda == null ? no.valor : encontrarMenorValor(no.esquerda);
    }

    private static class No {
        public int altura;
        int valor;
        No esquerda;
        No direita;

        No(int valor) {
            this.valor = valor;
            esquerda = null;
            direita = null;
        }
    }
}
