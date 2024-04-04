import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        int posicaoNota = 1;
        double somaNotas = 0, mediaNotas;

        System.out.println("Vamor calcular a média de 4 notas");

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a "+ posicaoNota +"ª nota: ");
            notas[i] = scanner.nextDouble();
            posicaoNota++;
            somaNotas+= notas[i];
        }

        posicaoNota = 1; 

        for(int i = 0; i < notas.length; i++){
            System.out.println("Sua "+posicaoNota+"ª nota foi: "+notas[i]);
            posicaoNota++;
        }
        
        mediaNotas = somaNotas / notas.length;
        System.out.println("Sua média de notas é: "+ mediaNotas);

        scanner.close();

    }
}
