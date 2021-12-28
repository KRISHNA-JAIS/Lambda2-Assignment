package Assignment;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        NextEven obj = (a) -> {
            if (a % 2 == 0) {
                return a + 2;
            } else {
             return a + 1;
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ::");
        Long a = sc.nextLong();
        System.out.println(obj.even(a));
    }

}
