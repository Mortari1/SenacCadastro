
package Aula02_exercicios;
import java.util.Scanner;
/**
 Ler uma temperatura em graus centígrados e apresentá-la convertida em
graus Fahrenheit. A fórmula de conversão é:
• F= (C * (9/5)) + 32
I. onde F é a temperatura em Fahrenheit e C é a temperatura em
centígrados.

 */
public class Ex04 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, farenheit;
        
        
        System.out.println("Informe a temperatura: ");
        celsius = input.nextDouble();
        
        farenheit = (celsius * 1.8) + 32;
        
        System.out.println("A temperatura em farenheit é: "+farenheit);
    }
}
