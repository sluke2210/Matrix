package com.company;

public class tests {
    //matrix tests

    public static void matrixTests(){
        //2x1 1x2 2x3 3x2 and 3x3 matracies tested as complex, fractional or double
        Matrix dM2x1 = new Matrix(new double[][] {{2},{3}});
        Matrix dM1x2 = new Matrix(new double[][] {{2,3}});
        Matrix dM2x3 = new Matrix(new double[][] {{2,-5,7},{4,9,1}});
        Matrix dM3x2 = new Matrix(new double[][] {{6,8},{7,17},{-1,5}});
        Matrix dM3x3 = new Matrix(new double[][] {{8,12,6},{3,7,9},{15,21,13}});
        Matrix dM3x3col0 = new Matrix(new double[][] {{8,0,6},{3,0,9},{15,0,13}});
        Matrix dM3x3row0 = new Matrix(new double[][] {{8,12,6},{3,7,9},{0,0,0}});

        System.out.println(" 2 x 1 matrix ");
        dM2x1.printMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 1 x 2 matrix ");
        dM1x2.printMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 2 x 3 matrix ");
        dM2x3.printMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 3 x 2 matrix ");        //2x1 1x2 2x3 3x2 and 3x3 matracies tested as complex, fractional or double
        dM3x2.printMatrix();
        System.out.println();
        System.out.println(" 3 x 3 matrix ");
        dM3x3.printMatrix();
        System.out.println();
        System.out.println();

        System.out.println("tests begin: 1 matrix addition");

        System.out.println();
        dM2x1.printMatrix();
        System.out.println(" + ");
        dM2x1.printMatrix();
        System.out.println("is");
        dM2x1.add(dM2x1).printMatrix();

        System.out.println();
        dM1x2.printMatrix();
        System.out.println(" + ");
        dM1x2.printMatrix();
        System.out.println("is");
        dM1x2.add(dM1x2).printMatrix();

        System.out.println();
        dM2x3.printMatrix();
        System.out.println(" + ");
        dM2x3.printMatrix();
        System.out.println("is");
        dM2x3.add(dM2x3).printMatrix();

        System.out.println();
        dM3x2.printMatrix();
        System.out.println(" + ");
        dM3x2.printMatrix();
        System.out.println("is");
        dM3x2.add(dM3x2).printMatrix();

        System.out.println();
        dM3x3.printMatrix();
        System.out.println(" + ");
        dM3x3.printMatrix();
        System.out.println("is");
        dM3x3.add(dM3x3).printMatrix();
        System.out.println();

        System.out.println("tests begin: 2 matrix scalar multiplication");

        System.out.println();
        dM3x3.printMatrix();
        System.out.println(" x2 ");
        System.out.println("is");
        dM3x3.scalarMul(2).printMatrix();

        System.out.println();
        System.out.println();

        dM3x3.printMatrix();
        System.out.println(" x3 ");
        System.out.println("is");
        dM3x3.scalarMul(3).printMatrix();

        System.out.println();
        System.out.println();

        dM3x3.printMatrix();
        System.out.println(" x4 ");
        System.out.println("is");
        dM3x3.scalarMul(4).printMatrix();

        System.out.println();

        dM3x3.printMatrix();
        System.out.println(" x-5 ");
        System.out.println("is");
        dM3x3.scalarMul(-5).printMatrix();

        System.out.println();
        System.out.println();

        dM3x3.printMatrix();
        System.out.println(" x6 ");
        System.out.println("is");
        dM3x3.scalarMul(6).printMatrix();
        System.out.println();

        System.out.println("finding the trace of a matrix");

        System.out.println();
        dM3x3.printMatrix();
        System.out.println(" trace is: " + dM3x3.trace());
        System.out.println();


        dM3x3col0.printMatrix();
        System.out.println(" trace is: " + dM3x3col0.trace());

        System.out.println();
        dM3x3row0.printMatrix();
        System.out.println(" trace is: " + dM3x3row0.trace());

        System.out.println("begine test 4 ----- matrix multiplication");

        //width need be equal to height 2 e.g 3x2 x 2x3 ; 1x2 x 2x1 ; 2x1 x 1x2 ; 3x3 x 3x3; 2x3 x 3x2

        dM1x2.printMatrix();
        System.out.println(" x ");
        dM2x1.printMatrix();
        System.out.println("is");
        dM1x2.matrixMul(dM2x1).printMatrix();
        System.out.println();

        dM2x1.printMatrix();
        System.out.println(" x ");
        dM1x2.printMatrix();
        System.out.println("is");
        dM2x1.matrixMul(dM1x2).printMatrix();
        System.out.println();

        dM3x2.printMatrix();
        System.out.println(" x ");
        dM2x3.printMatrix();
        System.out.println("is");
        dM3x2.matrixMul(dM2x3).printMatrix();
        System.out.println();

        dM2x3.printMatrix();
        System.out.println(" x ");
        dM3x2.printMatrix();
        System.out.println("is");
        dM2x3.matrixMul(dM3x2).printMatrix();
        System.out.println();

        dM3x3.printMatrix();
        System.out.println(" x ");
        dM3x3.printMatrix();
        System.out.println("is");
        dM3x3.matrixMul(dM3x3).printMatrix();
        System.out.println();

        System.out.println("transpose a matrix ----");

        dM3x3.printMatrix();
        System.out.println(" transposed ");
        System.out.println("is");
        dM3x3.transpose().printMatrix();
        System.out.println();

        dM2x3.printMatrix();
        System.out.println(" transposed ");
        System.out.println("is");
        dM2x3.transpose().printMatrix();
        System.out.println();

        dM3x2.printMatrix();
        System.out.println(" transposed ");
        System.out.println("is");
        dM3x2.transpose().printMatrix();
        System.out.println();

        dM2x3.printMatrix();
        System.out.println(" row 0 and 1 swapped is");
        dM2x3.swapRow(0,1).printMatrix();

        System.out.println();

        dM3x3.printMatrix();
        System.out.println(" row 0 and 3 swapped");
        dM3x3.swapRow(0,2).printMatrix();

        System.out.println("boolean is row 0 is col 0");
        dM3x3col0.printMatrix();
        System.out.println("col 0 " + dM3x3col0.isColZeros(0));
        System.out.println("col 1 " + dM3x3col0.isColZeros(1));
        System.out.println("col 2 " + dM3x3col0.isColZeros(2));
        dM3x3row0.printMatrix();
        System.out.println("row 0 " + dM3x3row0.isRowZeros(0));
        System.out.println("row 1 " + dM3x3row0.isRowZeros(1));
        System.out.println("row 2 " + dM3x3row0.isRowZeros(2));


    }

