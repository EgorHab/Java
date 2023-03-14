package lesson7;

class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        int x = food -= n;
    }

    public void info() {
        System.out.println("В тарелке осталось: " + food);
    }

    public void addFood() {
        food += 1;
        System.out.println();
        System.out.println("В миску добавили корм, стало: " + food);
        System.out.println();
    }
}

public class Cat {
    static Cat[] catsArray = new Cat[3];
    public String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public static void newArrCats() {
        catsArray[0] = new Cat("Барсик", 5);
        catsArray[1] = new Cat("Хвостик", 4);
        catsArray[2] = new Cat("Кузя", 8);


    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }


}

class MainClass {
    public static void main(String[] args) {
        Cat.newArrCats();
        Plate plate = new Plate(100);
        int i;
        while (plate.food > 13) {

            for (i = 0; i < 3; i++) {
                Cat.catsArray[i].eat(plate);
                System.out.println("Кот " + Cat.catsArray[i].name + " покушал.");
                plate.info();
            }

                plate.addFood();

        }
    }
}







