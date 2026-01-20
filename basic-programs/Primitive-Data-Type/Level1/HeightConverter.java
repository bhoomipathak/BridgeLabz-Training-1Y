import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        System.out.println("Your Height in cm is " + cm +
                           " while in feet is " + (int)(inches/12) +
                           " and inches is " + (inches%12));
    }
}
