package by.itstep.lesson27.task01.model;

public class Student extends Human{
    private double mark;


    public Student(){
        super();
        mark = 4;
    }
    public Student(String name, int age, double mark){
        super(name, age);
        this.mark = mark;
    }
    public Student(Student student){
        this(student.name, student.age, student.mark);
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return  super.toString() + ", mark=" + mark;
    }
}
