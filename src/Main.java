import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;

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
                System.out.println("You did not inout a number :(");
            }
        }


        System.out.println("Feeling Lucky? :)");
        int[] dice = new int[numOfRolls];

        for (int j = 0; j < numOfRolls; j++) {
            int DiceNum = (int) (Math.random() * numOFSides) + 1;
            dice[j] = DiceNum;

        }

            System.out.println(Arrays.toString(dice));

            System.out.println("Here is your highest, median, lowest or average number");

            MathForArray.HighestNum(dice);
            MathForArray.MedianNum(dice);
            MathForArray.LowestNum(dice);
            MathForArray.AverageNum(dice);
        }


