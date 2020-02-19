package basico;

public class J005_ParImpar {

    public static void main(String[] args) {
        int impar = 0;
        int par = 0;
        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0) {
               // impar = i;
                impar = i + 1;
            } else {
                if (i % 2 == 0) {
                    //par = i;
                    par = i * 2;

                }
            }
        }
        // System.out.println("\nSOMA DOS IMPARES\n" + i);

        System.out.println("\nSOMA DOS IMPARES\n" + impar);
        System.out.println("\nMULTIPLICAÇÃO DOS PARES\n" + par);
    }
}
