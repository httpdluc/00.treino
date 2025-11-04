import java.util.Scanner;

public class 1021{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = 576.76;
        double valor100 = valor / 100;
        double valor50 = valor % 100;
        double valor20 = valor50 % 50;
        double valor10 = valor20 % 20;
        double valor5 = valor10 % 10;
        double valor2 = valor5 % 5;
        double valor1 = valor2 % 2;
        double valorP50 = (valor1* 100) % 100;
        double valorP25 = valorP50 % 50;
        double valorP10 = valorP25 % 25;
        double valorP5 = (valorP10 * 100);
        double valorP1 = valorP5 % 5;


        System.out.println("NOTAS:");
        System.out.printf( "%.0f nota(s) de R$ 100.00\n", Math.floor(valor100));
        System.out.printf( "%.0f nota(s) de R$ 50.00\n", Math.floor(valor50 / 50));
        System.out.printf( "%.0f nota(s) de R$ 20.00\n", Math.floor(valor20 / 20));
        System.out.printf( "%.0f nota(s) de R$ 10.00\n", Math.floor(valor10 / 10));
        System.out.printf( "%.0f nota(s) de R$ 5.00\n", Math.floor(valor5 / 5));
        System.out.printf( "%.0f nota(s) de R$ 2.00\n", Math.floor(valor2 / 2));
        System.out.println("MOEDAS:");
        System.out.printf( "%.0f moeda(s) de R$ 1.00\n", Math.floor(valor1));
        System.out.printf( "%.0f moeda(s) de R$ 0.50\n", Math.floor(valorP50 / 50));
        System.out.printf( "%.0f moeda(s) de R$ 0.25\n", Math.floor(valorP25 / 25));
        System.out.printf( "%.0f moeda(s) de R$ 0.10\n", Math.floor(valorP10 / 10));
        System.out.printf( "%.0f moeda(s) de R$ 0.05\n", Math.floor(valorP5));
        System.out.printf( "%.0f moeda(s) de R$ 0.01\n", Math.floor(valorP1));

        sc.close();        
    }
}