    //complex number tests

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

    //fraction tests

    public static void fractionTest(){
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(1, 8);
        Fraction f4 = new Fraction(256 ,16);
        System.out.println(f1 + " + " + f2  + " = " + f1.addFraction(f2));
        System.out.println();
        System.out.println(f3 + " X8 " + f3.intScalerMul(8));
        System.out.println();
        System.out.println(f4 + " simplified is " + f4.simplfyFraction());

        System.out.println();

        Fraction f5 = new Fraction(-2,3);
        Fraction f6 = new Fraction(1, -3);
        Fraction f7 = new Fraction(1, -8);
        Fraction f8 = new Fraction(-256 ,16);
        System.out.println(f5 + " + " + f6  + " = " + f5.addFraction(f6));
        System.out.println();
        System.out.println(f7 + " X8 " + f7.intScalerMul(8));
        System.out.println();
        System.out.println(f8 + " simplified is " + f8.simplfyFraction());
    }

    //multiple type tests

    public static void mainTestHarness() {

        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(1, 8);
        Fraction f4 = new Fraction(256 ,16);
        Fraction f5 = new Fraction(-2,3);
        Fraction f6 = new Fraction(1, -3);
        Fraction f7 = new Fraction(1, -8);
        Fraction f8 = new Fraction(-256 ,16);
        Fraction f9 = new Fraction(11,17);

        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(11,2);
        Complex c3 = new Complex(5,8);
        Complex c4 = new Complex(-2,3);
        Complex c5 = new Complex(2,-3);
        Complex c6 = new Complex(0,3);
        Complex c7 = new Complex(2,0);
        Complex c8 = new Complex(-1,-2);
        Complex c9 = new Complex(9,4);

        //producing the arrays; 2x1 , 1x2 , 2x3 , 3x2, 3x3; rowXcol

        Matrix dM2x1 = new Matrix(new double[][] {{2},{3}});
        Matrix dM1x2 = new Matrix(new double[][] {{2,3}});
        Matrix dM2x3 = new Matrix(new double[][] {{2,-5,7},{4,9,1}});
        Matrix dM3x2 = new Matrix(new double[][] {{6,8},{7,17},{-1,5}});
        Matrix dM3x3 = new Matrix(new double[][] {{8,12,6},{3,7,9},{15,21,13}});

        Matrix fM2x1 = new Matrix(new Fraction[][] {{f1},{f2}});
        Matrix fM1x2 = new Matrix(new Fraction[][] {{f2,f1}});
        Matrix fM2x3 = new Matrix(new Fraction[][] {{f3,f5,f6},{f4,f9,f1}});
        Matrix fM3x2 = new Matrix(new Fraction[][] {{f4,f3},{f5,f7},{f1,f5}});
        Matrix fM3x3 = new Matrix(new Fraction[][] {{f1,f2,f6},{f3,f7,f9},{f5,f4,f8}});

        Matrix cM2x1 = new Matrix(new Complex[][] {{c2},{c3}});
        Matrix cM1x2 = new Matrix(new Complex[][] {{c2,c3}});
        Matrix cM2x3 = new Matrix(new Complex[][] {{c2,c5,c7},{c4,c9,c1}});
        Matrix cM3x2 = new Matrix(new Complex[][] {{c5,c4},{c9,c7},{c1,c5}});
        Matrix cM3x3 = new Matrix(new Complex[][] {{c9,c8,c7},{c6,c5,c4},{c3,c2,c1}});
        //matrtix tests for fractions

        System.out.println(" 2 x 1 matrix ");
        fM2x1.printFractionMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 1 x 2 matrix ");
        fM1x2.printFractionMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 2 x 3 matrix ");
        fM2x3.printFractionMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 3 x 2 matrix ");        //2x1 1x2 2x3 3x2 and 3x3 matracies tested as complex, fractional or double
        fM3x2.printFractionMatrix();
        System.out.println();
        System.out.println(" 3 x 3 matrix ");
        fM3x3.printFractionMatrix();
        System.out.println();
        System.out.println();

        System.out.println("testing 1 matrix addition (fractional) ");

        System.out.println();
        fM2x1.printFractionMatrix();
        System.out.println(" + ");
        fM2x1.printFractionMatrix();
        System.out.println("is");
        fM2x1.add(fM2x1).printFractionMatrix();

        System.out.println();
        fM1x2.printFractionMatrix();
        System.out.println(" + ");
        fM1x2.printFractionMatrix();
        System.out.println("is");
        fM1x2.add(fM1x2).printFractionMatrix();

        System.out.println();
        fM2x3.printFractionMatrix();
        System.out.println(" + ");
        fM2x3.printFractionMatrix();
        System.out.println("is");
        fM2x3.add(fM2x3).printFractionMatrix();

        System.out.println();
        fM3x2.printFractionMatrix();
        System.out.println(" + ");
        fM3x2.printFractionMatrix();
        System.out.println("is");
        fM3x2.add(fM3x2).printFractionMatrix();

        System.out.println();
        fM3x3.printFractionMatrix();
        System.out.println(" + ");
        fM3x3.printFractionMatrix();
        System.out.println("is");
        fM3x3.add(fM3x3).printFractionMatrix();
        System.out.println();

        System.out.println("testing 2 matrix scalar multiplication ( fractional )");

        System.out.println();
        fM3x3.printFractionMatrix();
        System.out.println(" x2 ");
        System.out.println("is");
        fM3x3.scalarMul(2).printFractionMatrix();

        System.out.println();
        System.out.println();

        fM3x3.printFractionMatrix();
        System.out.println(" x3 ");
        System.out.println("is");
        fM3x3.scalarMul(3).printFractionMatrix();

        System.out.println();
        System.out.println();

        fM3x3.printFractionMatrix();
        System.out.println(" x4 ");
        System.out.println("is");
        fM3x3.scalarMul(4).printFractionMatrix();

        System.out.println();

        fM3x3.printFractionMatrix();
        System.out.println(" x-5 ");
        System.out.println("is");
        fM3x3.scalarMul(-5).printFractionMatrix();

        System.out.println();
        System.out.println();

        fM3x3.printFractionMatrix();
        System.out.println(" x6 ");
        System.out.println("is");
        fM3x3.scalarMul(6).printFractionMatrix();
        System.out.println();

        System.out.println(" testing transpose of a fractional matrix ");
        fM2x3.printFractionMatrix();
        System.out.println("transposed");
        fM2x3.transpose().printFractionMatrix();
        System.out.println();

        System.out.println(" ");
        fM3x2.printFractionMatrix();
        System.out.println("transposed");
        fM3x2.transpose().printFractionMatrix();

        System.out.println("");
        fM3x3.printFractionMatrix();
        System.out.println("transposed");
        fM3x3.transpose().printFractionMatrix();


        System.out.println(" now testing same with complex number");

        System.out.println(" 2 x 1 matrix ");
        cM2x1.printComplexMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 1 x 2 matrix ");
        cM1x2.printComplexMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 2 x 3 matrix ");
        cM2x3.printComplexMatrix();
        System.out.println();
        System.out.println();
        System.out.println(" 3 x 2 matrix ");        //2x1 1x2 2x3 3x2 and 3x3 matracies tested as complex, cractional or double
        cM3x2.printComplexMatrix();
        System.out.println();
        System.out.println(" 3 x 3 matrix ");
        cM3x3.printComplexMatrix();
        System.out.println();
        System.out.println();

        System.out.println("testing 1 matrix addition (complex) ");

        System.out.println();
        cM2x1.printComplexMatrix();
        System.out.println(" + ");
        cM2x1.printComplexMatrix();
        System.out.println("is");
        cM2x1.add(cM2x1).printComplexMatrix();

        System.out.println();
        cM1x2.printComplexMatrix();
        System.out.println(" + ");
        cM1x2.printComplexMatrix();
        System.out.println("is");
        cM1x2.add(cM1x2).printComplexMatrix();

        System.out.println();
        cM2x3.printComplexMatrix();
        System.out.println(" + ");
        cM2x3.printComplexMatrix();
        System.out.println("is");
        cM2x3.add(cM2x3).printComplexMatrix();

        System.out.println();
        cM3x2.printComplexMatrix();
        System.out.println(" + ");
        cM3x2.printComplexMatrix();
        System.out.println("is");
        cM3x2.add(cM3x2).printComplexMatrix();

        System.out.println();
        cM3x3.printComplexMatrix();
        System.out.println(" + ");
        cM3x3.printComplexMatrix();
        System.out.println("is");
        cM3x3.add(cM3x3).printComplexMatrix();
        System.out.println();

        System.out.println("testing 2 matrix scalar multiplication ( complex )");

        System.out.println();
        cM3x3.printComplexMatrix();
        System.out.println(" x2 ");
        System.out.println("is");
        cM3x3.scalarMul(2).printComplexMatrix();

        System.out.println();
        System.out.println();

        cM3x3.printComplexMatrix();
        System.out.println(" x3 ");
        System.out.println("is");
        cM3x3.scalarMul(3).printComplexMatrix();

        System.out.println();
        System.out.println();

        cM3x3.printComplexMatrix();
        System.out.println(" x4 ");
        System.out.println("is");
        cM3x3.scalarMul(4).printComplexMatrix();

        System.out.println();

        cM3x3.printComplexMatrix();
        System.out.println(" x-5 ");
        System.out.println("is");
        cM3x3.scalarMul(-5).printComplexMatrix();

        System.out.println();
        System.out.println();

        cM3x3.printComplexMatrix();
        System.out.println(" x6 ");
        System.out.println("is");
        cM3x3.scalarMul(6).printComplexMatrix();
        System.out.println();

        System.out.println(" testing transpose of a complex matrix ");
        cM2x3.printComplexMatrix();
        System.out.println("transposed");
        cM2x3.transpose().printComplexMatrix();
        System.out.println();

        System.out.println(" ");
        cM3x2.printComplexMatrix();
        System.out.println("transposed");
        cM3x2.transpose().printComplexMatrix();

        System.out.println("");
        cM3x3.printComplexMatrix();
        System.out.println("transposed");
        cM3x3.transpose().printComplexMatrix();



    }

}
