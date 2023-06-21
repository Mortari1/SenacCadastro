
package Aula02_exercicios;
import java.util.Scanner;
//5. Ler um número inteiro e imprimir a terça parte deste número.
public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        double parte3;
        
        System.out.println("Informe um número inteiro: ");
        num = ler.nextInt();
        
        parte3 = (double) num / 3;
        
        System.out.println("A terceira parte do número é: "+parte3);
       
    }
}
