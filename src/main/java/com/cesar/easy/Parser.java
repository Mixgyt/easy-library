package com.cesar.easy;

/**
 * Clase que convierte un {@code String} a {@code Numeric}
 * @author Mixgyt
 * @param <T>
 */
public class Parser <T>{
    public T result;
    public boolean tryParse;
    public String status;
    
    /**
     * 
     * @param a Cadena que sera previamente convertida
     * @param t Tipo al que debera convertir
     * @see unchecked Se ocultan las advertencias de parseo de los numeros
     */
    @SuppressWarnings("unchecked")
    public Parser(String a, Tipos t){
        try{
            switch (t) {
                case I -> {
                    result = (T)(Number)Integer.parseInt(a);
                    tryParse = true;
                }
                case D -> {
                    result = (T)(Number)Double.parseDouble(a);
                    tryParse = true;
                }
                case F -> {
                    result = (T)(Number)Float.parseFloat(a);
                    tryParse = true;
                }
            }
        }
        catch(Exception e){
            result = (T)(Number)0;
            status = e.getMessage();
            tryParse = false;
        }
    }
    
    enum Tipos{
        I,
        D,
        F
    }
}
