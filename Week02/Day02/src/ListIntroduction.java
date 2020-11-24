import java.util.ArrayList;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {
        List<String>names = new ArrayList();
        names.add("William");
//        add William, print out list
//        System.out.println(names);
        names.add("John");
        names.add("Amanda");
//        print out 3rd element
//        System.out.println(names.get(2));

//        iterate through the list and print
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

//        iterate through the list and print with numbers
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i+1)+". "+names.get(i));
        }

//        remove 2nd element, iterate in reverse order
//        names.remove(1);
        for (int i = names.size(); i > 0; i--) {
            System.out.println(names.get(i-1));
        }
//        remove all elements
        names.clear();
        System.out.println(names);
    }
}
