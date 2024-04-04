import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] entrada = new int[5];
        int posicao = 1;

        for(int i = 0;i < entrada.length;i++){
            System.out.println("Digite o "+ posicao + "º numero inteiro: ");
            entrada[i] = scanner.nextInt();
            posicao++;
        }

        System.out.println("Os numeros digitados foram: ");

        for(int j = 0;j < entrada.length;j++){
         
            System.out.println(entrada[j]);
        }
        
        scanner.close();
    }
}
