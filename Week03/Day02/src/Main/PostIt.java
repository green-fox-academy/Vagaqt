package Main;

public class PostIt {
    //    Create a PostIt class that has
//            a backgroundColor represented by a String
//            a text on it
//            a textColor represented by a String
//            Create a few example post-it objects:
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"
    public String backgroundColour;
    public String text;
    public String textColour;

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt();
        PostIt postIt2 = new PostIt();
        PostIt postIt3 = new PostIt();

        postIt1.backgroundColour = "orange";
        postIt1.text = "Idea 1";
        postIt1.textColour = "blue";

        postIt2.backgroundColour = "pink";
        postIt2.textColour = "black";
        postIt2.text = "Awesome";

        postIt3.backgroundColour = "yellow";
        postIt3.textColour = "green";
        postIt3.text = "Superb!";
    }
}




