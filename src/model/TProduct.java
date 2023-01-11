/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class TProduct  {

    private String pCode;
    private String pName;
    private int pQuantity;
    private int pDuration;
    private double pPrice;

    @Override
    public String toString() {
        return "Code: " + pCode + "; Name: " + pName + "; Duration: " + pDuration + "; Quantity: " + pQuantity +  "; Price: " + pPrice;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public int getpDuration() {
        return pDuration;
    }

    public void setpDuration(int pDuration) {
        this.pDuration = pDuration;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public TProduct(String pCode, String pName, int pQuantity, int pDuration, double pPrice) {
        this.pCode = pCode;
        this.pName = pName;
        this.pQuantity = pQuantity;
        this.pDuration = pDuration;
        this.pPrice = pPrice;
    }

    public TProduct() {
    }

    
   public static Comparator compareByPrice = new Comparator() {        
        @Override
        public int compare(Object o1, Object o2) {       
                TProduct p1 = (TProduct) o1;
        TProduct p2 = (TProduct) o2;
        double d = p1.getpPrice() - p2.getpPrice();
        if (d > 0) {
            return 1;
        }
        if (d == 0) {
            return 0;
        }
        return -1;
    }
        
    };
  public static Comparator compareByQuantity = new Comparator() {        
        @Override
        public int compare(Object o1, Object o2) {       
                TProduct p1 = (TProduct) o1;
        TProduct p2 = (TProduct) o2;
        int d = p1.getpQuantity()- p2.getpQuantity();
        if (d < 0) {
            return 1;
        }
        if (d == 0) {
            return 0;
        }
        return -1;
    }
        
    };

 
}
  

 
