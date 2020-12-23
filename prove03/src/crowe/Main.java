package crowe;
import com.google.gson.Gson;


public class Main {

    public static void main(String[] args)  {

            System.out.println("Single City Experiments:");
            new SingleCityExperimenter().singleCityForecast();

            System.out.println("\n\nMultiple City Experiments:");
            new MultipleCityExperimenter().compareCityList();
        }
    }

