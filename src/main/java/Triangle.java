package main.java;


import java.util.List;

class Triangle{

    private List<main.java.Point> points;

    public List<main.java.Point> getPoints() {
        return points;
    }

    public void setPoints(List<main.java.Point> points) {
        this.points = points;
    }

    //
//    private main.java.Point pointA;
//    private Point pointB;
//    private Point pointC;
//
//    public Point getPointA() {
//        return pointA;
//    }
//
//    public void setPointA(Point pointA) {
//        this.pointA = pointA;
//    }
//
//    public Point getPointB() {
//        return pointB;
//    }
//
//    public void setPointB(Point pointB) {
//        this.pointB = pointB;
//    }
//
//    public Point getPointC() {
//        return pointC;
//    }
//
//    public void setPointC(Point pointC) {
//        this.pointC = pointC;
//    }

    public void draw(){

        for(Point point: points){
            System.out.println("Point = ( " + point.getX() + ", " + point.getY() + ")");
        }
        System.out.println("Triangle with list of 3 points drawn");
    }
}