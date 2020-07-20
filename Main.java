package com.company;

public class Main {

    public static void main(String[] args){

        double angle = Math.toRadians(90);
        double x = 2;
        double y = 3;
        double newX = x*Math.cos(angle) - y*Math.sin(angle);
        double newY = x*Math.sin(angle) + y*Math.cos(angle);
        System.out.println(x + " " + y + " " + newX + " " + newY);
        tests.complexTest();
        tests.fractionTest();
        tests.matrixTests();
        tests.mainTestHarness();
        Matrix hoom = new Matrix(new double[][] {{1,2,3,4,5},{6,7,8,9,1},{9,8,7,6,5},{3,4,5,2,3},{8,7,6,5,4}});
        System.out.println(Matrix.det(hoom));
        hoom.printMatrix();
        Matrix hoom2 = new Matrix(new double[][] {{1,2},{3,4}});

        System.out.println(Matrix.det(hoom2));
        //hoom.matrixMul(hoom2);

        Matrix m1 = new Matrix(new double[][] {{1,2,3}});
        Matrix m2 = new Matrix(new double[][] {{1},{2},{3},{4}});
        (m2.matrixMul(m1)).printMatrix();
        m1.matrixMul(m1.transpose()).printMatrix();
        Matrix m4 = new Matrix(new double[][] {{3,-8}});
        Matrix m5 = new Matrix(new double[][] {{1,2}});
        Fraction f4 = new Fraction(3,1);
        Fraction f5 = new Fraction(8,3);
        Fraction f6 = new Fraction(1,2);
        Fraction f7 = new Fraction(2,4);
        m4.matrixMul(m5.transpose()).printMatrix();
        m5.matrixMul(m4.transpose()).printMatrix();
        System.out.println(m4.dotProduct(m5));
Matrix fm = new Matrix(new Fraction[][] {{f4,f5},{f6,f7}});
Matrix f1 = new Matrix(new Fraction[][] {{f4,f5}});
Matrix f2 = new Matrix(new Fraction[][] {{f6,f7}});
//System.out.println(f1.dotProduct(f2));
//hoom2.compareMatrix(fm);
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(11,2);
        Complex c3 = new Complex(5,8);
        Complex c4 = new Complex(-2,3);
        Complex c5 = new Complex(2,-3);
        Complex c6 = new Complex(0,3);
        Complex c7 = new Complex(2,0);
        Complex c8 = new Complex(-1,-2);

        Matrix m1c = new Matrix(new Complex[][] {{c1,c2}});
        Matrix m2c = new Matrix(new Complex[][] {{c3,c4}});
        //dont work
      //  System.out.println(m1c.dotProduct(m2c));
//System.out.println(f1.dotProduct(f2));

System.out.println(f4.getDoubleValue());

    Matrix mm = Matrix.genRandomMatrix(5,6,1,20);
    mm.printMatrix();

    }
}
