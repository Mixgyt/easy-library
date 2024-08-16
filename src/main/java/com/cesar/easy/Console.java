package com.cesar.easy;

import java.util.Scanner;

/**
 *Clase {@code Console} basada en la clase {@code Console} de C#
 * @author Mixgyt
 */
public class Console {
    
    /**Color del texto mostrado en consola*/
    public static ConsoleColor ForegroundColor;
    /**Color del fondo de texto mostrado en consola */
    public static ConsoleColor BackgroundColor;
    private static final String ResetString = "\u001B[0m";

    /**
     * Metodo que imprime en consola
     * @param x Parametro que sera impreso por el metodo
     */
    public static void WriteLine(Object x){
        System.out.println(BackColor()+ForeColor()+x+ResetString);
    }
    
    /**
     * Metodo que permite leer una linea de texto que el usuario escriba en consola
     * @return {@code String}
     */
    public static String ReadLine(){
        Scanner in = new Scanner(System.in);
        String entry = in.nextLine();
        in.close();
        return entry;
    }

    /**
     * Metodo que resetea los colores de fondo y del texto de la consola
     */
    public static void ResetColor(){
        BackgroundColor = null;
        ForegroundColor = null;
    }

    private static String ForeColor(){
        switch (ForegroundColor) {
            case ConsoleColor.Black:
                return "\u001B[30m";
            case ConsoleColor.Red:
                return "\u001B[31m";
            case ConsoleColor.Green:
                return "\u001B[32m";
            case ConsoleColor.Yellow:
                return "\u001B[33m";
            case ConsoleColor.Blue:
                return "\u001B[34m";
            case ConsoleColor.Purple:
                return "\u001B[35m";
            case ConsoleColor.Cyan:
                return "\u001B[36m";
            case ConsoleColor.White:
                return "\u001B[37m";
            case null:
                return "";
            default:
                return "";
        }
    }

    private static String BackColor(){
        switch (BackgroundColor) {
            case ConsoleColor.Black:
                return "\u001B[40m";
            case ConsoleColor.Red:
                return "\u001B[41m";
            case ConsoleColor.Green:
                return "\u001B[42m";
            case ConsoleColor.Yellow:
                return "\u001B[43m";
            case ConsoleColor.Blue:
                return "\u001B[44m";
            case ConsoleColor.Purple:
                return "\u001B[45m";
            case ConsoleColor.Cyan:
                return "\u001B[46m";
            case ConsoleColor.White:
                return "\u001B[47m";
            case null:
                return "";
            default:
                return "";
        }
    }
}
