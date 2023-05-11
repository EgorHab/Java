package JavaCore.Lesson6;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseRepository {
    private String insertWeather = "insert into weather (city, date, temperature) values (?, ?, ?)";
    private String getWeather = "select * from weather";
    private static final String URL = "jdbc:sqlite:C:\\Users\\freiv\\OneDrive\\Рабочий стол\\sqlite\\weather.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean saveWeatherToDataBase(Weather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL)) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getDate());
            saveWeather.setDouble(3, weather.getTemperature());



            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Сохранение погоды в базу данных не выполнено!");

    }





    public List<Weather> getSavedToDBWeather() {
        List<Weather> weathers = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeather);
            while (resultSet.next()) {
                //System.out.print(resultSet.getInt("id"));
                //System.out.println(" ");
                System.out.print(resultSet.getString("city"));
                System.out.println(" ");
                System.out.print(resultSet.getString("date"));
                System.out.println(" ");
                System.out.print(resultSet.getDouble("temperature"));
                System.out.println(" ");
                System.out.println("-------------------------------");
                weathers.add(new Weather(resultSet.getString("city"),
                        resultSet.getString("date"),
                        resultSet.getDouble("temperature")));
                //connection.close();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return weathers;

    }

    public static void main(String[] args) throws SQLException {
        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        System.out.println(dataBaseRepository.getSavedToDBWeather());
        //System.out.println(dataBaseRepository.saveWeatherToDataBase(new Weather("Moscow", "25.12.2021", 35.5d)));
    }
}