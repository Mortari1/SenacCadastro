
package Aula02_exercicios;
import java.util.Scanner;
/**
 Elabore um programa em Java que leia quatro números inteiros e apresenta
 a média aritmética entre eles.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,num4;
        double  media;
        
        System.out.println("Insira um numero: ");
        num1 = input.nextInt();
        
        System.out.println("Insira um numero: ");
        num2 = input.nextInt();
        
        System.out.println("Insira um numero: ");
        num3 = input.nextInt();
        
        System.out.println("Insira um numero: ");
        num4 = input.nextInt();
        
        //Fiz casting e a media em double, para caso da media entre os 4
        //quebrarem
        media = (double) (num1 + num2 + num3 + num4) / 4;
        
        System.out.println("A média é: "+media);
        
    }
 
}
