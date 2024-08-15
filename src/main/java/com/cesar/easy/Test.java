/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cesar.easy;

/**
 *
 * @author Mixgyt
 */
public class Test {

    public static void main(String[] args) {
        var a = Console.ReadLine();
        
        var parse = Util.ToInt(a);
        if(parse.tryParse){
            Console.WriteLine(parse.result);
        }
        
        int[] ar = new int[]{10,22,4,1,22};
        Console.WriteLine(Util.Max(ar));
        Console.WriteLine(Util.Min(ar));
        int b = Util.Max(ar);
    }
}
