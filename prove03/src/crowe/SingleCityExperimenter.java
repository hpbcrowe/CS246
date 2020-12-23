package crowe;

import java.io.IOException;
import java.util.Scanner;

public class SingleCityExperimenter {

    public void singleCityForecast() {
        WeatherDataLoader loader = new WeatherDataLoader();

        try {
            System.out.print("Enter city: ");
            Scanner scanner = new Scanner(System.in);
            String city = scanner.next();

            // This calls
            WeatherConditions conditions = loader.getWeather(city);

            System.out.println("Name: " + conditions.getName());
            System.out.println("Measurements: " + conditions.getMeasurements().toString());
            System.out.println();

            WeatherForecast forecast = loader.getForecast(city);
            printForecast(forecast);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printForecast(WeatherForecast forecast) {
        System.out.println("Forecast information:");

        for (WeatherForecastItem item : forecast.getForecastItems()) {
            String time = item.getDateText();
            float temp = item.getMeasurements().get("temp");

            String conditions = "";
            if (item.getDescriptions().size() > 0) {
                conditions = item.getDescriptions().get(0).getDescription();
            }

            float wind = item.getWind().get("speed");

            System.out.println(String.format("Time: %s, Temp: %sF, Conditions: %s, Wind Speed: %smph",
                    time, temp, conditions, wind));
        }
    }
}
