
package Aula02_exercicios;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
/*8. Elabore um programa em Java que leia a base e a altura de um retângulo e
apresente o perímetro, a área e a diagonal, dada as fórmulas:
• Dica: Pesquise sobre a biblioteca/classe Math do Java para calcular a
diagonal.*/
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b,h, calculos;
        
        System.out.println("Defina a base: ");
        b = input.nextDouble();
        
        System.out.println("Defina a altura: ");
        h = input.nextDouble();
        
        //perimetro
        calculos = 2 * (b + h);
        System.out.println("O perimetro do retângulo é: "+calculos);
        
        //área
        calculos = b * h;
        System.out.println("A área do retângulo é: "+calculos);
        
        //diagonal
        calculos = Math.sqrt(Math.pow(b, 2)+Math.pow(h,2));
        System.out.println("A diagonal do retângulo é: "+calculos);
        
        
        
    }
}
