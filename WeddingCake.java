/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakeproject;
/**
 *
 * @author gmouto6
 */
public class WeddingCake extends Cake {
    //private variables for the bride and grooms names
    private String bridesFirstName;
    private String groomsFirstName;
    
    //constructor for the Wedding Cake class uses super to inherit parent public variables
    public WeddingCake(String flavor, int tiers, double price, String brideName, String groomName)
    {
        super(flavor,tiers,price);
        this.bridesFirstName=brideName;
        this.groomsFirstName=groomName;
    }
    //Prints a congratulations message as well as overrides the parent class's print card
    @Override
    public void printCard()
    {
        System.out.println("Happy Wedding to "+ bridesFirstName+ " and "+ groomsFirstName+"!");
        super.printCard();
    }
}
