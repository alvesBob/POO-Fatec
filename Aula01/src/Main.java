import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Peso do bicho:");
        double peso = sc.nextDouble();

        System.out.print("Nome do bicho:");
        String nome = sc.next();

        System.out.print("Formato do bicho:");
        String formato = sc.next();

        System.out.print("Voa?(y/n)");
        String voa = sc.next();

        System.out.println("Numero de pernas:");
        int numPernas = sc.nextInt();

        Bicho newBicho = new Bicho(peso,nome, formato, voa, numPernas);

        System.out.println(newBicho);







    }
}