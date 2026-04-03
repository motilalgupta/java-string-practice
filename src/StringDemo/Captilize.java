package StringDemo;

public class Captilize {
    public static void main(String[] args) {
        String str = "java is the best programming language";

        String words[] = str.split(" ");
        String result = "";

        for(String word: words){
            String first = word.substring(0,1).toUpperCase();
            String rest = word.substring(1);
            result += first + rest + " ";
        }
        System.out.println(result);
    }
}
