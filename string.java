import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int sumLengths = s1.length() + s2.length();
        System.out.println(sumLengths);

        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String s1Capitalized = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String s2Capitalized = s2.substring(0, 1).toUpperCase() + s2.substring(1);

        System.out.println(s1Capitalized + " " + s2Capitalized);
        
        scanner.close();
    }
}
