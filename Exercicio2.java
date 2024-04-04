import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeroReal = new double[10];
        int posicao = 1;

        for(int i = 0; i < numeroReal.length ; i++){
            System.out.println("Digite o "+posicao+"º numero real: ");
            numeroReal[i] = scanner.nextDouble();
            posicao++;
        }

        System.out.println("Os numeros reais digitados em ordem inversa são: ");

        for(int j = numeroReal.length - 1; j >= 0; j--){
            System.out.println(numeroReal[j]);
        }

        scanner.close();
    }
}
