import java.util.Random;

import java.util.Random;

public class ArvoreAVL {
    private No raiz;

    public ArvoreAVL() {
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
        }

        atual.altura = 1 + Math.max(altura(atual.esquerda), altura(atual.direita));

        int balance = obterBalanceamento(atual);

        // Esquerda Pesada
        if (balance > 1 && valor < atual.esquerda.valor) {
            return rotacaoDireita(atual);
        }

        // Direita Pesada
        if (balance < -1 && valor > atual.direita.valor) {
            return rotacaoEsquerda(atual);
        }

        // Esquerda-Direita Pesada
        if (balance > 1 && valor > atual.esquerda.valor) {
            atual.esquerda = rotacaoEsquerda(atual.esquerda);
            return rotacaoDireita(atual);
        }

        // Direita-Esquerda Pesada
        if (balance < -1 && valor < atual.direita.valor) {
            atual.direita = rotacaoDireita(atual.direita);
            return rotacaoEsquerda(atual);
        }

        return atual;
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

        atual.altura = 1 + Math.max(altura(atual.esquerda), altura(atual.direita));

        int balance = obterBalanceamento(atual);

        // Esquerda Pesada
        if (balance > 1 && obterBalanceamento(atual.esquerda) >= 0) {
            return rotacaoDireita(atual);
        }

        // Direita Pesada
        if (balance < -1 && obterBalanceamento(atual.direita) <= 0) {
            return rotacaoEsquerda(atual);
        }

        // Esquerda-Direita Pesada
        if (balance > 1 && obterBalanceamento(atual.esquerda) < 0) {
            atual.esquerda = rotacaoEsquerda(atual.esquerda);
            return rotacaoDireita(atual);
        }

        // Direita-Esquerda Pesada
        if (balance < -1 && obterBalanceamento(atual.direita) > 0) {
            atual.direita = rotacaoDireita(atual.direita);
            return rotacaoEsquerda(atual);
        }

        return atual;
    }

    private int encontrarMenorValor(No no) {
        return no.esquerda == null ? no.valor : encontrarMenorValor(no.esquerda);
    }

    private int altura(No no) {
        return no == null ? 0 : no.altura;
    }

    private int obterBalanceamento(No no) {
        return no == null ? 0 : altura(no.esquerda) - altura(no.direita);
    }

private void atualizarAlturaNo(No no){
        no.altura = Math.max(altura(no.esquerda), altura(no.direita)) + 1;
}

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
    private class No {
        int valor;
        No esquerda;
        No direita;
        int altura;
        No(int valor) {
            this.valor = valor;
            esquerda = null;
            direita = null;
            altura = 1;
        }
    }
}