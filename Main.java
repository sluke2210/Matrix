package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Matrix m1 = new Matrix(new double[][] {{1,2,3},{4,5,6},{7,8,9}});
        Matrix m2 = new Matrix(new double[][] {{9,8,7},{4,3,2},{4,5,6}});

        Matrix m3 = new Matrix(new double[][] {{1,2,3},{4,5,6}});
        Matrix m4 = new Matrix(new double[][] {{1,2,3},{4,5,6}});
////addttion
//        Matrix m5 = m1.add(m2);
//        Matrix m6 = m3.add(m4);
////scalar multiplication
//        Matrix m7 = m2.scalarMul(2.0);
//        Matrix m8 = m4.scalarMul(2.0);
////subtract
//        Matrix m9 = m3.sub(m4);
//        Matrix m10 = m1.sub(m2);
//
//        m1.printMatrix();
//        System.out.println("plus");
//        m2.printMatrix();
//        System.out.println("is");
//        m5.printMatrix();
//
//        System.out.println();
//
//        m3.printMatrix();
//        System.out.println("plus");
//        m4.printMatrix();
//        System.out.println("is");
//        m6.printMatrix();
//
//        System.out.println();
//
//        m3.printMatrix();
//        System.out.println("subtract");
//        m4.printMatrix();
//        System.out.println("is");
//        m9.printMatrix();
//
//        System.out.println();
//
//        m1.printMatrix();
//        System.out.println("subtract");
//        m2.printMatrix();
//        System.out.println("is");
//        m10.printMatrix();
//
//        System.out.println();
//
//        m2.printMatrix();
//        System.out.println("x2 is");
//        m7.printMatrix();
//
//        System.out.println();
//
//        m4.printMatrix();
//        System.out.println("x2 is");
//        m8.printMatrix();
//
//        System.out.println();
//        System.out.println(m1.trace());
//        m3.trace();
//        m1.compareMatrix(m2);
//        System.out.println();
//        m3.compareMatrix(m4);
//
//
//        m1.compareMatrix(m3);
        Matrix m11 = m1.transpose();
        m11.compareMatrix(m1);
    }
}
