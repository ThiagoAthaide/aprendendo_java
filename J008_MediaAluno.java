package basico;

import java.util.Scanner;

public class J008_MediaAluno {

    public static void main(String[] args) {
        int n = 5;
        int notas[] = new int[n];
        int i;

        Scanner scan = new Scanner(System.in);

        for (i = 0; i <= n; i++) {
            System.out.printf("informe a nota do aluno: ",(i + 1),n);
            
            //notas[i] = i;
            if (notas[i] < 0 && notas[i] <= 100) {
                System.out.println("Erro ao adicionar elemento!: ");
            }

            scan.close();

        }

        notas[i] = notas[i] / i;

        System.out.println(notas[i]);

    }

}