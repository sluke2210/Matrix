package com.company;
import java.io.*;
import java.util.*;

public  class Matrix {

    private int width;
    private int height;
    public double[][] matrix = null;
    public Complex[][] complexMatrix = null;
    public Fraction[][] fractionalMatrix = null;



    //constructor from single array , causes errors for non square arrays
//a garbage constructor
//    public Matrix(int width, int height, double[] cells){
//        this.width = width;
//        this.height = height;
////                                 col j       row i
//        this.matrix = new double[width][height];
//
//        for(int i =0; i < height; i++ ){
//            for(int j =0; j< width ;j++){
//               // System.out.println(i+" " + j + " "  +" " + cells[((i * this.width) + j)] +" " + ((i * this.width) + j));
//                this.matrix[i][j] = cells[((i * (width) + j))];
//            }
//        }
//    }


    //constructor from double 2d array to a Matrix object
    public Matrix(double[][] matrixM) {
        int height = matrixM.length;
        int width = matrixM[0].length;
        this.matrix = new double[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.matrix[i][j] = matrixM[i][j];
            }
        }
    }

    //constructor from Complex number  2d array to a Matrix object
    public Matrix (Complex[][] complexMatrix){
        int height = complexMatrix.length;
        int width = complexMatrix[0].length;
        this.complexMatrix = new Complex[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.complexMatrix[i][j] = complexMatrix[i][j];
            }
        }
    }


    //constructor from fraction objejct  2d array to a Matrix object
    public Matrix (Fraction[][] fractionMatrix){
        int height = fractionMatrix.length;
        int width = fractionMatrix[0].length;
        this.fractionalMatrix = new Fraction[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.fractionalMatrix[i][j] = fractionMatrix[i][j];
            }
        }
    }



    public double getElement(int row, int col) {
        return matrix[row][col];
    }

//print for a normal matrix od doubles
    public void printMatrix() {
        for (double[] row : this.matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    //for complex numbers
    public void printComplexMatrix() {
        for (Complex[] row : this.complexMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    //for fractions
    public void printFractionMatrix() {
        for (Fraction[] row : this.fractionalMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }


    public void compareMatrix(Matrix m) {

        if (this.matrix != null) {
            int height = this.matrix.length;
            int width = this.matrix[0].length;

            int height2 = m.matrix.length;
            int width2 = m.matrix[0].length;

            if (height != height2 || width != width2) {
                System.out.println("doesnt support arrays of different size yet");
            } else {
                for (int i = 0; i < height; i++) {
                    System.out.print(Arrays.toString(this.matrix[i]) + "   " + Arrays.toString(m.matrix[i]) + "\n");

                }
            }
        }

        if (this.complexMatrix != null) {
            int height = this.complexMatrix.length;
            int width = this.complexMatrix[0].length;

            int height2 = m.complexMatrix.length;
            int width2 = m.complexMatrix[0].length;

            if (height != height2 || width != width2) {
                System.out.println("doesnt support arrays of different size yet");
            } else {
                for (int i = 0; i < height; i++) {
                    System.out.print(Arrays.toString(this.complexMatrix[i]) + "   " + Arrays.toString(m.complexMatrix[i]) + "\n");

                }
            }
        }

        if (this.fractionalMatrix != null) {
            int height = this.fractionalMatrix.length;
            int width = this.fractionalMatrix[0].length;

            int height2 = m.fractionalMatrix.length;
            int width2 = m.fractionalMatrix[0].length;

            if (height != height2 || width != width2) {
                System.out.println("doesnt support arrays of different size yet");
            } else {
                for (int i = 0; i < height; i++) {
                    System.out.print(Arrays.toString(this.fractionalMatrix[i]) + "   " + Arrays.toString(m.fractionalMatrix[i]) + "\n");

                }
            }
        }


    }



    public Matrix scalarMul(double a) {
         Matrix result = null;
        if(this.matrix != null) {

            int height = this.matrix.length;
            int width = this.matrix[0].length;
            double[][] res = new double[this.matrix.length][this.matrix[0].length];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {

                    res[i][j] = (a * this.matrix[i][j]);
                }
            }
            result = new Matrix(res);

        }

        if(this.fractionalMatrix != null) {

            int height = this.fractionalMatrix.length;
            int width = this.fractionalMatrix[0].length;
            Fraction[][] res = new Fraction[this.fractionalMatrix.length][this.fractionalMatrix[0].length];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {

                    res[i][j] =  this.fractionalMatrix[i][j].intScalerMul((long) a);
                }
            }
            result = new Matrix(res);

        }

        if(this.complexMatrix != null) {

            int height = this.complexMatrix.length;
            int width = this.complexMatrix[0].length;
            Complex[][] res = new Complex[this.complexMatrix.length][this.complexMatrix[0].length];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {

                    res[i][j] =  this.complexMatrix[i][j].scalarMul(a);
                }
            }
            result = new Matrix(res);

        }

        return result;

    }


    public Matrix add(Matrix m) {

        Matrix result = null;

        if(this.matrix != null) {

            int height = this.matrix.length;
            int width = this.matrix[0].length;

            int height2 = m.matrix.length;
            int width2 = m.matrix[0].length;


            double[][] res = new double[this.matrix.length][this.matrix[0].length];

            if (m.width != this.width || m.height != this.height) {
                System.out.println("dims wrong");
            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        res[i][j] = (m.matrix[i][j] + this.matrix[i][j]);
                    }
                }
            }

             result = new Matrix(res);
        }

        if(this.fractionalMatrix != null){
            int height = this.fractionalMatrix.length;
            int width = this.fractionalMatrix[0].length;

            int height2 = m.fractionalMatrix.length;
            int width2 = m.fractionalMatrix[0].length;


            Fraction[][] res = new Fraction[this.fractionalMatrix.length][this.fractionalMatrix[0].length];

            if (m.width != this.width || m.height != this.height) {
                System.out.println("dims wrong");
            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        res[i][j] = (m.fractionalMatrix[i][j].addFraction(this.fractionalMatrix[i][j])).simplfyFraction();
                    }
                }
            }

            result = new Matrix(res);
        }

        if(this.complexMatrix != null){

            int height = this.complexMatrix.length;
            int width = this.complexMatrix[0].length;

            int height2 = m.complexMatrix.length;
            int width2 = m.complexMatrix[0].length;


            Complex[][] res = new Complex[this.complexMatrix.length][this.complexMatrix[0].length];

            if (m.width != this.width || m.height != this.height) {
                System.out.println("dims wrong");
            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        res[i][j] = (m.complexMatrix[i][j].complexAdd(this.complexMatrix[i][j]));
                    }
                }
            }

            result = new Matrix(res);
        }





        return result;
    }

