package basico;

import java.util.Scanner;

public class J003_MaiorNumero {

    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner scan = new Scanner(System.in);

        System.out.println("informe o primeiro numero: \n");
        n1 = scan.nextInt();

        System.out.println("\ninforme o segundo numero: \n");
        n2 = scan.nextInt();

        System.out.println("\nMAIOR É: \n" + maior(n1, n2));

        scan.close();

    }

    public static int maior(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}
