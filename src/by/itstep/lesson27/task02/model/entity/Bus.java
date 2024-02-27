package by.itstep.lesson27.task02.model.entity;

public class Bus extends Vehicle{

    private int place;

    public Bus(int place) {
    super();
        this.place = place;
    }



    public int getPalce() {
        return place;
    }



    public void setPalce(int palce) {
        this.place = palce;
    }


    @Override
    public String toString() {
        return "Bus{" +
                "place=" + place +
                super.toString() +
        '}';
    }
}
