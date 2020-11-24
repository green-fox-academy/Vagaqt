public class TakesLonger {
    public static void main(String... args) {

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String always = " always take longer than ";
        System.out.println(quote.indexOf('y'));
        String quoteBegin = quote.substring(0, 20);
        String quoteEnd = quote.substring(21);
        System.out.println(quoteBegin+always+quoteEnd);
    }
}
