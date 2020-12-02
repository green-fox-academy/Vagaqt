package Main;

public class BlogPost {
    public String authorName;
    public String title;
    public String text;
    public String publicationDate;

    public static void main(String[] args) {
        BlogPost blog1 = new BlogPost();
        BlogPost blog2 = new BlogPost();
        BlogPost blog3 = new BlogPost();
        blog1.authorName = "John Doe";
        blog1.title="Lorem Ipsum";
        blog1.text = "Lorem ipsum dolor sit amet.";
        blog1.publicationDate = "2000.05.04";

        blog2.authorName = "Tim Urban";
        blog2.title="Wait but why";
        blog2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blog2.publicationDate = "2010.10.10";

        blog3.authorName = "William Turton";
        blog3.title="One Engineer Is Trying to Get IBM to Reckon With Trump";
        blog3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        blog3.publicationDate = "2017.03.28.";

        System.out.println(blog3.title +" by "+blog3.authorName);
        System.out.println("Published on: "+blog3.publicationDate);
        System.out.println(blog3.text);
    }
}