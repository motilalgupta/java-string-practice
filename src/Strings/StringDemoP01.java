package StringDemo;

public class StringDemoP01 {
    public static void main(String[] args) {
        String s = new String("Motilal");
        String s1= "Motilal";
        String s2 = "Motilal";

        String s3 = "Raj";

        String s4 = new String("Mohit");

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(System.identityHashCode(s4));

    }
}
