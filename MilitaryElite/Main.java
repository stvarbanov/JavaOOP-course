package exercise.MilitaryElite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String command = input.substring(0,input.indexOf(" "));





            input = scanner.nextLine();
        }

//        TODO PRINT INPUT IN WHILE




    }
}
