/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Daudzsturis {
    
    public double maluSkaits; //int
    public double malasGarums;
   
   
    public void Perimetrs(){
        Scanner skaits = new Scanner(System.in);
        System.out.println("Ievadi skaitli malu skaitu: ");
        double malas = skaits.nextInt();
        
        Scanner garums = new Scanner(System.in);
        System.out.println("Ievadi skaitli malas garums: ");
        double mgarums = garums.nextInt();
        
        maluSkaits=malas;
        malasGarums=mgarums;
        
        if (malas==3){
            System.out.println("Figura trijsturis! Perimetrs: "+mgarums*malas);
        }
        else if (malas==4){
            System.out.println("Figura kvadrats! Perimetrs: "+mgarums*malas);
        }
        else if (malas==5){
            System.out.println("Figura piecsturis! Perimetrs: "+mgarums*malas);
        }
        else{
            System.out.println("Nepareiza vertiba!");
        }
    }
}
