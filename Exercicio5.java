import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeroDigitado = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int indicePar = 0;
        int indiceImpar = 0;
        
        System.out.println("Por favor, digite 20 numeros inteiros abaixo: ");
        
        for(int i = 0; i < numeroDigitado.length; i++){
        System.out.print((i+1)+ "º numero: ")    ;
        numeroDigitado[i] = scanner.nextInt();
          if (numeroDigitado[i] % 2 == 0) {
                par[indicePar] = numeroDigitado[i];
                indicePar++;
 
        } else {
                impar[indiceImpar] = numeroDigitado[i];
                indiceImpar++;
        }
        
        }

        System.out.println("\nOs 20 numeros inteiros digitados foram: ");
        for(int i = 0; i < numeroDigitado.length; i++){
        System.out.print(numeroDigitado[i]+", ");
        }
 
    if(indicePar> 0){
        System.out.println("\n\nDos numeros digitados, os "+indicePar+ " abaixo são pares: ");       
        for(int j = 0; j < indicePar; j++){
        System.out.print(par[j]+", ");
        }
    }else{
        System.out.println("\n\nEntre os numeros digitados, não tivemos numeros pares.");
    }
    
     if(indiceImpar> 0){
        System.out.println("\n\nDos numeros digitados, os "+indiceImpar+ " abaixo são impares: ");
        for(int k = 0; k < indiceImpar; k++){
        System.out.print(impar[k]+", ");
        }
     }else{
         System.out.println("\n\nEntre os numeros digitados, não tivemos numeros impares.");
     }
     scanner.close();
    }
}
