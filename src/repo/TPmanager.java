/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import model.TProduct;
import tool.InputValidation;

/**
 *
 * @author ASUS
 */
public class TPmanager implements ICrud {
//biến chứa các item

    private Vector<TProduct> listTP = new Vector<TProduct>();

    public TPmanager() {
    }

    public TPmanager(Vector<TProduct> listTP) {
        this.listTP = listTP;
    }

    public Vector<TProduct> getListTP() {
        return listTP;
    }

    public void setListTP(Vector<TProduct> listTP) {
        this.listTP = listTP;
    }

    //cai dat 5 p/t the huien tinh năng CRUD
    //quanly item trên biến
    public void create() {
        Scanner sc = new Scanner(System.in);
        //code
        String pCode = null;
        boolean cont = false;
        do {
            try {

                System.out.println("Input code: ");
                pCode = sc.nextLine();
                if (InputValidation.checkCode(pCode) == false) {
                    throw new Exception();
                } else {
                    for (TProduct d : listTP) {
                        if (pCode.equals(d.getpCode())) {
                            throw new Exception();

                        }
                    }
                }
                cont = false;
            } catch (Exception e) {
                System.out.println("Invalid code");
                cont = true;
            }
        } while (cont);

//        do {
//            try {
//                System.out.print("Enter code [TPxxx]:");
//                pCode = sc.nextLine();
//                //check code trung 
//                for (TProduct d : listTP) {
//                    if (InputValidation.checkCode(pCode) == false && pCode.equals(d.getpCode())) {
//                        throw new Exception();
//                    }
//                    cont = false;
//                }
//            } catch (Exception e) {
//                System.out.println("wrong");
//                cont = true;
//            }
//        } while (cont);
        //name
        boolean cont3 = false;
        String pName = null;
        do {
            try {
                System.out.println("Input name: ");
                pName = sc.nextLine();
                if (InputValidation.checkName(pName) == false) {
                    throw new Exception();
                }
                cont3 = false;
            } catch (Exception e) {
                System.out.println("Invalid name ");
                cont3 = true;
            }
        } while (cont3);
        //duration
        int Duration = 0;
        boolean cont4 = false;
        do {
            try {
                System.out.println("Input duration :");
                Duration = Integer.parseInt(sc.nextLine());
                if (InputValidation.checkDuration(Duration) == false) {
                    throw new Exception();
                }
                cont4 = false;
            } catch (Exception e) {
                System.out.println("Invalid duration ");
                cont4 = true;
            }
        } while (cont4);
        //quantity
        int Quantity = 0;
        boolean cont2 = false;
        do {
            try {
                System.out.println("Input quantity: ");
                Quantity = Integer.parseInt(sc.nextLine());
                if (InputValidation.checkQuantity(Quantity) == false) {
                    throw new Exception();
                }
                cont2 = false;
            } catch (Exception e) {
                System.out.println("Invalid quantity ");
                cont2 = true;
            }
        } while (cont2);
        //price
        boolean cont5 = false;
        double Price = 0;
        do {
            try {
                System.out.println("Input unit price: ");
                Price = Double.parseDouble(sc.nextLine());
                if (InputValidation.checkPrice(Price) == false) {
                    throw new Exception();
                }
                cont5 = false;
            } catch (Exception e) {
                System.out.println("Invalid unit price");
                cont5 = true;
            }
        } while (cont5);
        //khoi tao doi tuong TP
        TProduct c = new TProduct(pCode, pName, Quantity, Duration, Price);
        //them vao list
        listTP.add(c);
    }

    public void readList() {
        if (listTP.isEmpty()) {
            System.out.println("No thing here");
        } else {
            System.out.println("List product in shop: ");
            for (TProduct d : listTP) {
                System.out.println(d);
                // listTP.forEach((d) -> {
                // System.out.println(d);}
            }
        }

    }

