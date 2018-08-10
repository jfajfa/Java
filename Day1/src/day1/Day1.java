/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli: ");
        double skaitlis1 = sc.nextDouble();
        
        System.out.println("Ievadiet otro skaitli: ");
        double skaitlis2 = sc.nextDouble();
        
        double rezultats = calc.Saskaitisana(skaitlis1, skaitlis2);
        System.out.println("Rezultats ir: "+rezultats);
        
        double rezultats2 = calc.Atnemsana(skaitlis1, skaitlis2);
        System.out.println("Starpiba ir: "+rezultats2);
        
       /** Scanner Pgads = new Scanner(System.in);
        System.out.println("Ievadi pasreizejo gadu:");
        String PGads = Pgads.nextLine();
        //PGads = sc.nextInt();
        
        int PaGads;
        PaGads = Integer.valueOf(PGads);
               
        Scanner gads = new Scanner(System.in);
        System.out.println("Ievadi dzimsanas gadu:");
        String DzGads = gads.nextLine();
        
        int Dz;
        Dz = Integer.valueOf(DzGads);
        int Vecums = PaGads - Dz;
        
        /*
        String ievade = sc.nextLine();
        int a = 3;
        ievade = String.valueOf(a); int uz string
        a = Ineger.valueOf(ievade); string uz int
        
        
        System.out.println("Tavs vecums: " + Vecums);
        * */
        
    }
}