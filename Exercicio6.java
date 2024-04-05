import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] mediaNotas = new double[10];
        double[] notaAluno = new double[4];
        double somaNotas = 0;
        int quantidadeAlunos = 0;
        
        System.out.println("Por favor, digite 4 notas de cada aluno para saber a quantidade de alunos com media maior ou igual a 7");

        for(int i =0 ; i < mediaNotas.length; i++){
            for(int j = 0; j < notaAluno.length; j++){
            System.out.print("Digite a "+ (j+1) + "ª nota do aluno "+ (i+1) + ": ");
            notaAluno[j] = scanner.nextDouble();
            somaNotas += notaAluno[j];
            }
            mediaNotas[i] = somaNotas / notaAluno.length;
            if (mediaNotas[i] >= 7) {
                quantidadeAlunos++;
            }
            somaNotas = 0;
            System.out.println("\n");
        }

    if(quantidadeAlunos>1){
    System.out.println("Tivemos "+ quantidadeAlunos + " alunos com a média de notas maior ou igual a 7.0");
    }else if(quantidadeAlunos == 1){
        System.out.println("Tivemos apenas "+ quantidadeAlunos + " aluno com a média de notas maior ou igual a 7.0");
    }else{
        System.out.println("Não tivemos alunos com a média maior ou igual a 7.0");
    }
            scanner.close();
    }
}
