
package Aula02_exercicios;
import java.util.Scanner;
/**
    Ler um número inteiro e imprimir seu sucessor e antecessor. Utilize os
    operadores de incremento e decremento.
 */
public class Ex03 {
    public static void main(String[] args){
        int num, adSub;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        num = input.nextInt();
        
        adSub = num + 1;
        System.out.println("Sucessor: "+adSub);
        
        adSub = num -1;
        System.out.println("Antecessor: "+adSub);
        
               
    }
}
