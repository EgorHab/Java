package JavaCore.Lesson3;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Box<Apple> aplleBox = new Box<>();
        aplleBox.addFruit(new Apple(1));
        aplleBox.addFruit(new Apple(1));
        aplleBox.addFruit(new Apple(1));
        aplleBox.addFruit(new Apple(1));
        aplleBox.addFruit(new Apple(1));
        aplleBox.addFruit(new Apple(1));
        //aplleBox.addFruit(new Apple(1));



        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        //orangeBox.addFruit(new Orange(1.5f));

        Box<Apple> secondAppleBox = new Box<>();
        secondAppleBox.addFruit(new Apple(1));
        secondAppleBox.addFruit(new Apple(1));






        System.out.println("Вес коробки с апельсинами: " + orangeBox.getFinalWeight());
        System.out.println("Вес коробки с яблоками: " + aplleBox.getFinalWeight());

        System.out.println(orangeBox.toCompare(aplleBox));

        secondAppleBox.moveToOtherBox(aplleBox);




    }






}
