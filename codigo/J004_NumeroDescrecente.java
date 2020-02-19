package basico;

import java.util.Scanner;

public class J004_NumeroDescrecente {

    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("informe um numero: ");
        num = scan.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.println("\n"+i+"\n");
        }

        scan.close();
    }

}
