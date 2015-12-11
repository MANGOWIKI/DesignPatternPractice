public class CurrentWeatherDisplay implements Observer {
	private float temp;
	private float pressure;
	private Subject weatherData;
	
	public CurrentWeatherDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float pressure) {
		this.temp = temp;
		this.pressure = pressure;
		display();
	}
	
	public void display() {
		System.out.println("Temperature: " + this.temp + " Pressure: " + this.pressure);
	}

}
