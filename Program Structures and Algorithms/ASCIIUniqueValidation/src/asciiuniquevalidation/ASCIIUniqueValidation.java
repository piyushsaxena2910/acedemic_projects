/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asciiuniquevalidation;

import java.util.Scanner;

/**
 *
 * @author Piyush
 */
public class ASCIIUniqueValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringToValidate;
        System.out.print("Enter the String: ");
        stringToValidate = in.next();
        int checker = 0;
        for (int i = 0; i < stringToValidate.length(); i++) {
        int value = stringToValidate.charAt(i) - 'a';
        if ((checker & (1 << value)) > 0) 
            System.out.println("Not unique!");
        checker |= (1 << value);
    }
    System.out.println("Unique!");
}
}