package api;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prompt = ">> ";

        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();

            if (input.equals("q") || input.equals("Q")) {
                break;
            }

            input = input.trim();
            String arr[] = input.split(" +");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].toLowerCase();
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
