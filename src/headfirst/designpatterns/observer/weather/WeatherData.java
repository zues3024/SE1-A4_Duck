package headfirst.designpatterns.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	private String wind;
	private float dewPoint;
	private int uvIndex;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure, wind, dewPoint, uvIndex);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure, String wind, float dewPoint, int uvIndex) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.wind = wind;
		this.dewPoint = dewPoint;
		this.uvIndex = uvIndex;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	public String getWind() {
		return wind;
	}

	public float getDewPoint() {
		return dewPoint;
	}

	public int getUvIndex() {
		return uvIndex;
	}

}