    public void detail() {
        Scanner sc = new Scanner(System.in);
        //code
        String pCode = null;
        boolean check = true;
        boolean found = true;
        do {
            System.out.println("Input code:");
            pCode = sc.nextLine();
            for (TProduct d : listTP) {
                if (d.getpCode().equals(pCode)) {
                    System.out.println(d);
                    check = false;
                    found = false;
                }
            }
            if (found == true) {
                System.out.println("Nothing here");
                break;
            }
        } while (check);

    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        //code
        String pCode = null;
        boolean check = true;
        boolean found = true;
        do {
            System.out.println("Input Code:");
            pCode = sc.nextLine();
            for (TProduct d : listTP) {
                if (d.getpCode().equals(pCode)) {
                    check = false;
                    found = false;
                    //name
                    boolean cont3 = false;
                    String pName = null;
                    do {
                        try {
                            System.out.println(" Input name: ");
                            pName = sc.nextLine();
                            if (pName.isEmpty()) {
                                break;
                            } else if (InputValidation.checkName(pName) == false) {
                                throw new Exception();
                            } else {
                                d.setpName(pName);
                                cont3 = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid name ");
                            cont3 = true;
                        }
                    } while (cont3);
                    //duration
                    int Duration = 0;
                    boolean cont4 = false;
                    do {
                        try {
                            System.out.println("Input duration :");
                            String s = sc.nextLine();
                            if (s.isEmpty()) {
                                break;
                            }
                            Duration = Integer.parseInt(s);
                            if (InputValidation.checkDuration(Duration) == false) {
                                throw new Exception();
                            } else {
                                cont4 = false;
                                d.setpDuration(Duration);
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid duration ");
                            cont4 = true;
                        }
                    } while (cont4);
                    //quantity
                    int Quantity = 0;
                    boolean cont2 = false;
                    do {
                        try {
                            System.out.println("Input quantity: ");
                            String ab = sc.nextLine();
                            if (ab.isEmpty()) {
                                break;
                            }
                            Quantity = Integer.parseInt(ab);
                            if (InputValidation.checkQuantity(Quantity) == false) {
                                throw new Exception();
                            } else {
                                d.setpQuantity(Quantity);
                                cont2 = false;
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid quantity ");
                            cont2 = true;
                        }
                    } while (cont2);
                    //price
                    boolean cont5 = false;
                    double Price = 0;
                    do {
                        try {
                            System.out.println("Input unit price: ");
                            String ab = sc.nextLine();
                            if (ab.isEmpty()) {
                                break;
                            }
                            Price = Double.parseDouble(ab);
                            if (InputValidation.checkPrice(Price) == false) {
                                throw new Exception();
                            } else {
                                d.setpPrice(Price);
                                cont5 = false;
                            }

                        } catch (Exception e) {
                            System.out.println("Invalid unit price ");
                            cont5 = true;
                        }
                    } while (cont5);
                }

            }
            if (found == true) {
                System.out.println("Nothing here");
                break;
            }
        } while (check);
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        //code

        //check
//        for (TProduct p : listTP) {
//        if (p.getpCode().equals(pCode)) {
//            System.out.println("nothing here");
//        }
        //delete
        boolean check = true;
        boolean found = true;

        do {
            String pCode = null;
            System.out.println("Input code :");
            pCode = sc.nextLine();
            for (int i = 0; i < listTP.size(); i++) {
                if (listTP.get(i).getpCode().equals(pCode)) {

                    listTP.remove(i);
                    System.out.println("Delete " + pCode + " successfully");
                    check = false;
                    found = false;
                }
            }
            if (found == true) {
                System.out.println("Nothing here");
                break;
            }
        } while (check);
    }

    //phuong fuc bo tro
    public boolean checkDuplicate(String newCode) {
        for (TProduct p : listTP) {
            if (p.getpCode().equals(newCode)) {
                return true;
            }
        }
        return false;
    }

    //tim bang name
    public void searchByName() {
        boolean check = true;
        boolean found = true;
       
            System.out.println("Input name: ");
            Scanner sc = new Scanner(System.in);
            String pName = sc.nextLine();
            String pattern = ".*" + pName.toLowerCase() + ".*";
            for (TProduct p : listTP) {
                if (p.getpName().toLowerCase().matches(pattern)) {
                    found = false;
                }
            }
            if (found == false) {
                System.out.println("List product name in shop:");
            }
            for (TProduct p : listTP) {
                if (p.getpName().toLowerCase().matches(pattern)) {
                    System.out.println(p);
                    check = false;                   
                }
            }
            if (found == true) {
                System.out.println("Nothing here");               
            }
        
    }

    public void sortByPrice() {
        System.out.println("List product by unit price ascending in shop");
        Collections.sort(listTP, TProduct.compareByPrice);
        for (TProduct p : listTP) {
            System.out.println(p);
        }
    }

    public void listQuantity() {
        System.out.println("Nothing here");
        for (TProduct p : listTP) {
            if (p.getpQuantity() == 0) {
                System.out.println(p);
            }
        }
    }

    public void sortByQuantity() {
        System.out.println("List product by quantity descending in shop");
        Collections.sort(listTP, TProduct.compareByQuantity);
        for (TProduct p : listTP) {
            System.out.println(p);
        }
    }

}
