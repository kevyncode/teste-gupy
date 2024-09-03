package questao01;

import java.util.Scanner;

/**
 * Classe principal para verificar se um número pertence à sequência de Fibonacci.
 */
public class Fibonacci {

    /**
     * Verifica se um número pertence à sequência de Fibonacci.
     * @param number O número a ser verificado.
     * @return true se o número pertence à sequência de Fibonacci, false caso contrário.
     */
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }
        int a = 0, b = 1;
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == number;
    }

    /**
     * Método principal para executar a verificação de Fibonacci.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
    }
}