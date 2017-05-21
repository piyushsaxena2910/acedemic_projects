/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;



/**
 *
 * @author Piyush
 */
public class PerformSubtraction {
    static int numberOfAdditions = 0;
    static int numberOfSubtractions = 0;
    static int numberOfMultiplications = 0;
    public void subtraction(int[][]matrix1,int[][]matrix2, int n1, int m1){
        long startTime = System.nanoTime(); 
        for(int i = 0; i < n1; i++){
            System.out.println("");
            for(int j = 0; j < m1; j++){
                System.out.print(matrix1[i][j] - matrix2[i][j] + "  ");
                numberOfSubtractions++;
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("");
        System.out.println("Number of Additions Performed = " + numberOfAdditions);
        System.out.println("Number of Subtractions Performed = " + numberOfSubtractions);
        System.out.println("Number of Multiplications Performed = " + numberOfMultiplications);
        System.out.println("Duration of Execution = " + duration + " Nano Seconds");
    }
}
