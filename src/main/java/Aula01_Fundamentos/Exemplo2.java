/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01_Fundamentos;


public class Exemplo2 {
    public static void main(String[] args) {
        int i = 20;
        int j = 2;
        int x = 0;
        int y = 0;
        
        j++;
        System.out.println("1: j = "+j);
        
        ++i;
        System.out.println("2: i = "+i);
        
        x = i++ + j;
        System.out.println("3: x = "+x);
        System.out.println("4: i = "+i);
        System.out.println("5: j = "+j);
        
        y = ++j + ++i;
        System.out.println("6: x = "+y);
    }
}
