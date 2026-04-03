package StringDemo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println("It is a Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}
