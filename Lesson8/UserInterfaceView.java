package JavaCore.Lesson6;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите имя города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня; " + "Введите 2 для получения данных из базы; " +
                    "Введите 5 для прогноза на 5 дней; Для выхода введите 0:");

            String command = scanner.nextLine();


            //TODO* Сделать метод валидации пользовательского ввода

            if (command.equals("0")) break;
            if (command.equals("1") || command.equals("5") || command.equals("2")) {

                try {
                    controller.getWeather(command, city);
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Введено неверное значение! Попробуйте снова..");

            }

        }


    }
}


