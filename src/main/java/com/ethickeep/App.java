package com.ethickeep;

import com.ethickeep.configs.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class App {
    public static void main(String... args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
