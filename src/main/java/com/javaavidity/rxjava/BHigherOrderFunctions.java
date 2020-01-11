package com.javaavidity.rxjava;


import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author ramakanth
 * Functions that take functions as param and return functions
 */
public class BHigherOrderFunctions {
    public static void main(String[] args) {
       Supplier<String> lazyOperation=concat("Rama","Kanth",String::toUpperCase);

        System.out.println(lazyOperation.get());
    }
    public static Supplier<String> concat(final String a, final String b, final Function<String,String> func){
        return ()->{
            String aa=a;
            String bb=b;
            if(func!=null){
                aa=func.apply(a);
                bb=func.apply(b);
                System.out.println("inside logic");
            }
            return aa+bb;
        };
    }
}
