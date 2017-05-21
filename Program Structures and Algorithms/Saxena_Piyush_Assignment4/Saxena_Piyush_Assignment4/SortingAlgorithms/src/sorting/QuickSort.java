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
public class QuickSort implements ISortStrategy {

    @Override
    public int[] sort(int[] input) {
        long startTime, endTime = 0;
        startTime = System.nanoTime();
        int low = 0;
        int high = input.length - 1;
        quickSort(input, low, high);
        endTime = System.nanoTime();
        System.out.println("Time Taken by Quick Sort : " + (endTime - startTime));
        return input;
    }

    private void quickSort(int[] input, int low, int high) {
        if(input==null || input.length == 0){
            return;
        }
        if(low>=high){
            return;
        }
        int middle = low + (high - low)/2;
        int pivot = input[middle];
        int i = low;
        int j = high;
        while(i<=j){
            while(input[i] < pivot){
                i++;
            }
            while(input[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        if(low < j){
            quickSort(input, low, j);
        }
        if(high > i){
            quickSort(input, i, high);
        }
    }
    
}
