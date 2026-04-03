package StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String first = sc.nextLine();
        System.out.print("Enter the second String: ");
        String second = sc.nextLine();
        if(first.length() == second.length()){
            char chr[] = first.toCharArray();
            char ch1[] = second.toCharArray();

            Arrays.sort(chr);
            Arrays.sort(ch1);
            if(Arrays.equals(chr,ch1)){
                System.out.println("An Anagram");
            }else{
                System.out.println("Not an Anagram");
            }
        }else{
            System.out.println("Not an anagram string");
        }
    }
}
