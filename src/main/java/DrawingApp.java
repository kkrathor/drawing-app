package main.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class DrawingApp{
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
        context.registerShutdownHook();
        main.java.Shape shape= (main.java.Shape)context.getBean("triangle");
        shape.draw();

    }
}