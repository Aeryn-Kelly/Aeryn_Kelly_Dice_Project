import java.util.Arrays;


void main() {
}

public class Math_For_Array {

    static void HighestNum(int[] dice) {

        int maxNumber = dice[0];

        for (int i = 1; i < dice.length; i++) {
            if (dice[i] > maxNumber) {
                maxNumber = dice[i];


            }
        }

        System.out.println("Highest number, " + maxNumber);

    }
}

    static void MedianNum(int[] dice) {

    Arrays.sort(dice);

    double median;
    int middleIndex = dice.length / 2;

    if (dice.length % 2 == 1) {
        median = dice[middleIndex];
    } else {
        median = (double) (dice[middleIndex - 1] + dice[middleIndex]) / 2;

        System.out.println("Median number, " + median);

        }

    }


    static void LowestNum(int[] dice) {

        int lowestNumber = dice[0];

        for (int i = 1; i < dice.length; i++) {
            if (dice[i] < lowestNumber) {
                lowestNumber = dice[i];

            }
        }

        System.out.println("Lowest number: " + lowestNumber);

        }


    static void AverageNum(int[] dice) {

    int sum = 0;
        for (int number : dice) {
            sum += number;
        }

        double average = (double) sum / dice.length;

        System.out.println("Average: Number " + average);

    }





