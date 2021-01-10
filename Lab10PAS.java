import java.util.Scanner;

interface Animal{
}

class Dog implements Animal{
    public void run(int a) {
        if (a<500){
            System.out.println("Собака бегает: true");
        }
        else {
            System.out.println("Собака бегает: false");
        }
    }
    public void swim(int a) {
        if (a<10){
            System.out.println("Собака плавает: true");
        }
        else {
            System.out.println("СОбака плавает: false");
        }
    }

    public void jump(double a) {
        if (a<0.5){
            System.out.println("Собака прыгает: true");
        }
        else {
            System.out.println("Собака прыгает: false");
        }
    }
}

class Cat implements Animal{
    public void run(int a) {
        if (a<200){
            System.out.println("Кот бегает: true");
        }
        else System.out.println("Кот бегает: false");
    }
    public void swim(int a) {
        if (a<=0){
            System.out.println("Кот плавает: true");
        }else
            System.out.println("Кот плавает: false");
    }

    public void jump(double a) {
        if (a<2){
            System.out.println("КОт прыгает: true");
        }
        else System.out.println("Кот прыгает: false");

    }
}
public class Lab10PAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кот или Собака?");
        String name = sc.nextLine();
        if (name.equals("Собака")) {
            sc.nextLine();
            System.out.println("Введите длину бега ");
            int distance1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите высоту прышка ");
            double distance2 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Введите длину плавания ");
            int distance3 = sc.nextInt();
            Dog good = new Dog();
            good.run(distance1);
            good.jump(distance2);
            good.swim(distance3);
        }
        if (name.equals("Кот")) {
            System.out.println("Введите длину бега ");
            int distance1 = sc.nextInt();
            System.out.println("Введите высоту прышка ");
            double distance2 = sc.nextDouble();
            System.out.println("Введите длину плавания ");
            int distance3 = sc.nextInt();
            Cat god = new Cat();
            god.run(distance1);
            god.jump(distance2);
            god.swim(distance3);
        }
    }
}