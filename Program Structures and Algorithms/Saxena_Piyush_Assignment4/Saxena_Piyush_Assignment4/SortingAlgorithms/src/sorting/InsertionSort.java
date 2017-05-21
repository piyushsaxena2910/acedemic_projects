/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Muddassar
 */
public class InsertionSort implements ISortStrategy {

    @Override
    public int[] sort(int[] input) {
        long startTime, endTime = 0;
        startTime = System.nanoTime();
        int temp = 0;
        for(int i = 1; i < input.length; i++){
            for(int j = i; j > 0; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by Insertion Sort : " + (endTime - startTime));
        return input;
    }
    
}
