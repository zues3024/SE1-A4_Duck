package headfirst.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		WeatherTodayDisplay weatherTodayDisplay = new WeatherTodayDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f, "15mph nw", 65.1f, 1);
		weatherData.setMeasurements(82, 70, 29.2f, "10mph nw", 65.3f, 0);
		weatherData.setMeasurements(78, 90, 29.2f, "11mph nw", 75.1f, 1);
		
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f, "15mph nw", 65.1f, 2);
	}
}
