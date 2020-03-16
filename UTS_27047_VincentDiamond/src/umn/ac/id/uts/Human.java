package umn.ac.id.uts;

public class Human {
    private String name;
    private int age;
    public Human() {
        this.name = "";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


}
