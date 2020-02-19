package basico;

import java.util.Scanner;

public class J006_TrocaNumero {

    public static void main(final String[] args) {
        int numA, numB;

        final Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero de A:\n ");
        numA = scan.nextInt();

        System.out.println("Informe o numero de B:\n ");
        numB = scan.nextInt();

        System.out.println("TROCA DE NUMEROS:\n \n" + Trocar(numA,numB));

        scan.close();
    }

    public static int Trocar(int numA, int numB) {
        int troca;

        troca = numA;
        numA = numB;
        numB = troca;
        return numA;
    }    

}