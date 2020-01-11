package com.javaavidity.rxjava;

/**
 * @author ramakanth
 */
public class ASideEffectIllustration {

    private int state=0;

    public int purefunction(int x){
        return x*x;
    }

    public int impurefunction(int x){
        this.state=(++this.state%3);
        return this.state*x;
    }

    public static void main(String[] args) {

        ASideEffectIllustration obj=new ASideEffectIllustration();

        for (int i=0;i<20;i++){
            System.out.println(obj.purefunction(5));
        }

        System.out.println("******************");

        for (int i=0;i<20;i++){
            System.out.println(obj.impurefunction(5));
        }
    }

}
