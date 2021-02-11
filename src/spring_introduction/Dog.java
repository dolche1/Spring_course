package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet {

    @PostConstruct
    protected void init() {
        System.out.println("Class Dog: Init method");
    }

    @PreDestroy
    protected void destroy() {
        System.out.printf("Class Dog: Destroy method");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("wow wow");
    }


}
