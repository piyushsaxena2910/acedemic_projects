/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import sorting.ISortStrategy;
import sorting.InsertionSort;
import sorting.QuickSort;
import sorting.SelectionSort;

/**
 *
 * @author Muddassar
 */
public class Solution {
    
    public void solve()
    {
        IScanner scanner = ScannerFactory.getScanner(EnumInputType.File);
        
        while(scanner.hasNext())
        {
            //Read inputs && Write logic to convert input to required format
            //Input format : input array of integers|output array of integers
            String st = scanner.next();
            String[] dataLine = st.split("\\|");
            String[] input = dataLine[0].split(",");
            String[] output = dataLine[1].split(",");
            
            int[] inputData = convertStringArraytoIntArray(input);
            int[] outputData = convertStringArraytoIntArray(output);
            
            //Call sorting algorithms
            
            ISortStrategy[] arr = new ISortStrategy[3];
            arr[0] = new QuickSort();
            arr[1] = new InsertionSort();
            arr[2] = new SelectionSort();
            for(ISortStrategy t : arr)
            {
                int[] result = t.sort(inputData);
                
                //Test output
                if(inputData!=null)
                {
                    for(int i=0;i<input.length;i++)
                    {
                        if(result==null || outputData[i] != result[i])
                        {
                            System.out.println("Sorting failed");
                            break;
                        }
                    }
                }
            }
            System.out.println("Sorting Passed");
        }
    }
    
    private int[] convertStringArraytoIntArray(String[] stringData)
    {
        int[] integerData = new int[stringData.length];
        for(int i=0;i<stringData.length;i++)
        {
            integerData[i] = Integer.parseInt(stringData[i]);
        }
        return integerData;
    }
    
}
