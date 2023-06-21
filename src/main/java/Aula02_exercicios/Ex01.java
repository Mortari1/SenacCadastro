
package Aula02_exercicios;
import java.util.Scanner;
/*Elabore um programa em Java que leia dois números, sendo um deles inteiro
e outro do tipo float e apresente a soma, subtração, divisão e multiplicação
dos números*/

public class Ex01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        float num2, result;
        System.out.println("Informe um numero inteiro: ");
        num1 = input.nextInt();
        
        
        System.out.println("Informe um numero real: ");
        num2 = input.nextFloat();
        
        result = num1 + num2;
        System.out.println("A soma é: "+result);
        
        result = num1 - num2;
        System.out.println("A subtração é: "+result);
        
        result = num1 * num2;
        System.out.println("A multiplicação é: "+result);
        
        result = num1 / num2;
        System.out.println("A divisão é: "+result);
       
    }
}
