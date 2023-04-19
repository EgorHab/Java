package JavaCore.Lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox = new ArrayList<>();

    public Box() {
        //this.fruitBox = fruitBox;
    }


//    @Override
//    public String toString() {
//        return "Box{" +
//                "fruitBox=" + fruitBox +
//                '}';
//    }

    public float getFinalWeight() {
        return fruitBox.size() * fruitBox.get(1).getWeight();
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }
    public String boxName () {
        String name =  fruitBox.get(1).getName();
        return name;
    }

    public void setFruitBox(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }
    public boolean toCompare (Box<?> fruitBox) {
        float a = fruitBox.getFinalWeight();
        float b = getFinalWeight();
        float c = b - a;
        if (c == 0) {
            System.out.println();
            System.out.println("Коробки равны по весу!");
            return true;
        } else {
            if (c > 0) {
            System.out.println(boxName() + " весят больше!");
            } else {
                System.out.println(boxName() + " весят меньше!");
            }
        }
        return false;
    }
    public void moveToOtherBox (Box<T> box) {
        box.getFruitBox().addAll(fruitBox);
        fruitBox.clear();
        System.out.println();
        System.out.println("Теперь вес коробки с яблоками: " + box.getFinalWeight());
    }



    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }



}
