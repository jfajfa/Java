/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Uzdevums {
    public void interfeiss(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Ievadi skaitli: ");
      int skaitlis = sc.nextInt();
      
      System.out.println("Ievadi pakapi: ");
      int pakape = sc.nextInt();
      
      System.out.println("Rezultats ir "+kapinasana(skaitlis, pakape));
    }
    
    private int kapinasana(int skaitlis, int pakape){
        int rezultats = 1;
       
        for (int i = 0; i<pakape; i++)
        {
            rezultats = skaitlis*rezultats;
        }
        
        return rezultats;
    }
    
    public void skaitli(){
        
        
        int [] masivs = new int [5];
        
        masivs [0] = 1;
        masivs [1] = 2;
        masivs [2] = 3;
        masivs [3] = 4;
        masivs [4] = 5;
        
        for (int i = 0; i<masivs.length; i++){
            
            for (int b = 0; b<i; b++){
                System.out.print(masivs[b]);
            }
            
            System.out.println(masivs[i]);
        }
    }
    
    public void masivaIzvade(){
        
       
       
        String[]masivs = new String [4];
        
        /*masivs [0] = "*";
        masivs [1] = "**";
        masivs [2] = "***";
        masivs [3] = "****";
        */
        
        for(int i = 0; i<masivs.length; i++){
            
            if(i==0){
                masivs[i] = "*";
            }
            else{
            masivs[i] = masivs[i-1]+"*";
        }}
        

        for (int i = 0; i<masivs.length; i++){
            
            System.out.println(masivs[i]);
        }
        for (int i = masivs.length -1 ; i>=0; i--){
            
            System.out.println(masivs[i]);
        }
        
        /* cilveks ievada
        int[]masivs = new int [5];
        
        
        for (int i = 0; i<masivs.length;i++){
            System.out.println("Ievadi skaitli: ");
            masivs[i] = sc.nextInt();
        }
        
        for(int i = 0; i<masivs.length;i++){
            System.out.println(masivs[i]);
        }
        */
        /* jau gatavi
        int[]masivs = new int [5];
        masivs [0] = 4;
        masivs [1] = 3;
        masivs [2] = 222;
        masivs [3] = 12;
        masivs [4] = 43;
        
        for(int i = 0; i<masivs.length;i++){
            System.out.println(masivs[i]);
        }
        */
        
    }
}
