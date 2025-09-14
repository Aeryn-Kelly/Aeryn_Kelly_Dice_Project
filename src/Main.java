import java.util.Scanner;

import java.util.ArrayList;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfRolls = 0;
        int numOFSides = 0;
        boolean isValidInput = false;

        Scanner userInput = new Scanner(System.in);

        while (!isValidInput) {
            System.out.println("Number of rolls");
            String input = scanner.nextLine();

            System.out.println("Number of sides");
            String input2 = scanner.nextLine();

            try {
                numOfRolls = Integer.parseInt(input);
                numOFSides = Integer.parseInt(input2);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }

        while (!isValidInput) {
            System.out.println("Choose sides of die");
            String input = scanner.nextLine();

            try {
                numOfRolls = Integer.parseInt(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }


        System.out.println("Feeling Lucky? :)");

        ArrayList<Integer> dice = new ArrayList<Integer>();

        for (int j = 0; j < numOfRolls; j++) {
            int DiceNum = (int) (Math.random() * numOFSides) + 1;
            dice.add(DiceNum);

            }

        System.out.println(dice);

        System.out.println("Do you wish to know your highest, median, lowest or average number?");
        System.out.println("Type highest, median, lowest, average, respectively");

        String name = scanner.nextLine();

        System.out.println("something idk");

            }
        }

