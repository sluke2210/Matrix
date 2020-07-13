package com.company;
import java.lang.Math;

public class Complex {
    private double real ;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public  double getImaginary(){
        return this.imaginary;
    }
    public void setReal(double real){
        this.real = real;
    }
    public void setImaginary(double Im){
        this.imaginary = Im;
    }



    public double getMagnitude(){
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    public Complex scalarMul(double a){
        return new Complex((a * this.real),(a * this.imaginary));
    }

    public Complex complexAdd(Complex num){
        double re = this.getReal() + num.getReal();
        double im = this.getImaginary() + num.getImaginary();
        return new Complex(re,im);
    }

    public  Complex complexMul(Complex num){
        double re = (this.getReal() * num.getReal() - this.getImaginary() * num.getImaginary());
        double im = (this.getImaginary()*num.getReal() + this.getReal()*num.getImaginary());
        return  new Complex(re ,im);
    }

    public Complex conjugate(){
        double re = this.getReal();
        double im = -1*this.getImaginary();
        return new Complex(re, im);
    }
    public double argZ(){
        return Math.atan2(this.getImaginary(), this.getReal());
    }
    public String toString(){
        return "(" + this.real + " , " + this.imaginary + "i" + ")";
    }

    public static void complexTest(){
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(11,2);
        Complex c3 = new Complex(5,8);
        Complex c4 = new Complex(-2,3);
        Complex c5 = new Complex(2,-3);
        Complex c6 = new Complex(0,3);
        Complex c7 = new Complex(2,0);
        Complex c8 = new Complex(-1,-2);

        System.out.println(c1  + " + " + c2  +" = " + c1.complexAdd(c2)); //g
        System.out.println(c3  + " + " + c4  +" = " + c3.complexAdd(c4)); //g
        System.out.println();
        System.out.println(c1 + " magnatude is " + c1.getMagnitude()); //g
        System.out.println(c4 + " magnatude is " + c4.getMagnitude()); //g
        System.out.println(c5 + " magnatude is " + c5.getMagnitude()); //g
        System.out.println(c8 + " magnatude is " + c8.getMagnitude()); //g
        System.out.println();
        System.out.println(c1 + " arg z " + c1.argZ()); //g
        System.out.println(c4 + " arg z " + c4.argZ()); //g
        System.out.println(c5 + " arg z " + c5.argZ()); //g
        System.out.println(c8 + " arg z " + c8.argZ()); //g
        System.out.println();
        System.out.println(c3  + "  x2 = " + c3.scalarMul(2));  //g
        System.out.println(c5  + "  x3 = " + c5.scalarMul(3));  //g
        System.out.println(c8  + "  x -4 = " + c8.scalarMul(-4));  //g
        System.out.println();
        System.out.println(c1 + " x " + c2 + " = " + c1.complexMul(c2)); //g
        System.out.println(c2 + " x " + c3 + " = " + c2.complexMul(c3)); //g
        System.out.println(c3 + " x " + c4 + " = " + c3.complexMul(c4)); //g
        System.out.println(c5 + " x " + c6 + " = " + c5.complexMul(c6)); //g
        System.out.println(c6 + " x " + c7 + " = " + c6.complexMul(c7)); //g
        System.out.println(c7 + " x " + c8 + " = " + c7.complexMul(c8)); //g
        System.out.println(c2 + " x " + c5 + " = " + c2.complexMul(c5)); //g
        System.out.println();
        System.out.println(c2 + " conjugate is " + c2.conjugate()); //g





    }

}
