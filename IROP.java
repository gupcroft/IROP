/*
 * Java Programming (SDEV 200) 
 * Student: Enrique Marrufo
 * Date: Jul 21, 2016
 * Description: Programming Exercise 
 *
 */
package irop;

import irop.Bread.BreadType;

public class IROP {

    public static void main(String[] args) {
        Bread myBread = new Bread(BreadType.BreadSticks) {};
        
        // Getting all variables values
        System.out.println(myBread.getName());
        System.out.println("$" + myBread.getPrice());
        System.out.println(myBread.getDescription());
        
        // Displaying toString
        System.out.println(myBread.toString());

    }// Main
}// IROP
