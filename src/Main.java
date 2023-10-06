
public class Main {

    public static char calculateGrade(int score) {
        if(score >= 90) return 'A';
        else if(score >= 80) return 'B';
        else if(score >= 70) return 'C';
        else if(score >= 60) return 'D';
        else if(score >= 50) return 'E';
        else return 'F';
    }

    public static String fizzBuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0) return "fizzbuzz";
        else if(num % 3 == 0) return "fizz";
        else if(num % 5 == 0) return "buzz";
        else return "unlucky";
    }

    public static String frontBack(String str) {
        if(str.length() < 2) return str;
        return str.charAt(0) + "" + str.charAt(1) + str + str.charAt(0)+""+ str.charAt(1);
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static String endUp(String str) {
        if(str.length() < 3) return str.toUpperCase();
        return str.substring(0, str.length()-3);
    }

}
