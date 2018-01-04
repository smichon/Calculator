package com.kodilla.kalkulator;

public class Calculator {
    private double varA;
    private double varB;

    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    public double addAToB(double varA, double varB) {
        return varA + varB;

    }

    public double subtractBFromA(double varA, double varB) {
        return varA - varB;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        double sum = calculator.addAToB(20.0,10.0);
        double diff = calculator.subtractBFromA(10.0,5.0);

        System.out.println("Sum is:"+sum);
        System.out.println("Diff is: "+diff);
    }
}
