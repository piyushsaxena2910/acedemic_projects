/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergenerator;

import java.util.Random;

/**
 *
 * @author Piyush
 */
public class RandomNumberGernerator {
    public void generateRandomNumber(int ceil, int floor){
        Random r = new Random();
        String randomNumbers = null;
        for(int i = 0; i < 5000; i++){
        int randomNumber = r.nextInt(ceil-floor) + floor;
        randomNumbers = randomNumbers + String.valueOf(randomNumber) + ",";
        }
        System.out.print(randomNumbers);
    }
}
