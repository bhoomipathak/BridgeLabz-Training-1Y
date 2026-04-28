import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println(
            "The maximum number of possible handshakes among " + numberOfStudents +
            " students is " + maxHandshakes
        );
    }
	}
	