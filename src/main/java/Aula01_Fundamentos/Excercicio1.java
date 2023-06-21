package Aula01_Fundamentos;

import java.util.Scanner;

public class Excercicio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int result;
        System.out.println("Informe um número: ");
        int num1 = ler.nextInt();
        
        
        System.out.println("Informe outro número: ");
        int num2 = ler.nextInt();
        
        ler.nextLine();
        
        System.out.println("Qual operador lógico deseja usar ? ");
        String operador = ler.nextLine();
        
        switch (operador){
            
            case "+":
                result = (num1+num2);
                System.out.println("Resultado da soma: "+result);
                break;
                
            case "-":
                result = num1 - num2;
                System.out.println("Resultado da subtração: "+result);
                break;
                
            case "*":
                result = num1 + num2;
                System.out.println("Resultado da multiplicação : "+result);
                break;
                
            case"/":
                result = num1 / num2;
                System.out.println("Resultado da divisão: "+result);
                
            default:
                System.out.println("Operador invalido!");
        }   
    }
}
