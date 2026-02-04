import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        List<String> lines = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine();
            lines.add(line);
            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " " + lines.get(i));
        }
    }
}
