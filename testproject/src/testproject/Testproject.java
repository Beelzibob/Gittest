/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author Matthew
 */

import java.io.*; 

public class Testproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        File file = new File("resources/test.txt"); 
  
        try {
        
        BufferedReader br = new BufferedReader(new FileReader(file)); 
 
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
