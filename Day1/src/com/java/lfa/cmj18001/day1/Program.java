/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lfa.cmj18001.day1;

import com.java.lfa.cmj18001.day1.command.AddCommand;
import com.java.lfa.cmj18001.day1.command.MathCommand;
import com.java.lfa.cmj18001.day1.util.Calculator;

public class Program {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        MathCommand cmd = new AddCommand();
        System.out.println(cmd.calculate(2, 4));

        System.out.println(cal.sumRecursive(10));
    }
}

/*  double x = 20, y = 25;
       // if (choice == 1) {
         //   System.out.println(cal.add(x, y));
       // } else if (choice == 2);
        //System.out.println(cal.sub(x, y));
        
        String result = cal.buyChewingum(9);
        System.out.println(result);
        
        
        
        
        
        
        
       // double x = 2, y = 3;
        //  int choice = 3;
       // if (choice == 1) {
          //  System.out.println(x + y);
       // } else if (choice == 2) {
        //    System.out.println(x - y);
       // } else if (choice == 3) {
          //  System.out.println(x * y);
       // } else if (choice == 4) {
          //  System.out.println(x / y);
       // } else {
            System.out.println("invalid code");
        }
        
    }
    
 */
