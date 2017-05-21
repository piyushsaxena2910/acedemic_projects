/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplicationstrassensestimator;

import java.util.Random;

/**
 *
 * @author Piyush
 */
public class RandomNumberGernerator {
    public int generateRandomNumber(int ceil, int floor){
        Random r = new Random();
        int randomNumber = r.nextInt(ceil-floor) + floor;
        return randomNumber;
    }
}
