/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplicationstrassensestimator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Piyush
 */
public class MatrixMultiplicationStrassensEstimator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 0, m1 = 0, x1 = 0, y1 = 0, n2 = 0, m2 = 0, x2 = 0, y2 = 0;
        int operation = 0;
        Scanner in = new Scanner(System.in);
        RandomNumberGernerator rng = new RandomNumberGernerator();
        try{
        System.out.print("Enter the value of n for Matrix 1: ");
        n1 = in.nextInt();
        System.out.print("Enter the value of m for Matrix 1: ");
        m1 = in.nextInt();
        System.out.print("Enter the value of x for Matrix 1: ");
        x1 = in.nextInt();
        System.out.print("Enter the value of y for Matrix 1: ");
        y1 = in.nextInt();
        System.out.print("Enter the value of n for Matrix 2: ");
        n2 = in.nextInt();
        System.out.print("Enter the value of m for Matrix 2: ");
        m2 = in.nextInt();
        System.out.print("Enter the value of x for Matrix 2: ");
        x2 = in.nextInt();
        System.out.print("Enter the value of y for Matrix 2: ");
        y2 = in.nextInt();
        }
        catch(InputMismatchException ime){
            System.out.println("Incorrect Input - Please Enter only numbers. Error Text : " + ime);
        }
        
        if(!(x1<=y1)){
            System.out.println("Value of y1 should be greater than or equal to x1");
        }
        else if(!(x2<=y2)){
            System.out.println("Value of y2 should be greater than or equal to x2");
        }
        else if(!(n1 == n2 && m1 == m2)){
            System.out.println("The dimensions of the two matrices must be same.");
        }
        else{
        double[][]matrix1 = new double[n1][m1];
        double[][]matrix2 = new double[n2][m2];
        
        for(int i = 0 ; i < n1 ; i++){
            for(int j = 0 ; j < m1 ; j++){
                matrix1[i][j] = rng.generateRandomNumber(y1, x1);
            }
        }
        
        for(int i = 0 ; i < n2 ; i++){
            for(int j = 0 ; j < m2 ; j++){
                matrix2[i][j] = rng.generateRandomNumber(y2, x2);
            }
        }
        
        System.out.print("Matrix 1 : ");
        for(int i = 0 ; i < n1 ; i++){
            System.out.println("");
            for(int j = 0 ; j < m1 ; j++){
                System.out.print(matrix1[i][j] + "  ");
            }
        }
        System.out.println("");
        System.out.print("Matrix 2 : ");
        for(int i = 0 ; i < n2 ; i++){
            System.out.println("");
            for(int j = 0 ; j < m2 ; j++){
                System.out.print(matrix2[i][j] + "  ");
            }
        }
        PerformMultipication pm = new PerformMultipication();
        long startTime = System.nanoTime();
        pm.multiply(matrix1, matrix2);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("");
        System.out.println("Duration of Execution = " + duration + " Nano Seconds");
        System.out.println("Brute Force");
        pm.bruteForceMultiplication(matrix1, matrix2, n1, m1, n2, m2);
        /*System.out.println("");
        System.out.println("Enter the operation you want to perform : ");
        System.out.println("If you want to perform Brute Force Matrix Multiplication then Enter 1");
        System.out.println("If you want to perform Strassen's Matrix Multiplication then Enter 2");
        operation = in.nextInt();
        if(!(operation == 1 || operation == 2)){
            System.out.println("Invalid Input Program Terminated");
        }
        else{
            String operationToPerform = String.valueOf(operation);
            switch(operationToPerform){
                case "1":
                    if(!(m1==n2)){
                        System.out.println("The number of Columns in Matrix1 must be equal to the number of rows in Matrix2");
                    }
                    else{
                    PerformMultipication pm = new PerformMultipication();
                    pm.bruteForceMultiplication(matrix1, matrix2, n1, m1, n2, m2);
                    }
                    break;
                    
                case "2":
                    if(!(m1==n2)){
                        System.out.println("The number of Columns in Matrix1 must be equal to the number of rows in Matrix2");
                    }
                    else{
                    PerformMultipication pm = new PerformMultipication();
                    long startTime = System.nanoTime();
                    pm.multiply(matrix1, matrix2);
                    long endTime = System.nanoTime();
                    long duration = endTime - startTime;
                    System.out.println("");
                    System.out.println("Duration of Execution = " + duration + " Nano Seconds");
                    System.out.println("Brute Force");
                    pm.bruteForceMultiplication(matrix1, matrix2, n1, m1, n2, m2);
                    }
                    break;
            }
        }
                */
}
}
}