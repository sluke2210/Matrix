package com.company;

public class Main {

    public static void main(String[] args) {
	Matrix m1 = new Matrix(new double[][] {{1,2,3},{4,5,6},{7,8,9}});
	Matrix m2 = new Matrix(new double[][] {{1,2,2},{2,1,5},{6,7,4}});
    m1.matrixMul(m2).printMatrix();
    System.out.println();
    m2.matrixMul(m1).printMatrix();
    Matrix m3 = new Matrix(new double[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}});
    System.out.println();
    m2.matrixMul(m3).printMatrix();

    Complex c1 = new Complex( 2,3);

    System.out.println(c1.conjugate());
    Complex  c2 = new Complex(2,5);
    Complex c3 = c1.complexMul(c2);
    System.out.println(c3);
    Fraction f1 = new Fraction(10,3);
    Fraction f2 = new Fraction(12,30);
    Fraction f3 = f1.addFraction(f2);
    Complex c5 = new Complex(2,3);
    Complex c6 = new Complex(5,-2);
    Complex c7 = new Complex(9,0);
    Complex c8 = new Complex(2,3);
    Complex c4 = new Complex(23,3);
    System.out.println(f3.toString());

    Matrix m8 = new Matrix(new Complex[][] {{c1,c2},{c3,c4}});
    Matrix m9 = new Matrix(new Fraction[][] {{f1,f2}});
m3.printMatrix();
System.out.println();
m8.printComplexMatrix();
System.out.println();
m9.printFractionMatrix();
System.out.println();
m3.scalarMul(2).printMatrix();
System.out.println();
m8.scalarMul(2).printComplexMatrix();
System.out.println();
m9.scalarMul(2).printFractionMatrix();

Matrix m10 = new Matrix(new Complex[][] {{c1,c2},{c3,c4}});
Matrix m11 = new Matrix(new Complex[][] {{c8,c5},{c6,c7}});
Matrix m12 = m10.add(m11);
m12.printComplexMatrix();
m10.compareMatrix(m11);

m9.matrixMul(m9).printFractionMatrix();
//m10.matrixMul(m11).printComplexMatrix();


    }
}
