/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Piemers {
    
    public void Divdimensiju(){
        
        Scanner sc = new Scanner(System.in);
    
        int[] OneD = new int[5];
        int [][] TwoD = new int [3][3];
        
        for(int i = 0; i < 2; i++){
            
            for(int j = 0; j<2;j++){
                System.out.println("Ievadiet elementu: ");
                TwoD[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < 2; i++){
            
            for(int j = 0; j<2;j++){
                System.out.print(TwoD[i][j]);
            }
            System.out.println();
        }
}
    
}
