
package Aula02_exercicios;
import java.util.Scanner;
       
/*
6. Ler nome, endereço e telefone e imprimi-los. Utilizar String para
desenvolvimento do exercício.*/
public class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, endereco, telefone;
        
        System.out.println("Informe seu endereço: ");
        endereco = ler.nextLine();
        
        
        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
        
        
        System.out.println("Informe seu telefone: ");
        telefone = ler.nextLine();
        
        System.out.println("O nome é: "+nome+
                " O endereço é: "+endereco+
                " O telefone é: "+telefone);
    }
}
