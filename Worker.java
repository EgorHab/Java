package lesson5;

public class Worker {
    static Worker[] workersArray = new Worker[5];
    int i;


    public String name;
    public String profession;
    public String email;
    public String phoneNumber;
    public float salary;
    public int age;

    public Worker(String name, String profession, String email, String phoneNumber, float salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        newArrPerson();


    }


    public static void newArrPerson() {
        //Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Иванов Иван Иванович", "Engineer", "ivanov@mail.ru", "+79999999999", 60000, 41);
        workersArray[1] = new Worker("Петров Петр Петрович", "Developer", "devpetrov@gmail.com", "+9988776655", 90000, 25);
        workersArray[2] = new Worker("Сидоров Сидор Сидорович", "intern", "drinksidr@yandex.ru", "", 10000, 90);
        workersArray[3] = new Worker("Владимиров Владимир Владимирович", "devops", "", "+109108107", 500000, 42);
        workersArray[4] = new Worker("Ноунеймов Ноунейм Ноунеймович", "noJob", "noemail@noemail.com", "+00000000", 100000, 26);
        int i;
        for (i = 0; i < 5; i++) {
            if (workersArray[i].age > 40) {
                System.out.println("Worker{" + "name:" + workersArray[i].name + ", profession:" + workersArray[i].profession + ", email:" + workersArray[i].email + ", phone number:" + workersArray[i].phoneNumber + ", salary:" + workersArray[i].salary + ", age:" + workersArray[i].age + "}");

            }

        }


    }


}
//workersArray[i].name

//






