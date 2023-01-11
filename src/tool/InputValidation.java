/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

/**
 *
 * @author ASUS
 */
public class InputValidation {

    public static boolean checkQuantity(int x) {

        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkPrice(double x) {
        if (x > 0 && x <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean zero(int x) {
        if (x == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDuration(int x) {
        if (x >= 6 && x <= 36) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkCode(String x) {
        String pattern = "TP\\d{3}";
        if (x.matches(pattern)) {
            return true;
        }
        return false;
    }

    public static boolean checkName(String x) {

        if (x.length() > 9 && x.length() < 26) {
            return true;

        } else {
            return false;
        }
    }
//    public static boolean checkCOde(String x){
//        int index=-1;
//               index = this.;
//        
//    }
}
