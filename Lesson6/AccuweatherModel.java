package JavaCore.Lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class AccuweatherModel implements WeatherModel {
    private static final String PROTOCOL = "http";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "pXJd8MokcZCdrd2MsoGl2DBZAyCa0zvv";
    //"29udJvTFlos1t8jWoiU2hfBRYFQh4nkc";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String DETAILS = "details=true";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void getWeather(String selectedCity, Period period) throws IOException {
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

                System.out.println(weatherResponse);

//                String weather = objectMapper.readTree(weatherResponse).get(0).at("/Date").asText();
//                System.out.println(weather);

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

                System.out.println(weatherResponse5);



                break;
        }


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
        String nameCity = objectMapper.readTree(weatherResponse2).get(0).at("/LocalizedName").asText();


        System.out.println(cityKey);
        System.out.println("Город: " + nameCity);

        //System.out.println(weatherResponse2);

        return cityKey;
    }

    public static void main(String[] args) throws NullPointerException, IOException {
       AccuweatherModel accuweatherModel = new AccuweatherModel();
       accuweatherModel.getWeather("saint Petersburg", Period.FIVE_DAYS);
        //UserInterfaceView userInterfaceView = new UserInterfaceView();
        //userInterfaceView.runInterface();


    }


}



