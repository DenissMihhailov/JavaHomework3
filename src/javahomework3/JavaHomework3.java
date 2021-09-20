/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework3;

import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class JavaHomework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Программа для того чтобы узнать название года.");
        System.out.println("-------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year= scanner.nextInt();
        int color=0;
        
        switch(year%100) {
            case 84: case 85: case 86: case 87: case 88: case 89: case 90:  case 91: case 92: case 93: case 94: case 95: 
            color=1;
            case 96: case 97: case 98: case 99: case 00: case 01: case 02:  case 03: case 04: case 05: case 06: case 07: 
            color=2;
            case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: 
            color=3;
            case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31: 
            color=4;
            case 32: case 33: case 34: case 35: case 36: case 39: case 40: case 41: case 42: case 43: case 44: case 45: 
            color=5;
            default:
            color=6;
            
        switch(){
            
        }
    }
        
    
}
