/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

public class Desas {
    
    public  String simbols = "";
    private String[][] laukums = new String[3][3];
    
    public void Spelet(){
        InitArray();
        Draw();
        Lauks3();
        Speletajs();
    }
    
     public void Spelet2(){
        Izvele();
        Draw();
        Lauks3();
    }
    
    private void Draw(){

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(laukums[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
    
    private void InitArray(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                laukums[i][j] = "-";
            }
        }
    }
    
    public void Lauks3(){
    String [][]laukums3 = {{" 1 ", " 2 ", " 3 "}, 
                           {" 4 ", " 5 ", " 6 "},
                           {" 7 ", " 8 ", " 9 "}};
    
    for(int i = 0; i < 3; i++){
            
            for(int j = 0; j<3;j++){
                System.out.print(laukums3[i][j]);
            }
            System.out.println();
        }
    System.out.println();
    System.out.println();
    }
    public void Speletajs(){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Ievadi simbolu: ");
    String simbolsIevade = sc.next();
    simbols = simbolsIevade.toUpperCase();
    
    
    if (simbols.equals("X")||simbols.equals("x")){
        System.out.println("Spelee: "+simbols);
    }
    else if (simbols.equals("O")||simbols.equals("o")){
        System.out.println("Spelee: "+simbols);
    }
    else{
        System.out.println("Nepareiza vertiba!");
        Speletajs();
    }
}
    public void Maina(){
        if (simbols.equals("X")||simbols.equals("x")){
            simbols="O";
            System.out.println("Spelee: "+simbols);
        }
        else {
            simbols="X";
            System.out.println("Spelee: "+simbols);
        }
    }
    
    public void Izvele(){
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ievadi skaitli (1-9): ");
        int skaitlis = sc1.nextInt();
        
        
        if(skaitlis>0&&skaitlis<10){
        switch (skaitlis){
            case 1:  laukums[0][0] = simbols;
            break;
            case 2: laukums[0][1] = simbols;
            break;
            case 3: laukums[0][2] = simbols;
            break;
            case 4: laukums[1][0] = simbols;
            break;
            case 5: laukums[1][1] = simbols;
            break;
            case 6: laukums[1][2] = simbols;
            break;
            case 7: laukums[2][0] = simbols;
            break;
            case 8: laukums[2][1] = simbols;
            break;
            case 9: laukums[2][2] = simbols;
            break;
        };
        }
        else{
            System.out.println("Nepareiza vertiba!");
            Izvele();
        }
        
        
        Draw();
        Maina();
    }
    
    public void Parbaude(){
       for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!laukums[i][j].equals("-")){
                    System.out.println("Nepareiza vertiba!!!!");
                }
            }
    }
    }
}
