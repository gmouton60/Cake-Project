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
public class CakeProject {
    public static void main(String args[])
    {
        //makes an object of the wedding cake class and prints the message
        WeddingCake wedCk = new WeddingCake("chocolate", 3, 355.0, "Sarah", "John");
        wedCk.printInvoice();
        wedCk.printCard();
        
        System.out.println();
        
        //makes an object of the Birthday Cake Class and prints the message
        BirthDayCake bdCk = new BirthDayCake("vanilla", 1, 20.0, "Alan", 15);
        bdCk.printInvoice();
        bdCk.printCard();
        
    }
}
