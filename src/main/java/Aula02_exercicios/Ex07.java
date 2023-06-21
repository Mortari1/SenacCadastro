
package Aula02_exercicios;
import java.util.Scanner;
/*
7. Elabore um programa em Java que leia dois valores inteiros e apresente o
quociente e o resto da divisão entre eles.
*/
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        double result;
        
        System.out.println("Informe um número: ");
        num1 = input.nextInt();
        
        System.out.println("Informe um número: ");
        num2 = input.nextInt();
        
        result = (double) num1 / num2;
        System.out.println("Quociente: "+result);
        
        result =  num1 % num2;
        System.out.println("Resto da divisão: "+result);
       
        
    }
}
