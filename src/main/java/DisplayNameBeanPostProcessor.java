package main.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

    public java.lang.Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization called " + beanName);
        return bean;
    }


    public java.lang.Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization called   " + beanName);
        return bean;
    }

}
