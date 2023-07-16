import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programmer: Tiarah Shard");
        System.out.println("Lab 18.3 July 4, 2023 @ 11:30:00");

        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        int[] scores = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter test score #" + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        double average = calcAverage(scores);

        System.out.println(name + ", here are the grades and the average:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Test " + (i + 1) + ": " + determineGrade(scores[i]));
        }

        System.out.println("Average score: " + average);
        System.out.println("Average Letter Grade: " + determineGrade(average));
    }

    public static double calcAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static char determineGrade(double score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

