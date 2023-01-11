/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.Menu.menu;
import java.util.Scanner;
import repo.TPmanager;

/**
 *
 * @author ASUS
 */
public class Se160754 {

    public static void main(String[] args) {
        int choice = 0;
        TPmanager Shop = new TPmanager();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Shop.create();
                    break;
                case 2:
                    //                if (Shop != null) {
                    Shop.readList();
                    //               } else {
                    //                System.out.println(" you need to create an object");
                    //            }
                    break;
                case 3:
                    //           if (Shop != null) {
                    Shop.detail();
                    //             } else {
                    //                System.out.println(" you need to create an object");
                    //           }

                    break;
                case 4:
                    //            if (Shop != null) {
                    Shop.update();
                    //           } else {
                    //              System.out.println(" you need to create an object");
                    //          }
                    break;
                case 5:
//                    if (Shop != null) {
                    Shop.delete();
                    //            } else {
                    //               System.out.println(" you need to create an object");

                    //           }
                    break;
                case 6:
                    Shop.searchByName();
                    break;
                case 7:
                      Shop.sortByPrice();
                    break;
                case 8:
                    Shop.sortByQuantity();
                    break;
                case 9:
                    Shop.listQuantity();
                default:
                    break;
            }
        } while (choice < 10 && choice > 0);

    }
}
