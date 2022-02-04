package one.frt.treino;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b, x;

        System.out.println(" -- Vamos fazer contas -- ");
        System.out.println("Use os operadores simples: - + / *");
        System.out.println("Ex.: 1 + 1");
        System.out.println();
        a = scan.nextInt();
        System.out.println();
        b = scan.nextInt();

        x=a+b;
        System.out.println(a + " + " + b + " = " + x);
        x=a-b;
        System.out.println(a + " - " + b + " = " + x);
        x=a/b;
        System.out.println(a + " / " + b + " = " + x);
        x=a*b;
        System.out.println(a + " x " + b + " = " + x);

        System.out.println("Primeiras operações realizadas com sucesso.");


    }

}
