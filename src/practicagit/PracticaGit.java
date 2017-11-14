/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

import java.util.Scanner;

/**
 *
 * @author edher
 */
public class PracticaGit {

   double radio, area, pi;
   Scanner sc = new Scanner(System.in);
   public PracticaGit(){
       radio = 0;
       area = 0;
       pi = Math.PI;
       }
   
   public void leer(){
       System.out.println("area");
       
       radio= sc.nextDouble();
   }
   
   public void saca(){
       area=Math.pow(pi*radio, 2);
       
       System.out.println("Area "+ area);
   }
    
    public static void main(String[] args) {
        PracticaGit formula = new PracticaGit();
        formula.leer();
        formula.saca();
    }
    
}
