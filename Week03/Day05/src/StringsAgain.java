public class StringsAgain {
    // Given a string,
    // compute recursively a new string where
    // all the 'x' chars have been removed.
    public static void main(String[] args) {
        String test = "xobxxboaisbxxcascbqixsvadiqxxxx";
        System.out.println(replace(test, "x"));
    }

    static String replace(String s, String xX) {
        int index = s.indexOf(xX);
        int endIndex = index + xX.length();
        if (index < 0) {
            return s;
        } else {
            return s.substring(0, index) + "" +
                    replace(s.substring(endIndex), xX);
        }
    }
}