package by.itstep.lesson27.task01.controller;

import by.itstep.lesson27.task01.model.Human;
import by.itstep.lesson27.task01.model.Student;

public class Test extends Object {
    public static void main(String[] args) {
        Student s = new Student("Alex", 25, 10);
        System.out.println(s.toString());

        Human human = new Human();
        Human human1 = new Student();
        Object o = new Human();
        o = new Student();

    }
}
