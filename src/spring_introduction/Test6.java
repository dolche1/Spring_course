package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person1 = context.getBean("personBean", Person.class);
//        Person person2 = context.getBean("personBean", Person.class);
        System.out.println(person1.getSurname());
        System.out.println(person1.getAge());


        context.close();
    }
}
