package lesson6;

public class Animal {
    String name;
    String color;
    int distance_run;
    int distance_swim;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;

    }


    public void run(int distance_run) {
        this.distance_run = distance_run;
        System.out.println("Животное пробежало " + distance_run);
    }

    public void swim() {
        System.out.println("Животное проплыло " + distance_swim);
    }
}

class Cat extends Animal {
    public void run(int distance_run) {
        this.distance_run = distance_run;
        if (distance_run <= 200 && distance_run > 0) {
            System.out.println("Кот " + name + " пробежал: " + distance_run + "м");
        } else {
            System.out.println("Кот " + name + " не может столько пробежать!");
        }
    }
    public void swim(int distance_swim) {
        this.distance_swim = distance_swim;
        System.out.println("Кот " + name + " не умеет плавать!");
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }


}

class Dog extends Animal {
    public void run(int distance_run) {
        this.distance_run = distance_run;
        if (distance_run <= 500 && distance_run > 0) {
            System.out.println("Пёс " + name + " пробежал: " + distance_run + "м");
        } else {
            System.out.println("Пёс " + name + " не может столько пробежать!");
        }
    }
    public void swim(int distance_swim) {
        this.distance_swim = distance_swim;
        if (distance_swim<=10 && distance_swim>0) {
            System.out.println("Пёс " + name + " проплыл " + distance_swim + "м");
        }else {
            System.out.println("Пёс " + name + " не может столько проплыть!");
        }
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;

    }
}

class animalApp {
    public static void main(String[] args) {
        Cat cat_barsik = new Cat("Барсик", "Белый");
        Dog dog_sharik = new Dog("Шарик", "Черный");
        cat_barsik.run(1);
        dog_sharik.run(501);
        dog_sharik.swim(9);
        cat_barsik.swim(10);


    }
}

