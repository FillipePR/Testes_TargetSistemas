import java.util.Scanner;

public class ValidaFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***verificador Fibonacci***");
        System.out.println("Digite um número inteiro:");
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int numInput = scanner.nextInt();

        if (numInput != 0) {
            while(n3 < numInput){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            if (numInput == 0){
                System.out.println("O número 0 está na sequência Fibonacci.");
            } else if (numInput == n3) {
                System.out.println("O número "+ numInput + " está na sequência Fibonacci.");
            }else System.out.println("O número "+ numInput + " NÃO está na sequência Fibonacci.");
        }else System.out.println("Número inválido");
    }
}
