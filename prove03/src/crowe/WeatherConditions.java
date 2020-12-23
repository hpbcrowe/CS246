package crowe;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/***********************************************************************************
*create a WeatherConditions class that can hold some of the information you are retrieving back.
*To start with, it should contain:
*id
*name
*main
*Notice that id is an integer, name is a String.
 ***********************************************************************************/
public class WeatherConditions {
   private String id;
   private String name;

@SerializedName("main")
  public Map<String, Float> measurements;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Float> getMeasurements(){
        return measurements;
    }

    public void setMeasurements(Map<String, Float> measurements) {
        this.measurements = measurements;
    }

    /************************************************************************************
*  WEATHERCONDITIONS
*  non default constructor
*
**************************************************************************************/

    public WeatherConditions(String id, String name){
        this.id = id;
        this.name = name;
        this.measurements = new HashMap<>();
    }
}
