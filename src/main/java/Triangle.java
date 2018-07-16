package main.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

import java.util.List;

class Triangle implements BeanNameAware, ApplicationContextAware {


    List<main.java.Point> points;
//    private main.java.Point pointA;
//    private main.java.Point pointB;
//    private main.java.Point pointC;

    private ApplicationContext context = null;

    public List<main.java.Point> getPoints() {
        return points;
    }

    public void setPoints(List<main.java.Point> points) {
        this.points = points;
    }

    public void draw(){

        System.out.println("Point = ( " + points.get(0).getX() + ", " + points.get(0).getY() + ")");
        System.out.println("Point = ( " + points.get(1).getX() + ", " + points.get(1).getY() + ")");
        System.out.println("Point = ( " + points.get(2).getX() + ", " + points.get(2).getY() + ")");

        System.out.println("Triangle with list of 3 points drawn");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println(" Application context ware implemented");
    }

    public void setBeanName(String s) {
        System.out.println("Bean name is :" + s);
    }
}