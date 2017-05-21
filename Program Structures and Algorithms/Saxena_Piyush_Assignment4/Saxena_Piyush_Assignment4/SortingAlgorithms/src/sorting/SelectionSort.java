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
public class SelectionSort implements ISortStrategy {

    @Override
    public int[] sort(int[] input) {
        long startTime, endTime = 0;
        startTime = System.nanoTime();
        int i, j, minValue, minIndex, temp = 0;
        for(i = 0; i < input.length; i++){
            minValue = input[i];
            minIndex = i;
            for(j = i; j < input.length; j++){
                if(input[j] < minValue){
                    minValue = input[j];
                    minIndex = j;
                }
            }
            if(minValue < input[i]){
                temp = input[i];
                input[i] = input[minIndex];
                input[minIndex] = temp;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by Selection Sort : " + (endTime - startTime));
        return input;
    }
    
}
