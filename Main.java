import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner leitorScanner = new Scanner(System.in);

       char desejaContinuar = 'S';

       while (desejaContinuar == 'S' || desejaContinuar == 's'){

           System.out.println("Digite um número");
           int numero = leitorScanner.nextInt();

           if (numero == 0) {
               System.out.println("O número é zero");
           } else {
               if (numero > 0) {
                System.out.println("O numero é maior que zero");
               } else {
                   System.out.println("O numero é menor que zero");
               }
           }

           System.out.println("Deseja continuar? S - SIm / N - Não");
           desejaContinuar = leitorScanner.next().charAt(0);
       }

    }
}