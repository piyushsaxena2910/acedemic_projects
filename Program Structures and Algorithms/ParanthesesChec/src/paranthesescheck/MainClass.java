/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paranthesescheck;

import java.util.Scanner;

/**
 *
 * @author Piyush
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringToValidate;
        StackOperations so = new StackOperations();
        System.out.print("Enter the String: ");
        stringToValidate = in.next();
        for(int i = 0; i < stringToValidate.length(); i++){
            if(stringToValidate.charAt(i) == '('){
                so.push('(');
            }
            else if(stringToValidate.charAt(i) == '{'){
                so.push('{');
            }
            else if(stringToValidate.charAt(i) == '['){
                so.push('[');
            }
            else if(stringToValidate.charAt(i) == ')'){
                if(so.isEmpty()){
                    System.out.println("Parantheses Mismatch!");
                    return;
                }
                if(!String.valueOf(so.pop()).equals("(")){
                    System.out.println("Parantheses Mismatch!");
                    return;
                }
            }
            else if(stringToValidate.charAt(i) == '}'){
                if(so.isEmpty()){
                    System.out.println("Parantheses Mismatch!");
                    return;
                }
                if(!String.valueOf(so.pop()).equals("{")){
                    System.out.println("Parantheses Mismatch!");
                    return;
                }
            }
            else if(stringToValidate.charAt(i) == ']'){
                if(so.isEmpty()){
                    System.out.println("Parantheses Mismatch!");
                    return;
                }
                if(!String.valueOf(so.pop()).equals("[")){
                    System.out.println("Parantheses Mismatch!");
                    return;
                }
            }
            else{
                System.out.println("Not a Parantheses!");
                return;
            }
        }
        if(so.isEmpty()){
            System.out.println("Parantheses Match!");
            return;
        }
        else{
            System.out.println("Parantheses Mismatch!");
            return;
        }
    }
    
}
