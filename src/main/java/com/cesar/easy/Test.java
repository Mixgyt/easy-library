package com.cesar.easy;
/**
 *Clase con un metodo ejecutable {@code main} que sirve para probar las funcionalidades de la libreria
 * @author Mixgyt
 */
public class Test {

    public static void main(String[] args) {
        int[][] n = new int[3][3];
        
        for(int i = 0; i < n.length; i++){
            
            for(int j = 0; j < n[0].length; j++){
                
             Console.WriteLine("Ingrese el numero de "+i+" , "+j);
             boolean correctValue = true;
             
             while(correctValue){
                 String v = Console.ReadLine();
                 var parser = Util.ToInt(v);
                 if(parser.tryParse){
                     n[i][j] = parser.result;
                     correctValue = false;
                 }
                 else{
                  Console.WriteLine("Error formato invalido\nVuelva a ingresar el numero");   
                 }
             }   
            }
        }
        
        Console.ForegroundColor = ConsoleColor.White;
        Console.BackgroundColor = ConsoleColor.Cyan;
        for (int i = 0; i < n.length; i++) {
            Console.Write("| ");
            for (int j = 0; j < n[0].length; j++) {
                Console.Write(n[i][j]+" ");
            }
            Console.WriteLine("|");
        }
    }
}
