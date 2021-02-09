package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet dog = context.getBean("myPet", Pet.class);
        Pet cat = context.getBean("cat", Pet.class);

        dog.say();
        cat.say();
        context.close();

    }
}
