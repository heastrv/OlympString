import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(""+s.charAt(3-1) + s.charAt(7-1) + s.charAt(11-1));
        int n = s.length();
        System.out.println(""+s.charAt(0) + s.charAt(n-2) + s.charAt(n-1));
        System.out.println(""+s.substring(0,7));
        System.out.println(""+s.substring(4));
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        System.out.println(n/2);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.reverse());

    }
}
