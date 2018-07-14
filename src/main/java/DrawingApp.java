package main.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class DrawingApp{
    public static void main(String[] args) {
        //BeanFactory myBeanFactory = new XmlBeanFactory(new FileSystemResource("/home/arrow/IdeaProjects/drawing-app/drawing-app/src/main/resources/spring.xml"));

       ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
        main.java.Triangle triangle = (main.java.Triangle)context.getBean("triangle");
        triangle.draw();

    }
}