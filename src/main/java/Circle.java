package main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements main.java.Shape {

    private main.java.Point center;

    public main.java.Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(main.java.Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Init method called using annotation");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Init method called using annotation");
    }

    public void draw() {
        System.out.println("Circle drawn : \nPoint is (" + center.getX() + ", " + center.getY() + " )");
    }
}
