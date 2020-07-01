package com.company;
import java.io.*;
import java.util.*;

public  class Matrix {

    private int width;
    private int height;
    public double[][] matrix;

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
    //construct from double  arr

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


    public double getElement(int row, int col) {
        return matrix[row][col];
    }


    public void printMatrix() {
        for (double[] row : this.matrix) {
            System.out.println(Arrays.toString(row));
        }

    }


    public void compareMatrix(Matrix m) {
        int height = this.matrix.length;
        int width = this.matrix[0].length;

        int height2 = m.matrix.length;
        int width2 = m.matrix[0].length;

        if(height != height2 || width != width2){
            System.out.println("doesnt support arrays of different size yet");
        }else {

            for (int i = 0; i < height; i++) {
                System.out.print(Arrays.toString(this.matrix[i]) + "   " + Arrays.toString(m.matrix[i]) + "\n");

            }
        }
//        for (double[] row : this.matrix) {
//            System.out.print(Arrays.toString(row) + " "  +Arrays.toString(m.matrix[]));
//        }
    }


    public Matrix scalarMul(double a) {
        int height = this.matrix.length;
        int width = this.matrix[0].length;
        double[][] res = new double[this.matrix.length][this.matrix[0].length];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                res[i][j] = (a * this.matrix[i][j]);
            }
        }

        Matrix result = new Matrix(res);
        return result;
    }


    public Matrix add(Matrix m) {
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

        Matrix result = new Matrix(res);
        return result;
    }


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

    public Matrix transpose(){
        int height = this.matrix.length;
        int width = this.matrix[0].length;
        double[][] res = new double[this.matrix.length][this.matrix[0].length];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                res[j][i] = this.matrix[i][j];
            }
        }
    return new Matrix(res);
    }


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
//    public  Matrix matrixMul(Matrix m){
//        int height = this.matrix.length;
//        int width = this.matrix[0].length;
//
//        int height2 = m.matrix.length;
//        int width2 = m.matrix[0].length;
//
//        double[][] res = new double[this.matrix.length][this.matrix[0].length];
//    }
//  public Matrix inverse(){
//        int height = this.matrix.length;
//        int width = this.matrix[0].length;
//
//  }


}
