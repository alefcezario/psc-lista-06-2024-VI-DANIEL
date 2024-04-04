import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letra = new char[10];
        int somaConsoantes = 0;

        System.out.println("Vamos ler 10 caracteres");

        for(int i = 0; i < letra.length; i++){
            System.out.println("Digite a "+ (i + 1) + "ª letra: ");
            letra[i] = scanner.next().charAt(0);
            letra[i] = Character.toLowerCase(letra[i]);

            if ( (letra[i] >= 'a' && letra[i] <= 'z') &&
            ( letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u' )) {
                somaConsoantes++;
                
            }
        }
        
        System.out.println("Foram lidas "+somaConsoantes+" consoantes");

        if ((somaConsoantes > 0)) {
            System.out.println("As consoantes lidas foram: ");
        for(int i = 0; i < letra.length; i++){
            if ( (letra[i] >= 'a' && letra[i] <= 'z') && 
            ( letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u' )) {
              System.out.print(letra[i]+ ", ");  
                
            }
        }
        }
        scanner.close();
    }
}
