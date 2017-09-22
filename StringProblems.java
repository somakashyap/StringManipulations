/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproblems;

/**
 *
 * @author somak
 */
public class StringProblems {

    static final int MAX_CHAR = 256;
    /**
     * Given a stream of unicode characters, count the frequency of seen 
     * characters and maintain a up-to-date collection of most frequent characters.
     */
    private static void charFrequencyMaxFrequency(String str){
    
        if (str == null || str.length() == 0){
            System.out.println("Input string is null or of size 0");
            return;
        }
        // there can be maximum 256 characters
        int count[] = new int[MAX_CHAR];
        for(int i = 0; i < MAX_CHAR; i++){
            count[i] = 0;
        }
        
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            count[(int)c]++;
        }
        
        // print the frequency of all characters in string and get the most
        // frequent characters
        int max = -1;
        // there can be multiple characters if they are at the same frequency
        String mostFrequentCharacters ="";
        char mostFrequent = ' ';
        
        for(int i = 0; i < MAX_CHAR; i++){
            if (count[i] != 0){
                System.out.println("Frequency of character ["+(char)i + "] = "+ count[i]); 
            }
            if (max < count[i]){
                max = count[i];
                mostFrequent = (char)i;
            }
        }
        mostFrequentCharacters = mostFrequentCharacters.concat(Character.toString(mostFrequent));
        // check if there are more characters at the max frequency
        for (int i = 0; i < MAX_CHAR; i++){
            if (count[i] == max && (char)i != mostFrequent){
                mostFrequentCharacters = mostFrequentCharacters.concat(Character.toString((char)i));
            }
        }
        
        // print the most frequent characters
        System.out.println("The most frequent character(s) in the string is "+ mostFrequentCharacters);
          
        
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str = "somakashyapzzz";
        charFrequencyMaxFrequency(str);
    }
    
}
