/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class PracticoI{
    public static void main (String[] arg){
        int x = 3;
        if (x > 2) {
            System.out.print("a");
        }
        while (x > 0){
            x = x - 1;
            System.out.print("-");
            if (x == 2){
            System.out.print("b c");
        }
            if (x == 1){
                System.out.print("d");
                x = x - 1;
            } 
        }
        System.out.println();
    }
} 
