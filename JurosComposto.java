
package com.mycompany.juroscomposto;

/**
 *
 * @author Vinicius
 */
import java.util.Scanner;

public class JurosComposto {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Bem vindo a Calculadora de Juros compostos!");
        int escolha;
        while (true) {
            System.out.println("1. Pra fazer ter acesso a calculadora digite 1");
            System.out.println("0. Para sair digite 0");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:

                    System.out.println("Você escolheu a Opção 1.");
                    System.out.print("Por favor, insira o valor do investimento:R$");
                    double p = scanner.nextDouble(); // valor principal
                    System.out.print("Por favor, insira o percentual de JUROS ao ano 'Somente número': ");
                    double r1 = scanner.nextDouble();
                    System.out.print("Por favor, insira quantos anos deseja investir: ");
                    int n = scanner.nextInt();    //periodo a receber
                    double r = r1 /100;   // porcentual ajustado
                    for (int i = 1; i <= n; i++)   //i faz o controle de percorrer ano a ano
                    {
                        double potencia = Math.pow((1+r),i);  //trocado por i para mostrar ano a ano
                        double a = p * potencia;                // formula final
                        System.out.printf("Valor do %dº ano =R$%.2f", i, a);
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0); // Termina o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
