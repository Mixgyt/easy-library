package com.cesar.easy;

/**
 *Clase con un metodo ejecutable {@code main} que sirve para probar las funcionalidades de la libreria
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
        Console.BackgroundColor = ConsoleColor.Green;
        Console.WriteLine(Util.Min(ar));
        Console.ForegroundColor = ConsoleColor.Purple;
        Console.WriteLine(Util.Min(ar));
        Console.BackgroundColor = ConsoleColor.Red;
        Console.ForegroundColor = ConsoleColor.White;
        Console.WriteLine(Util.Min(ar)+"aaaaa");
        Console.ResetColor();
        Console.WriteLine(Util.Min(ar));
    }
}
