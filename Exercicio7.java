import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeroLidos = new int[5];
        int somaNumeros = 0, multiplicacaoNumeros = 1;

        System.out.println("Digite 5 números inteiros");

        for(int i =0 ; i < numeroLidos.length; i++){
            System.out.print((i+1)+"º : ");
            numeroLidos[i] = scanner.nextInt();
            somaNumeros+= numeroLidos[i];
            multiplicacaoNumeros*=  numeroLidos[i];
        }

        System.out.println("\nO numeros inteiros lidos foram: ");

        for(int i =0 ; i < numeroLidos.length; i++){
            System.out.println((i+1)+"º : "+ numeroLidos[i]);
        }

        System.out.println("A soma dos numeros é: "+somaNumeros);
        System.out.println("A multiplicação dos numeros é: "+multiplicacaoNumeros);
        scanner.close();
    }
}
