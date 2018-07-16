package main.java;

import org.springframework.beans.BeansException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

class Triangle implements ApplicationContextAware {

    private main.java.Point pointA;
    private main.java.Point pointB;
    private main.java.Point pointC;
    ApplicationContext context = null;

    public main.java.Point getPointA() {
        return pointA;
    }

    public void setPointA(main.java.Point pointA) {
        this.pointA = pointA;
    }

    public main.java.Point getPointB() {
        return pointB;
    }

    public void setPointB(main.java.Point pointB) {
        this.pointB = pointB;
    }

    public main.java.Point getPointC() {
        return pointC;
    }

    public void setPointC(main.java.Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){

        System.out.println("Point = ( " + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.println("Point = ( " + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println("Point = ( " + pointC.getX() + ", " + pointC.getY() + ")");

        System.out.println("Triangle with list of 3 points drawn");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println(" Application context ware implemented");
    }

    public void setBeanName(String s) {
        System.out.println("Bean name is :" + s);
    }
/*
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean init method is called");
    }

    public void destroy() throws Exception {
        System.out.println("Desposablebean destory method called");
    }
    */
    public void myInit(){
        System.out.println("My init method called for triangle");
    }

    public void cleanUp(){
        System.out.println("Destroy method called");
    }
}