//i will leave this for later as i just did addition and its basically the same but i havent yet implemnted
    //subtraction in fraction and complex
    public Matrix sub(Matrix m) {
        int height = this.matrix.length;
        int width = this.matrix[0].length;

        int height2 = m.matrix.length;
        int width2 = m.matrix[0].length;

        double[][] res = new double[this.matrix.length][this.matrix[0].length];

        if (m.width != this.width || m.height != this.height) {
            System.out.println("dims wrong");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    res[i][j] = (this.matrix[i][j] - m.matrix[i][j]);
                }
            }
        }

        Matrix result = new Matrix(res);
        return result;
    }


    public double trace() {

        int height = this.matrix.length;
        int width = this.matrix[0].length;


        double trace = 0.0;


        if (width != height) {
            System.out.println("dims wrong");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == j) {
                        trace += (this.matrix[i][j]);
                    }
                }
            }

        }
        return trace;
    }


    public Matrix transpose() {
        Matrix result = null;

        if(this.matrix != null) {

            int height = this.matrix.length;
            int width = this.matrix[0].length;
            double[][] res = new double[this.matrix.length][this.matrix[0].length];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    res[j][i] = this.matrix[i][j];
                }
            }
            result = new Matrix(res);
        }

        if(this.complexMatrix != null) {

            int height = this.complexMatrix.length;
            int width = this.complexMatrix[0].length;
            Complex[][] res = new Complex[this.complexMatrix.length][this.complexMatrix[0].length];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    res[j][i] = this.complexMatrix[i][j];
                }
            }
            result = new Matrix(res);
        }

        if(this.fractionalMatrix != null) {

            int height = this.fractionalMatrix.length;
            int width = this.fractionalMatrix[0].length;
            Fraction[][] res = new Fraction[this.fractionalMatrix.length][this.fractionalMatrix[0].length];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    res[j][i] = this.fractionalMatrix[i][j];
                }
            }
            result = new Matrix(res);
        }


        return result;
    }

    public void swapRow(int row1, int row2) {
        if(this.matrix != null) {
            double[] temp = this.matrix[row1];
            this.matrix[row1] = this.matrix[row2];
            this.matrix[row2] = temp;
        }
        if(this.fractionalMatrix != null) {
            Fraction[] temp = this.fractionalMatrix[row1];
            this.fractionalMatrix[row1] = this.fractionalMatrix[row2];
            this.fractionalMatrix[row2] = temp;
        }
        if(this.complexMatrix != null) {
            Complex[] temp = this.complexMatrix[row1];
            this.complexMatrix[row1] = this.complexMatrix[row2];
            this.complexMatrix[row2] = temp;
        }
    }

    public Boolean isRowZeros(int row) {
        Boolean res = true;
        for (int i = 0; i < this.matrix[0].length; i++) {
            if (this.matrix[row][i] != 0) {
                res = false;
            }
        }
        return res;
    }


    public Boolean isColZeros(int Col) {
        Boolean res = true;
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.matrix[i][Col] != 0) {
                res = false;
            }
        }
        return res;
    }


    public Matrix matrixMul( Matrix m ) {
        Matrix result = null;


if(this.matrix != null){

        int height = this.matrix.length; //row
        int width = this.matrix[0].length; //col

        int height2 = m.matrix.length; //row
        int width2 = m.matrix[0].length; //col

        double[][] res = new double[height][width2];

        if (width != height2) {
            System.out.println("matrix dims wrong for multiplication");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width2; j++) {
                    for (int k = 0; k < width; k++) {
                        res[i][j] += this.matrix[i][k] * m.matrix[k][j];
                    }
                }
            }
        }
    result = new Matrix(res);
  }



        if(this.fractionalMatrix != null){

            int height = this.fractionalMatrix.length; //row
            int width = this.fractionalMatrix[0].length; //col

            int height2 = m.fractionalMatrix.length; //row
            int width2 = m.fractionalMatrix[0].length; //col

            Fraction[][] res = new Fraction[height][width2];

            if (width != height2) {
                System.out.println("matrix dims wrong for multiplication");
            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width2; j++) {
                        for (int k = 0; k < width; k++) {
                            res[i][j] =res[i][j].addFraction(this.fractionalMatrix[i][k].multiplyFraction(m.fractionalMatrix[k][j]).simplfyFraction());
                        }
                    }
                }
            }
            result = new Matrix(res);
        }


        if(this.complexMatrix != null){

            int height = this.complexMatrix.length; //row
            int width = this.complexMatrix[0].length; //col

            int height2 = m.complexMatrix.length; //row
            int width2 = m.complexMatrix[0].length; //col

            Complex[][] res = new Complex[height][width2];

            if (width != height2) {
                System.out.println("matrix dims wrong for multiplication");
            } else {
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width2; j++) {
                        for (int k = 0; k < width; k++) {
                            res[i][j] =res[i][j].complexAdd(this.complexMatrix[i][k].complexMul(m.complexMatrix[k][j]));
                        }
                    }
                }
            }
            result = new Matrix(res);
        }


