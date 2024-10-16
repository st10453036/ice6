/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author RC_Student_lab
 */
public class vowel {
       public static int countVowels(String sentence) {
        // Convert the sentence to lowercase to handle both upper and lowercase vowels
        sentence = sentence.toLowerCase();
int vowelCount = 0;
 
         // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
 
    public static void main(String[] args) {
        
    }
}
