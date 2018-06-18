/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a sentens");
        while(kb.hasNext()){
        
        String line = kb.nextLine();
        String arr[]=line.split("");
                
               
                
                
           
        int word=0;
        int i;
        for( i=0;i<arr.length;i++)
        {
            word++;
        }
        System.out.println(word);
                
        
        
    }
        
        
        
    }
    
}