return  result;
    }

    public void checkNull(){
        if(this.matrix == null){
            System.out.println("double matrix is null");
        }
        if(this.complexMatrix == null){
            System.out.println("complex matrix is null");
        }
        if(this.fractionalMatrix == null){
            System.out.println("fractional matrix is null");
        }
    }

}



//public Matrix REF(){
//        int count = 0;
//    int rows = this.matrix.length;
//    int cols = this.matrix[0].length;
//
//    for(int i = 0; i< rows; i++){
//        if(cols <= count){
//            break;
//        }
//
//    }
//
//        for (double[] row : this.matrix) {
//        //System.out.println(Arrays.toString(row));
//            if(row[0] != 0){
//                swapRow(1, count);
//            }
//    }
//        return this;
//    }

//public Matrix REF(){
//    double[][] res = new double[this.matrix.length][this.matrix[0].length];
//    int height = this.matrix.length;
//    int width = this.matrix[0].length;
//
//        for (int i = 0; i < height; i++) {
//            if(this.matrix[i][0] != 0){
//              //  System.out.println(Arrays.toString(this.matrix[0]));
//                this.swapRow();
//                System.out.println((this.matrix[i][0]));
//                res[0][i] = this.matrix[i][0];
//            }
//            if(this.matrix[i][0] ){}
//
//    }
//        return new Matrix(res);
//}
//unfinshed functions

//    public double getCofactor(int row, int col){
//        int height = this.matrix.length;
//        int width = this.matrix[0].length;
//
//    }
//    public Matrix reduce(){
//        int height = this.matrix.length;
//        int width = this.matrix[0].length;
//
//    }

//  public Matrix inverse(){
//        int height = this.matrix.length;
//        int width = this.matrix[0].length;
//
//  }
//other functions
//cross prod and dot prod
//matric of minors / matrix of cofactors
//getDeterminanat


