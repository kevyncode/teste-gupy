package questao04;

/**
 * Classe principal para completar as sequências lógicas.
 */
public class CompleteQuestion {
    public static void main(String[] args) {
        // a) Sequência de números ímpares consecutivos
        int[] seqA = {1, 3, 5, 7};
        int nextA = seqA[seqA.length - 1] + 2;
        System.out.println("Próximo elemento de a): " + nextA);

        // b) Sequência de potências de 2
        int[] seqB = {2, 4, 8, 16, 32, 64};
        int nextB = seqB[seqB.length - 1] * 2;
        System.out.println("Próximo elemento de b): " + nextB);

        // c) Sequência de quadrados perfeitos
        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int nextC = (int) Math.pow(seqC.length, 2);
        System.out.println("Próximo elemento de c): " + nextC);

        // d) Sequência de quadrados perfeitos de números pares
        int[] seqD = {4, 16, 36, 64};
        int nextD = (int) Math.pow((seqD.length + 1) * 2, 2);
        System.out.println("Próximo elemento de d): " + nextD);

        // e) Sequência de Fibonacci
        int[] seqE = {1, 1, 2, 3, 5, 8};
        int nextE = seqE[seqE.length - 1] + seqE[seqE.length - 2];
        System.out.println("Próximo elemento de e): " + nextE);

        // f) Sequência de números que contêm o dígito 2
        int[] seqF = {2, 10, 12, 16, 17, 18, 19};
        int nextF = 20; // O próximo número que contém o dígito 2
        System.out.println("Próximo elemento de f): " + nextF);
    }
}