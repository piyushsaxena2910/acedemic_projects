/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neonataljavaproject;

import java.util.Random;

/**
 *
 * @author Piyush
 */
public class GenerateRandomNumbers {
public int genrateRandomNumber(int Low, int High){
    Random r = new Random();
    int Result = r.nextInt(High-Low) + Low;
    return Result;
}


}
