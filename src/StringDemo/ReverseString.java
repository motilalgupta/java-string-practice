package StringDemo;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Motilal";

        // Printing string value

        StringBuffer sb = new StringBuffer("Motilal");
        for(int i = 0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }

        // Reverse string and print

        System.out.println();
        for(int i = s.length()-1; i>=0; i--){
                System.out.println(s.charAt(i));
            }

        // Storing reverse value in the empty string called revString

        String revString= "";
        for(int i =s.length()-1; i>=0; i--){
            revString += s.charAt(i);
        }
        System.out.print(revString);
        }

//        System.out.println(sb.reverse());     // reverse method is available for StringBuffer and Builder classes

    }

