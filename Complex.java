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


}
