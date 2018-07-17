package main.java;

public class Circle implements main.java.Shape {

    private main.java.Point Center;

    public main.java.Point getCenter() {
        return Center;
    }

    public void setCenter(main.java.Point center) {
        Center = center;
    }



    public void draw() {
        System.out.println("Circle drawn : \nPoint is (" + Center.getX() + ", " + Center.getY() + " )");
    }
}
