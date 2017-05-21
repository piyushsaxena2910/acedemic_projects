/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import java.util.Scanner;

/**
 *
 * @author Muddassar
 */
public class Question10 {
    
    public boolean solve(String input)
    {
        String stringToValidate = input;
        Stack so = new Stack();
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
                    return false;
                }
                if(!String.valueOf(so.pop()).equals("(")){
                    System.out.println("Parantheses Mismatch!");
                    return false;
                }
            }
            else if(stringToValidate.charAt(i) == '}'){
                if(so.isEmpty()){
                    System.out.println("Parantheses Mismatch!");
                    return false;
                }
                if(!String.valueOf(so.pop()).equals("{")){
                    System.out.println("Parantheses Mismatch!");
                    return false;
                }
            }
            else if(stringToValidate.charAt(i) == ']'){
                if(so.isEmpty()){
                    System.out.println("Parantheses Mismatch!");
                    return false;
                }
                if(!String.valueOf(so.pop()).equals("[")){
                    System.out.println("Parantheses Mismatch!");
                    return false;
                }
            }
            else{
                System.out.println("Not a Parantheses!");
                return false;
            }
        }
        if(so.isEmpty()){
            System.out.println("Parantheses Match!");
            return true;
        }
        else{
            System.out.println("Parantheses Mismatch!");
            return true;
        }
    }
    
}
