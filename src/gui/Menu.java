/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ASUS
 */
public class Menu {

    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("- Option 1: Adding new product \n"
                + "- Option 2: Print product list \n"
                + "- Option 3: Print product details by code \n"
                + "- Option 4: Update product information by code \n"
                + "- Option 5: Remove product from list by id \n"
                + "- Option 6: Search product like name \n"
                + "- Option 7: List product by unit price (ascending) \n"
                + "- Option 8: List product by quantity (descending) \n"
                + "- Option 9: List all products whose quantity are zero \n"
                + "- Other: Exit program");
        System.out.println("----------------------------");
    }
}
