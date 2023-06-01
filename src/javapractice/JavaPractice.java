/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;
import java.util.Arrays;
/**
 *
 * @author nguye
 */


public class JavaPractice{
    public static void main(String[] args){        
        char[] newArr = "Hello World".toCharArray();
        char[] inversedArr = new char[newArr.length];
        for (int i =0; i < newArr.length; i++){
            inversedArr[i] = newArr[newArr.length -1 -i];
        }
        String result = new String(inversedArr);
        System.out.println(result);
        System.out.println("branch");
        
        
        
    }
    
   
    
    
    
}