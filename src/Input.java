import java.util.Scanner;

public class Input {
    public static int nextInt() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    public static int nextInt(String message) {
        System.out.print(message);
        return nextInt();
    }

    public static String next() {
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }

    public static String next(String message) {
        System.out.print(message);
        return next();
    }
}
