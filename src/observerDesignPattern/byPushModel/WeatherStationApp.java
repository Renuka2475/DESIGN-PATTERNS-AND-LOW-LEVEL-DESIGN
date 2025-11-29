package observerDesignPattern.byPushModel;

public class WeatherStationApp {
    public static void main(String args[]){
        WeatherObserverable weatherStation = new WeatherStation();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(foreCastDisplay);

        weatherStation.setWeatherReadings(30.4f, 65f);
        weatherStation.removeObserver(currentDisplay);


    }
}
