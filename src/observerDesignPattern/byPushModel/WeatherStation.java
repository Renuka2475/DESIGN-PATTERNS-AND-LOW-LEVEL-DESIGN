package observerDesignPattern.byPushModel;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObserverable{

    private List<WeatherObserver> users; //Here users are nothing but observers.
    private WeatherData weatherData;

    public WeatherStation(){
        this.users = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        users.add(observer);

    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        users.remove(weatherObserver);
    }

    @Override
    public void notifyObserver() {
        for(WeatherObserver observer : users){
            observer.update(weatherData);
        }



    }

    @Override
    public void setWeatherReadings(float tempature, float humidity) {
       this.weatherData = new WeatherData(tempature,humidity);
       notifyObserver();
     }

     public WeatherData getWeatherData(){
        return weatherData;
     }
}
