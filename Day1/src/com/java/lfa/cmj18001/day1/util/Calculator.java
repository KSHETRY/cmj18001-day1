/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lfa.cmj18001.day1.util;

/**
 *
 * @author mylife
 */
public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double power(double x, double y) {
        double total = 1;
        for (int i = 1; i <= y; i++) {
            total = total * x;
        }
        return total;
    }

    public double sumRecursive(double x) {
        if (x == 0) {
            return 0;
        }
        return x + sumRecursive(x - 1);
    }
}
/*
public String buyChewingum(double money) {
        if (money >= 10 && money<20) {
            return "spout";
        }else if(money>=20) {
            return "bounty";
        }
        return "kismiss";
    }

}
*/
