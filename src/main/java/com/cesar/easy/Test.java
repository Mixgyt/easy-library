package com.cesar.easy;

/**
 *Clase con un metodo ejecutable {@code main} que sirve para probar las funcionalidades de la libreria
 * @author Mixgyt
 */
public class Test {

    public static void main(String[] args) {
        Console.ForegroundColor = ConsoleColor.White;
        Console.BackgroundColor = ConsoleColor.Green;
        Console.Write(Util.Round(100.5651382F,3)); 
        Console.ResetColor();
        Console.Write("a");
        /*int[][] n = new int[3][3];
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n[0].length; j++){
             Console.WriteLine("Ingrese el numero de "+i+" , "+j);
             while(true){
                 var parser = Util.ToInt(Console.ReadLine());
                 if(parser.tryParse){
                     n[i][j] = parser.result;
                     break;
                 }
                 Console.WriteLine("Error formato invalido\nVuelva a ingresar el numero");
             }   
            }
        }
        
        Console.ForegroundColor = ConsoleColor.White;
        Console.BackgroundColor = ConsoleColor.Black;
        for (int i = 0; i < n.length; i++) {
            Console.Write("| ");
            for (int j = 0; j < n[0].length; j++) {
                Console.WriteLine(n[i][j]+" ");
            }
            Console.WriteLine("|");
        }*/
    }
}
