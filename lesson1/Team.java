package JavaCore.lesson1;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    Players[] playerArray = new Players[4];
    Course[] courseArray = new Course[4];


    public void createTeam() {

        playerArray[0] = new Players("Иван", 100, 26);
        playerArray[1] = new Players("Пётр", 80, 28);
        playerArray[2] = new Players("Александр", 60, 30);
        playerArray[3] = new Players("Юлия", 95, 23);
    }

    public void createCourse() {
        courseArray[0] = new Course("Переход через реку", 10);
        courseArray[1] = new Course("Подъем в гору", 40);
        courseArray[2] = new Course("Поднимание тяжестей", 35);
        courseArray[3] = new Course("Зиплайн", 5);
    }

    public String getName() {
        return name;
    }


    public void allPlayerInfo() {
        System.out.println();
        System.out.println("Команда " + getName());
        for (int i = 0; i < 4; i++) {
            System.out.println("Игрок " + (i + 1) + " -" + " Имя: " + playerArray[i].getName() + ";" + " Энергия: " + playerArray[i].getEnergy() + ";" + " Возраст: " + playerArray[i].getAge());


        }
        System.out.println();

    }

    public void doIt() {


        for (int i = 0; i < 4; i++) {

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Участник " + playerArray[i].getName() + " проходит по очереди через препятствия..!");
            System.out.println();
            int one = playerArray[i].getEnergy() - courseArray[0].getDifficulty();
            if (one > 0) {
                System.out.println(courseArray[0].getName() + " ,осталось сил: " + one);
                int two = one - courseArray[1].getDifficulty();
                if (two > 0) {
                    System.out.println(courseArray[1].getName() + " ,осталось сил: " + two);
                    int three = two - courseArray[2].getDifficulty();
                    if (three > 0) {
                        System.out.println(courseArray[2].getName() + " ,осталось сил: " + three);
                        int four = three - courseArray[3].getDifficulty();
                        System.out.println(courseArray[3].getName() + " ,осталось сил: " + four);

                    } else {
                        System.out.println("Участник " + playerArray[i].getName() + " выдохся и больше не может проходить препятствия =(");

                    }
                } else {
                    System.out.println("Участник " + playerArray[i].getName() + " выдохся и больше не может проходить препятствия =(");
                }
            } else {
                System.out.println("Участник " + playerArray[i].getName() + " выдохся и больше не может проходить препятствия =(");
            }


        }

    }

    public void playerSuccessInfo() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        for (int i = 0; i < 4; i++) {

            int one = playerArray[i].getEnergy() - courseArray[0].getDifficulty();
            int two = one - courseArray[1].getDifficulty();
            int three = two - courseArray[2].getDifficulty();
            int four = three - courseArray[3].getDifficulty();
            if (one > 0 & two > 0 & three > 0 & four > 0) {


                System.out.println("Участник " + playerArray[i].getName() + " прошел все испытания!");
            }


        }


    }
}





