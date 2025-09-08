import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Number of rolls");

        Integer numberOfRolls = userInput.nextInt();

        System.out.println("Choose sides of die");

        Integer numbersOfSides = userInput.nextInt();

        System.out.println("Feeling Lucky? :)");

        ArrayList<Integer> dice = new ArrayList<Integer>();

        for (int j = 0; j < numberOfRolls; j++) {
            int DiceNum = (int)(Math.random() * numbersOfSides) + 1;
            dice.add(DiceNum);
        }
        System.out.println(dice);

        }
    }


