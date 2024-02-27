package by.itstep.lesson27.task01.model;

public class Human {
    protected String name;
    protected int age;

    public Human() {
        name = "no name";
        age = 16;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human human) {
        this(human.name, human.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ": age=" + age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }
}
