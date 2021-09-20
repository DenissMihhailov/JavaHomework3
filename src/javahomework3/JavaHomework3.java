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
        
        
        
        switch(year%100) {
            case 84: case 85: case 86: case 87: case 88: case 89: case 90:  case 91: case 92: case 93: case 94: case 95: 
            color="зеленый";
            case 96: case 97: case 98: case 99: case 00: case 01: case 02:  case 03: case 04: case 05: case 06: case 07: 
            color="Красный";
            break;
            case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: 
            color="Желтый";
            break;
            case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31: 
            color="Белый";
            break;
            case 32: case 33: case 34: case 35: case 36: case 39: case 40: case 41: case 42: case 43: case 44: case 45: 
            color="Черный";
            break;
            default:
            color="";
            break;
            
        switch(animal) {
            case 84: case 96: case 8: case 20: case 32: case 44: case 45:
            animal=1+animal;
            case 85: case 97: case 9: case 21: case 33:
            animal=2+animal;
            case 86: case 98: case 10: case 22: case 34:
            animal=3+animal;
            case 87: case 99: case 11: case 23: case 35:
            animal=4+animal;
            case 88: case 00: case 12: case 24: case 36:
            animal=5+animal;
            case 89: case 01: case 13: case 25: case 37:
            animal=6+animal;
            case 90: case 02: case 14: case 26: case 38:
            animal=7+animal;
            case 91: case 03: case 15: case 27: case 39:
            animal=8+animal;
            case 92: case 04: case 16: case 28: case 40:
            animal=9+animal;
            case 93: case 05: case 17: case 29: case 41:
            animal=10+animal;
            case 94: case 06: case 18: case 30: case 42:
            animal=11+animal;
            case 95: case 07: case 19: case 31: case 43:
            animal=12+animal;
            default:
            animal=13+animal;
            
            System.out.println("Год");
            System.out.println(color);
            
            
            if (color==1) {
                System.out.println("зеленой");
            if (color==2) {
                System.out.println("красной");
            if (color==3) {
                System.out.println("желтой");
            if (color==4) {
                System.out.println("белой");
            if (color==5) {
                System.out.println("черной");
            if(color==6){
                System.out.println("Ошибка");
            
            }
            }
            }
            }
            }
            }
        }
    }
        
    
}
}