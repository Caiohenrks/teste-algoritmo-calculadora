package br.com.calculadora;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        int cont;
        do {
            Funcao f = new Funcao();
            System.out.println("==============================");
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("==============================");
            Scanner sc = new Scanner(System.in);
            int escolha = sc.nextInt();
            int a, b;

            switch (escolha) {
                case 1 -> {
                    System.out.print("Valor 1: ");
                    a = sc.nextInt();
                    System.out.print("Valor 2: ");
                    b = sc.nextInt();

                    System.out.println("Resultado é : " + f.soma(a, b));
                }
                case 2 -> {
                    System.out.print("Valor 1: ");
                    a = sc.nextInt();
                    System.out.print("Valor 2: ");
                    b = sc.nextInt();
                    System.out.println("Resultado é : " + f.subtracao(a, b));
                }
                case 3 -> {
                    System.out.print("Valor 1: ");
                    a = sc.nextInt();
                    System.out.print("Valor 2: ");
                    b = sc.nextInt();
                    System.out.println("Resultado é : " + f.multiplicacao(a, b));
                }
                case 4 -> {
                    System.out.print("Valor 1: ");
                    float ad = sc.nextInt();
                    System.out.print("Valor 2: ");
                    float bd = sc.nextInt();
                    System.out.println("Resultado é : " + f.divisao(ad, bd));
                }
                default ->
                    System.out.print("Valor Inválido.");
            }
            System.out.println("");
            System.out.println("Deseja Continuar ?");
            System.out.println("1 - para sim");
            System.out.println("2 - para não");
            cont = sc.nextInt();
            if (cont != 1 && cont != 2) {
                System.out.println("Opção inválida, calculadora fechada");
                cont = 2;
            }
            System.out.println("");
        } while (cont == 1);
    }
}
