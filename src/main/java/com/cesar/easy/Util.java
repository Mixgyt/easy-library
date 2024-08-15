/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cesar.easy;

/**
 *
 * @author Mixgyt
 */
public class Util {
    /**
     * Metodo para convertir un {@code String} a {@code Integer}
     * @param str Cadena que sera convertida
     * @return {@code Parser}
    */
    public static Parser<Integer> ToInt(String str){
        return new Parser(str,Parser.Tipos.I);
    }
    
    public static Parser<Double> ToDouble(String str){
        return new Parser(str,Parser.Tipos.D);
    }
    
    public static Parser<Float> ToFloat(String str){
        return new Parser(str,Parser.Tipos.F);
    }
    
    /**
     * Obtiene el valor maximo de un arreglo de numeros
     * @param array Arreglo de numeros {@code Integer}
     * @return int, Integer
    */
    public static Integer Max(int[] array){
        int max = array[0];
        for(var num : array){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
    
    /**
     * @param array
     * @return Double, double
     * @see Obtiene el valor maximo de un arreglo de numeros
     */
    public static Double Max(double[] array){
        double max = array[0];
        for(var num : array){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
    
    public static Float Max(float[] array){
        float max = array[0];
        for(var num : array){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
    
    public static Integer Min(int[] array){
        int min = array[0];
        for(var num : array){
            if(min > num){
                min = num;
            }
        }
        return min;
    }
    
    public static Double Min(double[] array){
        double min = array[0];
        for(var num : array){
            if(min > num){
                min = num;
            }
        }
        return min;
    }
    
    public static Float Min(float[] array){
        float min = array[0];
        for(var num : array){
            if(min > num){
                min = num;
            }
        }
        return min;
    }
    
    public static Integer Sum(int[] array){
        int sum = 0;
        for(var num : array){
            sum += num;
        }
        return sum;
    }
    
    public static Double Sum(double[] array){
        double sum = 0;
        for(var num : array){
            sum += num;
        }
        return sum;
    }
    
    public static Float Sum(float[] array){
        float sum = 0;
        for(var num : array){
            sum += num;
        }
        return sum;
    }
}
