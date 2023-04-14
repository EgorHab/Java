package JavaCore.lesson1;

public class Players {
    private String name;
    private int energy;
    private int age;

    public Players (String name, int energy, int age) {
        this.name = name;
        this.energy = energy;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getAge() {
        return age;
    }
}
