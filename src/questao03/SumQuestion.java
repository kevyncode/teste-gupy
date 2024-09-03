package questao03;

/**
 * Classe principal para calcular a soma de uma sequência.
 */
public class SumQuestion {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        // Loop para calcular a soma
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // Exibir o resultado da soma
        System.out.println(SOMA);
    }
}