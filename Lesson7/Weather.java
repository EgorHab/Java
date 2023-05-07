package JavaCore.Lesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private String Text;
    private String EffectiveDate;
    private String Temperature;

    public Weather(String Text, String EffectiveDate, String Temperature) {
        this.Text = Text;
        this.EffectiveDate = EffectiveDate;
        this.Temperature = Temperature;
    }

    public Weather() {
    }

    public String getText() {
        return Text;
    }


    public void setText(String text) {
        Text = text;
    }

    public String getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(String endDate) {
        EffectiveDate = EffectiveDate;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "Text='" + Text + '\'' +
                ", EffectiveDate='" + EffectiveDate + '\'' +
                ", Temperature='" + Temperature + '\'' +
                '}';
    }

//    {
//        "Headline":{
//        "EffectiveDate":"2023-05-07T13:00:00+03:00", "EffectiveEpochDate":1683453600, "Severity":7, "Text":
//        "Cool Sunday afternoon", "Category":"cold", "EndDate":"2023-05-07T19:00:00+03:00", "EndEpochDate":
//        1683475200, "MobileLink":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?lang=en-us", "Link":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?lang=en-us"
//    },"DailyForecasts":[{
//        "Date":"2023-05-07T07:00:00+03:00", "EpochDate":1683432000, "Temperature":{
//            "Minimum":{
//                "Value":33.0, "Unit":"F", "UnitType":18
//            },"Maximum":{
//                "Value":49.0, "Unit":"F", "UnitType":18
//            }
//        },"Day":{
//            "Icon":6, "IconPhrase":"Mostly cloudy", "HasPrecipitation":false
//        },"Night":{
//            "Icon":33, "IconPhrase":"Clear", "HasPrecipitation":false
//        },"Sources":["AccuWeather"],"MobileLink":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=1&lang=en-us", "Link":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=1&lang=en-us"
//    },{
//        "Date":"2023-05-08T07:00:00+03:00", "EpochDate":1683518400, "Temperature":{
//            "Minimum":{
//                "Value":36.0, "Unit":"F", "UnitType":18
//            },"Maximum":{
//                "Value":55.0, "Unit":"F", "UnitType":18
//            }
//        },"Day":{
//            "Icon":6, "IconPhrase":"Mostly cloudy", "HasPrecipitation":false
//        },"Night":{
//            "Icon":36, "IconPhrase":"Intermittent clouds", "HasPrecipitation":false
//        },"Sources":["AccuWeather"],"MobileLink":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=2&lang=en-us", "Link":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=2&lang=en-us"
//    },{
//        "Date":"2023-05-09T07:00:00+03:00", "EpochDate":1683604800, "Temperature":{
//            "Minimum":{
//                "Value":40.0, "Unit":"F", "UnitType":18
//            },"Maximum":{
//                "Value":58.0, "Unit":"F", "UnitType":18
//            }
//        },"Day":{
//            "Icon":6, "IconPhrase":"Mostly cloudy", "HasPrecipitation":false
//        },"Night":{
//            "Icon":38, "IconPhrase":"Mostly cloudy", "HasPrecipitation":false
//        },"Sources":["AccuWeather"],"MobileLink":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=3&lang=en-us", "Link":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=3&lang=en-us"
//    },{
//        "Date":"2023-05-10T07:00:00+03:00", "EpochDate":1683691200, "Temperature":{
//            "Minimum":{
//                "Value":45.0, "Unit":"F", "UnitType":18
//            },"Maximum":{
//                "Value":60.0, "Unit":"F", "UnitType":18
//            }
//        },"Day":{
//            "Icon":7, "IconPhrase":"Cloudy", "HasPrecipitation":false
//        },"Night":{
//            "Icon":38, "IconPhrase":"Mostly cloudy", "HasPrecipitation":false
//        },"Sources":["AccuWeather"],"MobileLink":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=4&lang=en-us", "Link":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=4&lang=en-us"
//    },{
//        "Date":"2023-05-11T07:00:00+03:00", "EpochDate":1683777600, "Temperature":{
//            "Minimum":{
//                "Value":45.0, "Unit":"F", "UnitType":18
//            },"Maximum":{
//                "Value":62.0, "Unit":"F", "UnitType":18
//            }
//        },"Day":{
//            "Icon":3, "IconPhrase":"Partly sunny", "HasPrecipitation":false
//        },"Night":{
//            "Icon":38, "IconPhrase":"Mostly cloudy", "HasPrecipitation":false
//        },"Sources":["AccuWeather"],"MobileLink":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=5&lang=en-us", "Link":
//        "http://www.accuweather.com/en/ru/moscow/294021/daily-weather-forecast/294021?day=5&lang=en-us"
//    }]}


}



