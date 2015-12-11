public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherDataSubject = new WeatherData();
		CurrentWeatherDisplay display = new CurrentWeatherDisplay(weatherDataSubject);
		
		weatherDataSubject.setMeasurements(80, 30);
		weatherDataSubject.setMeasurements(70, 10);
	}
}
