package spring_introduction;

public class Dog implements Pet {

    protected void init() {
        System.out.println("Class Dog: Init method");
    }

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
