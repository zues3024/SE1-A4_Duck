package headfirst.designpatterns.observer.weather;
	
public class WeatherTodayDisplay implements Observer, DisplayElement {
	private String wind;
	private float dewPoint;
	private float uvIndex;
	private WeatherData weatherData;

	public WeatherTodayDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure, String wind, float dewPoint, float uvIndex) {
		this.wind = wind;
		this.dewPoint = dewPoint;
		this.uvIndex = uvIndex;
		display();
	}
	
	public void display() {
		System.out.println("Weather Today: The wind speed is " + wind
			+ ", dew point is " + dewPoint + "% and UV index is " + uvIndex);
	}
}
