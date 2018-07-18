package main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Circle implements main.java.Shape {

    private main.java.Point center;


    @Autowired
    private MessageSource messageSource;

    public main.java.Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(main.java.Point center) {
        this.center = center;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Init method called using annotation");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Init method destroyed using annotation");
    }

    public void draw() {
        System.out.println("Circle :" + this.messageSource.getMessage("drawing.circle", null,"Drawing Shape", null));
//        System.out.println("Circle drawn : \nPoint is (" + center.getX() + ", " + center.getY() + " )");
//        System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
        System.out.println(this.messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()}, "Default poing message",null ));

    }
}
