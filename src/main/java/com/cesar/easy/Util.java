package com.cesar.easy;

/**
 *
 * @author Mixgyt
 */
public class Util {
    /**
     * Metodo para convertir un {@code String} a {@code Integer}
     * @param str Cadena que sera convertida
     * @return {@code Parser<Integer>}
    */
    public static Parser<Integer> ToInt(String str){
        return new Parser<Integer>(str,Parser.Tipos.I);
    }
    
    /**
     * Metodo para convertir un {@code String} a {@code Double}
     * @param str Cadena que sera convertida
     * @return {@code Parser<Double>}
    */
    public static Parser<Double> ToDouble(String str){
        return new Parser<Double>(str,Parser.Tipos.D);
    }
    
    /**
     * Metodo para convertir un {@code String} a {@code Float}
     * @param str Cadena que sera convertida
     * @return {@code Parser<Float>}
    */
    public static Parser<Float> ToFloat(String str){
        return new Parser<Float>(str,Parser.Tipos.F);
    }
    
    /**
     * Obtiene el valor maximo de un arreglo de numeros
     * @param array 
     * @return {@code int} {@code Integer}
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
     * Obtiene el valor maximo de un arreglo de numeros
     * @param array 
     * @return {@code double} {@code Double}
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
    
    /**
     * Obtiene el valor maximo de un arreglo de numeros
     * @param array
     * @return {@code float} {@code Float}
     */
    public static Float Max(float[] array){
        float max = array[0];
        for(var num : array){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
    
    /**
     * Obtiene el valor minimo de un arreglo de numeros
     * @param array
     * @return {@code int} {@code Integer}
     */
    public static Integer Min(int[] array){
        int min = array[0];
        for(var num : array){
            if(min > num){
                min = num;
            }
        }
        return min;
    }
    
    /**
     * Obtiene el valor minimo de un arreglo de numeros
     * @param array
     * @return {@code double} {@code Double}
     */
    public static Double Min(double[] array){
        double min = array[0];
        for(var num : array){
            if(min > num){
                min = num;
            }
        }
        return min;
    }
    
    /**
     * Obtiene el valor minimo de un arreglo de numeros
     * @param array
     * @return {@code float} {@code Float}
     */
    public static Float Min(float[] array){
        float min = array[0];
        for(var num : array){
            if(min > num){
                min = num;
            }
        }
        return min;
    }
    
    /**
     * Obtiene la sumatoria de todos los valores de un arreglo de numeros
     * @param array
     * @return {@code int} {@code Integer}
     */
    public static Integer Sum(int[] array){
        int sum = 0;
        for(var num : array){
            sum += num;
        }
        return sum;
    }
    
    /**
     * Obtiene la sumatoria de todos los valores de un arreglo de numeros
     * @param array
     * @return {@code double} {@code Double}
     */
    public static Double Sum(double[] array){
        double sum = 0;
        for(var num : array){
            sum += num;
        }
        return sum;
    }
    
    /**
     * Obtiene la sumatoria de todos los valores de un arreglo de numeros
     * @param array
     * @return {@code float} {@code Float}
     */
    public static Float Sum(float[] array){
        float sum = 0;
        for(var num : array){
            sum += num;
        }
        return sum;
    }
    
    /**
     * Metodo para calcular el factorial de un numero
     * @param num {@code int}
     * @return {@code Integer} {@code int}
     */
    public static Long Factor(int num){
        long factor = 1;
        if(num < 0){
            factor *= -1;
            num = Math.abs(num);
        }
        for(int i = 1; i <= num; i++){
            factor *= i;
        }
        return factor;
    }
    
    /**
     * Funcion para redondear numeros a un numero de cifras significativas especificas
     * @param num Numero {@code Double} a readondear
     * @param decimals Numero de decimales a los que se redondearan
     * @return 
     */
    public static Double Round(double num, int decimals){
        double exp = Math.pow(10, decimals);
        return Math.round((num*exp))/exp;
    }
    
    /**
     * Funcion para redondear numeros a un numero de cifras significativas especificas
     * @param num Numero {@code Float} a readondear
     * @param decimals Numero de decimales a los que se redondearan
     * @return 
     */
    public static Double Round(float num, int decimals){
        double exp = Math.pow(10, decimals);
        return Math.round((num*exp))/exp;
    }
}
