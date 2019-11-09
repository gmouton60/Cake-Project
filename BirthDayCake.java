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
public class BirthDayCake extends Cake{
    //private class variables for the birthday person
    private String firstName;
    private int age;
    //constructor for the Birthday Cake class uses super to inherit parent public variables
    public BirthDayCake(String flavor, int tiers, double price, String firstName, int age)
    {
        super(flavor,tiers,price);
        this.firstName=firstName;
        this.age=age;
    }
    //Prints a happy birthday message as well as overrides the parent class's print card
    @Override
    public void printCard()
    {
        System.out.println("Happy Birthday to "+ firstName+ "! You just turned "+ age+ " :)");
        super.printCard();
    }
}
