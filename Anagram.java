class Anagram {
    public static void main(String[] args) {
        String s1 = "elbow";
        String s2 = "below";

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        boolean same = true;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                same = false;
                break;
            }
        }

        if (same)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
    

