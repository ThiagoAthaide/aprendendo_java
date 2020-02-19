package basico;

import java.util.Scanner;

public class J002_calculadora {
    public static void main(String[] args) {
        int n1, n2, operacao;
        Scanner scan = new Scanner(System.in);

        System.out.flush(); // limpar tela
        System.out.print("Insira o primeiro numero: ");
        n1 = scan.nextInt();

        System.out.print("\nInsira o segundo numero: ");
        n2 = scan.nextInt();

        System.out.print("\ndigite 1 pra somar: ");
        System.out.print("\ndigite 2 pra subtrair: ");
        System.out.print("\ndigite 3 pra multiplicar: ");
        System.out.print("\ndigite 4 pra dividir: \n");

        operacao = scan.nextInt();

        switch (operacao) {
        case 1:
            System.out.println(somar(n1, n2));
            break;

        case 2:
            System.out.println(subtrair(n1, n2));
            break;

        case 3:
            System.out.println(multiplicar(n1, n2));
            break;

        case 4:
            System.out.println(dividir(n1, n2));
            break;

        default:
            System.out.println("Você digitou a opção errada! ");
            break;
        }
        scan.close();

    }

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static int dividir(int n1, int n2) {
        return n1 / n2;
    }

}