/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class piemers {
    
    private double Saskaitisana(double skaitlis, double skaitlis2)
    {
        return skaitlis + skaitlis2;
    }
    private double Atnemsana (double skaitlis, double skaitlis2)
    {
        return skaitlis - skaitlis2;
    }   
    
    public void Izsaukums(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Ievadi skaitli: ");
        int skaitlis = obj.nextInt();
        
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Ievadi skaitli: ");
        int skaitlis2 = obj2.nextInt();
        
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Ievadi darbibu:(+/-)");
        String darbiba = obj3.nextLine();
        
        Saskaitisana calc = new Saskaitisana();
        Atnemsana calc2 = new Atnemsana();
        
        
        if (darbiba.equals("+"))
        {
            System.out.println("Summa: "+Saskaitisana(skaitlis, skaitlis2));
        }
        else if (darbiba.equals("-"))
        {
            System.out.println("Starpiba: "+Atnemsana(skaitlis, skaitlis2));
        }
        else{
            System.out.println("Nepareiza vertiba!");
        }
    }
    
    
}
