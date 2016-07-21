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
        
        Pizza myPizza = new Pizza("LARGE", "HAND_TOSSED");
        System.out.println("$" + myPizza.getPrice());
        System.out.println(myPizza.getDescription());
        System.out.println(myPizza.toString());
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        
        Wings myWings = new Wings("boneless", "hot", 20);
        System.out.println(myWings.getQty());
        System.out.println(myWings.getType());
        System.out.println("$" + myWings.getPrice());
        System.out.println(myWings.getDescription());
        System.out.println(myWings.toString());
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        
        Bread myBread = new Bread(BreadType.BreadSticks) {};
        System.out.println(myBread.getName());
        System.out.println("$" + myBread.getPrice());
        System.out.println(myBread.getDescription());
        System.out.println(myBread.toString());

    }// Main
}// IROP
