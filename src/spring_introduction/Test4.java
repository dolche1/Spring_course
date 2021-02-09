package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        System.out.println("test");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

//        System.out.println(myDog == yourDog);
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}
