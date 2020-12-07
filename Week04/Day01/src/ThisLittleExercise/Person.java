package ThisLittleExercise;

public class Person {
//    Create a Person class with the following fields:
//
//    name: the name of the person
//    age: the age of the person (whole number)
//    gender: the gender of the person (male / female)
//    And the following methods:
//
//    introduce(): prints out "Hi, I'm name, a age year old gender."
//    getGoal(): prints out "My goal is: Live for the moment!"
//    And the following constructors:
//
//    Person(name, age, gender)
//    Person(): sets name to Jane Doe, age to 30, gender to female

    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }
    public Person(){
        this("Jane Doe", 30,"female");
    }

    protected String commonIntroduce() {
        return "Hi, i'm " + name + " a " + age + " year old " + gender+" ";
    }

    public void introduce() {
        System.out.println(commonIntroduce());
    }

    public void getGoal() {
        System.out.println("My goal is:  Live for the moment!");
    }
}

