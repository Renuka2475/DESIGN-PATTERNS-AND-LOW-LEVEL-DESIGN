package observerDesignPattern.byPushModel;

public interface WeatherObserverable {
    public void addObserver(WeatherObserver weatherObserver);
    public void removeObserver(WeatherObserver weatherObserver);
    public void notifyObserver();
    public void setWeatherReadings(float tempature, float humidity);


}
