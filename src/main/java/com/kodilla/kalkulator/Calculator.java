package com.kodilla.kalkulator;

public class Calculator {
    private double varA;
    private double varB;
    private double resultSum;
    private double resultDiff;

    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    public double getResultSum() {
        return resultSum;
    }

    public double getResultDiff() {
        return resultDiff;
    }

    public double addAToB(double varA, double varB) {
        resultSum=varA+varB;
        System.out.println("Sum of "+varA+" and "+varB+" is "+getResultSum());
        return getResultSum();
    }

    public double subtractBFromA(double varA, double varB) {
        resultDiff=varA-varB;
        System.out.println(varB+" subtracted from  "+varA+" is "+ getResultDiff());
        return getResultDiff();
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("That is a simple calculator, which can add and subtract 2 numbers\n---------");

        calculator.addAToB(20.0, 10.0);
        calculator.subtractBFromA(10.0,5.0);

    }
}
