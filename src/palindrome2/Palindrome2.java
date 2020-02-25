/*
 * Mouner Dabjan 
 * 24/02/2020
 * This program will count the number of palindrome words in a sentence 
 */
package palindrome2;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    //Assigning an array list 
    static ArrayList<String> palindrome = new ArrayList();

    public static void main(String[] args) {
        //Asking the user for the sentence
        String input = JOptionPane.showInputDialog(" Enter a sentence ( do not include a punctuation mark) ") + " ";
        //spliting the sentence
        String[] word = input.split(" ");
        // Reversing then adding the palindromes to my ArrayList
        for (int i = 0; i < word.length; i++) {
            String reverse = "";
            for (int j = word[i].length() - 1; j >= 0; j--) {
                reverse += word[i].charAt(j);

            }

            if (word[i].equalsIgnoreCase(reverse)) {
                palindrome.add(word[i]);
            }

        }
        //outputting the number of palindromes
        JOptionPane.showMessageDialog(null, " There are " + palindrome.size() + " Palindromes in this sentece");
        String output = "";
        // outputting the palindromes
        if (palindrome.size() > 0) {

            for (int m = 0; m < palindrome.size(); m++) {
                output += palindrome.get(m) + " , ";
            }
        }
        output = output.substring(0, output.length() - 2);
        JOptionPane.showMessageDialog(null, " The palindrome words are " + output);

    }

}
