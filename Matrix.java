package com.company;
import java.io.*;
import java.util.*;

public  class Matrix {
    public int  width;
    public int height;
    public  double[][] matrix;

    //constructor from single array , causes errors for non square arrays

    public Matrix(int width, int height, double[] cells){
        this.width = width;
        this.height = height;
//                                 col j       row i
        this.matrix = new double[width][height];

        for(int i =0; i < height; i++ ){
            for(int j =0; j< width ;j++){
               // System.out.println(i+" " + j + " "  +" " + cells[((i * this.width) + j)] +" " + ((i * this.width) + j));
                this.matrix[i][j] = cells[((i * (width) + j))];
            }
        }
    }
    //construct from double  arr

    public Matrix(double[][] matrixM){
        int height2 = matrixM.length;
        int width2 = matrixM[0].length;
        this.matrix = new double[height2][width2];

        for (int i =0 ; i< height2; i++){
            for(int j =0 ; j< width2; j++){
                this.matrix[i][j] = matrixM[i][j];
            }
        }
    }



    public double getElement(int row, int col){
        return matrix[row][col];
    }

    public  void printMatrix(){
       for(double[] row : this.matrix){
           System.out.println(Arrays.toString(row));
       }

    }
public void compareMatrix(Matrix m) {
        this.printMatrix();
        System.out.println();
        m.printMatrix();
}
    public Matrix scalarMul(double a){
        double[][] res = new double[this.matrix.length][this.matrix[0].length];

            for(int i = 0; i < this.matrix.length; i++){
                for(int j = 0 ; j < this.matrix[0].length; j++){
                    res[i][j] = a*res[i][j];
                }
            }

        Matrix result = new Matrix(res);
        return result;

    }

    public  Matrix add(Matrix m){
        double[] res = new double[m.width*m.height];
        if(m.width != this.width || m.height != this.height){
            System.out.println("Matrix addition only possible with matracies of the same dimensions");
        }else{
            for(int i = 0; i < m.height; i++){
                for(int j = 0 ; j < m.width; j++){


                    res[(i * this.width) + j]  = (this.matrix[i][j] + m.getElement(i,j));
                }
            }
        }
        Matrix result = new Matrix(m.width, m.height, res);
        return result;
    }


}
