import java.util.*;

public class ThreeSubjectPercent {
    public static void main(String args[]) {

        Scanner a = new Scanner(System.in);

        int sub1 = a.nextInt();
        int sub2 = a.nextInt();
        int sub3 = a.nextInt();

        int percent = (sub1 + sub2 + sub3) * 100 / 300;

        if(percent >= 80){
            System.out.println("Level4, above agency-normalized standards");
        }
        else if(percent >= 70 && percent < 80){
            System.out.println("Level3, at agency-normalized standards");
        }
        else if(percent >= 60 && percent < 70){
            System.out.println("Level2, below but approaching standards");
        }
        else if(percent >= 50 && percent < 60){
            System.out.println("Level1, well below standards");
        }
        else if(percent >= 40 && percent < 50){
            System.out.println("Level 1-, too below standards");
        }
        else{
            System.out.println("Remedial Standards");
        }
    }
}
