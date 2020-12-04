public class Strings {
    // Given a string, compute recursively (no loops) a new string where
    // all the lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {
        String test = "xxxxxxxxxx";
        System.out.println(replace(test, "x", "y"));
    }

    static String replace(String s, String xX, String yY) {
        int index = s.indexOf(xX);
        int endIndex = index + xX.length();

        if (index < 0) {
            return s;
        } else {
            return s.substring(0, index) + yY +
                    replace(s.substring(endIndex), xX, yY);
        }
    }
}

