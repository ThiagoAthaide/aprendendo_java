package basico;

import java.util.Scanner;

public class J007_ComparaNumero {

    public static void main(String[] args) {

        int n1, n2;

        Scanner scan = new Scanner(System.in);

        System.out.println("informe o valor de N1: ");
        n1 = scan.nextInt();

        System.out.println("informe o valor de N2: ");
        n2 = scan.nextInt();

        System.out.println("COMPARAÇÃO DE NUMEROS : " + Comparar(n1, n2));

        scan.close();

    }

    public static int Comparar(int n1, int n2) {

        if (n1 == n2) {
            System.out.println("SÃO IGUAIS");
        }
        if (n1 != n2) {
            System.out.println("SÃO DIFERENTES");
        }
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}