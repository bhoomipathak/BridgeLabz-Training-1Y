public class Replace {
    public static void main(String[] args) {
        int num = 100030;

        String result = String.valueOf(num).replace('0', '1');
        int updatedNum = Integer.parseInt(result);

        System.out.println(updatedNum);
    }
}
    

