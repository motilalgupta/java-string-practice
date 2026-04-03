package StringDemo;

public class Vowel {
    public static void main(String[] args) {
        String str = "Motilal Gupta";
        int vowel = 0, consonant = 0;

        str = str.toLowerCase();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                }else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowels are: "+vowel);
        System.out.println("Consonants are: "+consonant);
    }
}
// Questions
// Q1. Check if string is palindrome
// Eg madam
// 121

// Q2. Capitalize first letter of string
// Eg. java full stack
// o/p Java Full Stack

// Q3. Remove duplicate char string
// Eg. aabced
// o/p: abcd

// Q4. Check string is anagram