package pii2303;

import java.util.Scanner;

public class Bhaskarasavessas {

       public static void main(String[] args) {
           Scanner leitor = new Scanner (System.in);
           
           double x1,x2, a, b, c, produto, soma;
           
           //ENTRADAS
           System.out.println("x1: ");
           x1 = leitor.nextDouble();
           System.out.println("x2: ");
           x2 = leitor.nextDouble();
           System.out.println("c: ");
           c = leitor.nextDouble();
           
           //PROCESSAMENTO
           soma = x1 + x2;
           produto = x1 * x2;
           a =  c / produto;
           b = soma * a;
           
           //SAIDA
           System.out.println("A equação que tem raizes " + x1 + " e " + x2 + " é " + a + "x² + " + b + "x + " + c);
          
                   
            }
    
}
