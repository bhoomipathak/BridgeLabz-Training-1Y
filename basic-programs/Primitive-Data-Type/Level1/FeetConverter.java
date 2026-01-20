import java.util.Scanner;

class FeetConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in feet is " + feet +
                " while in yards is " + yards +
                " and miles is " + miles);
    }
}
