package BeakjoonSolving;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (2 * N - 1) - (2 * i); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < N; i++) {
            for(int blank = 0; blank < N - i - 1; blank++) {
                System.out.print(" ");
            }
            for(int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
