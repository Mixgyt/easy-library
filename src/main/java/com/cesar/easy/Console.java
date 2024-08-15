package com.cesar.easy;

import java.util.Scanner;

/**
 *
 * @author Mixgyt
 */
public class Console {
    public static void WriteLine(Object x){
        System.out.println(x);
    }
    
    public static String ReadLine(){
        Scanner in = new Scanner(System.in);
        String entry = in.nextLine();
        return entry;
    }
}
