package JavaCore.Lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class AccuweatherModel implements WeatherModel {
    private static final String PROTOCOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "1gP0u83vZFCKAV2UHAKSbJeGhG2qJ5fk";
    //"29udJvTFlos1t8jWoiU2hfBRYFQh4nkc";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String DETAILS = "details=true";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";
    String nameCity;

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private DataBaseRepository dataBaseRepository = new DataBaseRepository();
    @Override
    public void getWeather(String selectedCity, Period period) throws IOException, SQLException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();

                //System.out.println(weatherResponse);

                String date = objectMapper.readTree(weatherResponse).at("/Headline/EffectiveDate").asText();
                double temp = Double.parseDouble(objectMapper.readTree(weatherResponse).at("/DailyForecasts").get(0).at("/Temperature/Minimum/Value").asText());
                String description = objectMapper.readTree(weatherResponse).at("/Headline/Text").asText();


                //Weather weather = objectMapper.readValue(weatherResponse, Weather.class);
                System.out.println("Дата: " + date);
                System.out.println("Температура: " + temp);
                System.out.println("Описание: " + description);
                System.out.println();

                dataBaseRepository.saveWeatherToDataBase(new Weather(nameCity , date, temp));

                break;

            case FIVE_DAYS:
                HttpUrl httpUrl2 = new HttpUrl.Builder()
                        .scheme(PROTOCOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .build();

                Request request2 = new Request.Builder()
                        .url(httpUrl2)
                        .build();

                Response fiveDayForecastResponse = okHttpClient.newCall(request2).execute();
                String weatherResponse5 = fiveDayForecastResponse.body().string();

                String date1 = objectMapper.readTree(weatherResponse5).at("/Headline/EffectiveDate").asText();
                String temp1 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(0).at("/Temperature/Minimum/Value").asText();
                String description1 = objectMapper.readTree(weatherResponse5).at("/Headline/Text").asText();

                String date2 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(1).at("/Date").asText();
                String temp2 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(1).at("/Temperature/Minimum/Value").asText();
                String description2 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(1).at("/Day/IconPhrase").asText();

                String date3 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(2).at("/Date").asText();
                String temp3 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(2).at("/Temperature/Minimum/Value").asText();
                String description3 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(2).at("/Day/IconPhrase").asText();

                String date4 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(3).at("/Date").asText();
                String temp4 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(3).at("/Temperature/Minimum/Value").asText();
                String description4 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(3).at("/Day/IconPhrase").asText();

                String date5 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(4).at("/Date").asText();
                String temp5 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(4).at("/Temperature/Minimum/Value").asText();
                String description5 = objectMapper.readTree(weatherResponse5).at("/DailyForecasts").get(4).at("/Day/IconPhrase").asText();


                System.out.println("Дата: " + date1);
                System.out.println("Температура: " + temp1);
                System.out.println("Описание: " + description1);
                System.out.println("-------------------------------");
                System.out.println();

                System.out.println("Дата: " + date2);
                System.out.println("Температура: " + temp2);
                System.out.println("Описание: " + description2);
                System.out.println("-------------------------------");
                System.out.println();

                System.out.println("Дата: " + date3);
                System.out.println("Температура: " + temp3);
                System.out.println("Описание: " + description3);
                System.out.println("-------------------------------");
                System.out.println();

                System.out.println("Дата: " + date4);
                System.out.println("Температура: " + temp4);
                System.out.println("Описание: " + description4);
                System.out.println("-------------------------------");
                System.out.println();

                System.out.println("Дата: " + date5);
                System.out.println("Температура: " + temp5);
                System.out.println("Описание: " + description5);
                System.out.println("-------------------------------");
                System.out.println();


                //System.out.println(weatherResponse5);


                break;
        }


    }
    public List<Weather> getSavedToDBWeather() {
        return dataBaseRepository.getSavedToDBWeather();
    }
    private String detectCityKey(String selectCity) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();
        Response cityResponse = okHttpClient.newCall(request).execute();
        String weatherResponse2 = cityResponse.body().string();

        String cityKey = objectMapper.readTree(weatherResponse2).get(0).at("/Key").asText();
        nameCity = objectMapper.readTree(weatherResponse2).get(0).at("/LocalizedName").asText();


        System.out.println(cityKey);
        System.out.println("Город: " + nameCity);
        System.out.println();

        //System.out.println(weatherResponse2);

        return cityKey;
    }

    public static void main(String[] args) throws NullPointerException, IOException {
        //AccuweatherModel accuweatherModel = new AccuweatherModel();
        //accuweatherModel.getWeather("saint Petersburg", Period.FIVE_DAYS);
        UserInterfaceView userInterfaceView = new UserInterfaceView();
        userInterfaceView.runInterface();

        //Weather weatherFromFile = objectMapper.readValue()


    }


}



