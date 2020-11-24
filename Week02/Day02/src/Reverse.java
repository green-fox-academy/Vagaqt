public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(toBeReversed.length());
        char tempStart;
        char tempEnd;
        for (int i = 0; i < toBeReversed.length() / 2; i++) {
            tempStart = toBeReversed.charAt(i);
            tempEnd = toBeReversed.charAt(toBeReversed.length() - i - 1);
            toBeReversed = toBeReversed.replace(toBeReversed.charAt(i), toBeReversed.charAt(i));
            toBeReversed = toBeReversed.replace(toBeReversed.charAt(toBeReversed.length() - i - 1), tempStart);
        }
        System.out.println(toBeReversed);
    }
}
