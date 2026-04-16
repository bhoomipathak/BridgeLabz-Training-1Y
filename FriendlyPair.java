public class FriendlyPair {
    static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int a = 6, b = 28;

        double r1 = (double) sum(a) / a;
        double r2 = (double) sum(b) / b;

        if (r1 == r2)
            System.out.println("Yes, they are friendly pair");
        else
            System.out.println("No, they are not friendly pair");
    }
}

    

