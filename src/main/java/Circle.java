package main.java;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements main.java.Shape {

    private main.java.Point Center;

    public main.java.Point getCenter() {
        return Center;
    }

    @Required
    public void setCenter(main.java.Point center) {
        Center = center;
    }



    public void draw() {
        System.out.println("Circle drawn : \nPoint is (" + Center.getX() + ", " + Center.getY() + " )");
    }
}
