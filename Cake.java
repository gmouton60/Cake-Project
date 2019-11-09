/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakeproject;
//Student Name: Gerald Mouton
//LSU ID: 894569516
//Lab Section: Lab 1
//Assignment: Lab 3
//Submission Time: 5:10
/**
 *
 * @author gmouto6
 */
public class Cake {
    //public variables so children classes can inherit them
    public String flavor;
    public int tiers;
    public double price;
    //constructor that initializes the public member variables
    public Cake(String flavor, int tiers, double price)
    {
        this.flavor= flavor;
        this.tiers = tiers;
        this.price= price;
    }
    //prints the message after the variables have been initialized
    public void printInvoice()
    {   
        System.out.println("A "+ tiers + " tier "+ flavor+ " cake. The price is $"+ price+ ". Issued on:"+ java.time.LocalDate.now() );
    }
    //prints a thank you message that can be used my child classes
    public void printCard()
    {
        System.out.println("Thank you for choosing us!");
    }
}
