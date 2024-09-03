package questao02;

import java.util.Scanner;

/**
 * Classe principal para validação de strings.
 */
public class StringValidation {

    /**
     * Verifica se a string contém a letra 'a'.
     * @param input A string a ser verificada.
     * @return true se a string contém a letra 'a', false caso contrário.
     */
    public static boolean containsLetterA(String input) {
        return input.toLowerCase().contains("a");
    }

    /**
     * Conta quantas vezes a letra 'a' aparece na string.
     * @param input A string a ser verificada.
     * @return O número de vezes que a letra 'a' aparece na string.
     */
    public static int countLetterA(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

    /**
     * Método principal para executar a validação de strings.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String input = scanner.nextLine();
        scanner.close();

        if (containsLetterA(input)) {
            int count = countLetterA(input);
            System.out.println("A letra 'a' aparece " + count + " vezes no texto.");
        } else {
            System.out.println("A letra 'a' não aparece no texto.");
        }
    }
}