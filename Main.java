import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int[] tamanhos = {100, 500, 1000, 10000, 20000};

        for (int tamanho : tamanhos) {
            System.out.println("Testando com " + tamanho + " elementos:");

            long inicio, fim;

            // Árvore binária de busca (BST)
            ArvoreBinaria arvoreBST = new ArvoreBinaria();
            Random random = new Random();

            // Inserção
            inicio = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                arvoreBST.inserir(random.nextInt(100000));
            }
            fim = System.currentTimeMillis();
            System.out.println("Árvore Binária (BST) - Inserção: " + (fim - inicio) + " ms");

            // Busca
            inicio = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                arvoreBST.buscar(random.nextInt(100000));
            }
            fim = System.currentTimeMillis();
            System.out.println("Árvore Binária (BST) - Busca: " + (fim - inicio) + " ms");

            // Remoção
            inicio = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                arvoreBST.remover(random.nextInt(100000));
            }
            fim = System.currentTimeMillis();
            System.out.println("Árvore Binária (BST) - Remoção: " + (fim - inicio) + " ms");

            // Árvore AVL
            ArvoreAVL arvoreAVL = new ArvoreAVL();
            random = new Random();

            // Inserção
            inicio = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                arvoreAVL.inserir(random.nextInt(100000));
            }
            fim = System.currentTimeMillis();
            System.out.println("Árvore AVL - Inserção: " + (fim - inicio) + " ms");

            // Busca
            inicio = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                arvoreAVL.buscar(random.nextInt(100000));
            }
            fim = System.currentTimeMillis();
            System.out.println("Árvore AVL - Busca: " + (fim - inicio) + " ms");

            // Remoção
            inicio = System.currentTimeMillis();
            for (int i = 0; i < tamanho; i++) {
                arvoreAVL.remover(random.nextInt(100000));
            }
            fim = System.currentTimeMillis();
            System.out.println("Árvore AVL - Remoção: " + (fim - inicio) + " ms");

            System.out.println();
        }
    }
}
