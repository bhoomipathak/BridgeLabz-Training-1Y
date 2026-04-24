
import java.util.*;

public class SensorLogger {

    public static void logData(Double value) {
        if (value == null) {
            System.out.println("No data");
        } else {
            System.out.println("Logged value: " + value);
        }
    }

    public static void main(String[] args) {
        double temp1 = 25.5;   // primitive
        Double temp2 = 30.2;   // wrapper

        logData(temp1); // autoboxing
        logData(temp2);

        Double temp3 = null;
        logData(temp3);
    }
}