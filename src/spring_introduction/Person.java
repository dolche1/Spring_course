package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Pet is set");
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

    public Person() {
        System.out.println("Person is created");
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }
}
