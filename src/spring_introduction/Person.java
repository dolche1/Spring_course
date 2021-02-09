package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is initialized");
    }

//    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class person: AnyMethod");
    }
    public void callYouPet() {
        pet.say();
    }

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    @Autowired
//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println("Hello my lovely pet!");
//        pet.say();
//    }


}
