import java.util.Arrays;


void main() {
}

public class MathForArray {
    static void HighestNum(int[] dice) {

        int maxNumber = dice[0];

        for (int i = 1; i < dice; i++) {
            if (dice[i] > maxNumber) {
                maxNumber = dice[i];


            }
        }

        System.out.println("The highest number in the array is: " + maxNumber);

    }
}
    static void MedianNum(int dice) {

    }

    static void LowestNum(int dice) {

    }

    static void AverageNum(int dice) {

    }

