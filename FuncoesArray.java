import java.util.Scanner;
public class FuncoesArray {

    public static int totalPares(int[] array) {
        int total = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                total++;
            }
        }
        return total;
    }

    public static int maiorValor(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int totalIguais(int[] array1, int[] array2) {
        int total = 0;
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    total++;
                    break;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] array1 = {2, 5, 8, 7, 10, 3};
        int[] array2 = {8, 3, 12, 5, 20};

        System.out.println("Array 1: ");
        for (int i : array1) System.out.print(i + " ");
        System.out.println("\nArray 2: ");
        for (int i : array2) System.out.print(i + " ");
        System.out.println();
        
        System.out.println("\nTotal de pares no Array 1: " + totalPares(array1));
        System.out.println("Maior valor no Array 1: " + maiorValor(array1));
        System.out.println("Total de elementos iguais entre os dois arrays: " + totalIguais(array1, array2));

        leitor.close();
    }
}
