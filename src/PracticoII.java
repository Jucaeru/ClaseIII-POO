/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class PracticoII {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while ( x < 5 ) {
            y = x + y;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
